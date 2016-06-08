import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.generic.NEW;



public class TabbedPane extends JFrame {

    

    public TabbedPane() {

        

        setTitle("Tabbed Pane");

        JTabbedPane jtp = new JTabbedPane();

        getContentPane().add(jtp);

        
        JPanel jp1 = new JPanel();

        JPanel jp2 = new JPanel();

        JLabel label1 = new JLabel();

        label1.setText("Управление потоком");

        JLabel label2 = new JLabel();
        label2.setText("You are in area of Tab2");
        

          
        
        JButton greenButton = new JButton("Старт");
        jp1.add(greenButton);
        jp1.add(label1);
        greenButton.setForeground(Color.green);
        ActionListener startActionListener = new StartActionListener();
        greenButton.addActionListener(startActionListener);
        

   
        JButton redButton = new JButton("Стоп");
        jp1.add(redButton);
        redButton.setForeground(Color.red);
        ActionListener stopActionListener = new StopActionListener();
        redButton.addActionListener(stopActionListener);
        
        
        // Таблица во второй вкладке
       
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object[8];
        
        columnsName[0] = "Номер";
        columnsName[1] = "Фамилия";
        columnsName[2] = "Имя";
        columnsName[3] = "Отчество";
        columnsName[4] = "Подгруппа";
        columnsName[5] = "пол";
        columnsName[6] = "Годы учебы";
        columnsName[7] = "Год рождения";
        
        model.setColumnIdentifiers(columnsName);
        
        Object[] rowData = new Object[8];
        for(int i = 0; i< JavaToMysql.getStudents().size();i++){
        	
        	rowData[0] = JavaToMysql.getStudents().get(i).getId();
        	rowData[1] = JavaToMysql.getStudents().get(i).getSurName();
        	rowData[2] = JavaToMysql.getStudents().get(i).getFirstName();
        	rowData[3] = JavaToMysql.getStudents().get(i).getPatronymic();
        	rowData[4] = JavaToMysql.getStudents().get(i).getGroupId();
        	rowData[5] = JavaToMysql.getStudents().get(i).getSex();
        	rowData[6] = JavaToMysql.getStudents().get(i).getDateOfBirth();
        	rowData[7] = JavaToMysql.getStudents().get(i).getEducationYear();
        	
        	model.addRow(rowData);
        }
        table.setModel(model);
        JPanel panel = new JPanel();
        JScrollPane pane = new JScrollPane(table);
        panel.setLayout(new BorderLayout());
        panel.add(pane,BorderLayout.CENTER);
        
        
        
        
        
         
        jp2.add(panel);
        

        jtp.addTab("Tab1", jp1);

        jtp.addTab("Tab2", jp2);
        

       

    }
}

        
