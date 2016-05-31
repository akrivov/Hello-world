import javax.swing.*; // импортируем весь свинг, дабы не заморачиваться(мы ведь только учимся))
import java.awt.*; // и весь авт аналогично
import java.awt.event.ActionListener;
 
public class Frame { // задаст внешний вид кнопок нашего окна.
	
    public JPanel createContentPane (){
          
        // We create a bottom JPanel to place everything on.
        // создаём панель, а всё остальное размещаем уже на этой панели
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
 
       // добавим текст
        JLabel blueLabel = new JLabel("<html> <br>Управление потоками<br></html>");
        blueLabel.setLocation(-60, -30); /* это координаты метки - текста (измените их если 
        тест не виден*/
        blueLabel.setSize(300, 100); // это размер области с текстом
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue); // Это цвет
        totalGUI.add(blueLabel);
        // Создаём кнопку
        
        JButton greenButton = new JButton("Старт");
        greenButton.setLocation(50, 200); // это координаты кнопки
        greenButton.setSize(150,30 ); // это размер кнопки
        totalGUI.add(greenButton);
        greenButton.setForeground(Color.green);
        ActionListener startActionListener = new StartActionListener();
        greenButton.addActionListener(startActionListener);
  
        JButton redButton = new JButton("Стоп");
        redButton.setLocation(200, 200); // это координаты кнопки
        redButton.setSize(150,30 ); // это размер кнопки
        totalGUI.add(redButton);
        redButton.setForeground(Color.red);
        ActionListener stopActionListener = new StopActionListener();
        redButton.addActionListener(stopActionListener);
          
        totalGUI.setOpaque(true);
        return totalGUI;
    }
}