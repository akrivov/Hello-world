import javax.swing.*; 

public class Program
{
	static MyThread mSecondThread;
	
//sdfsdfsdf
	
	
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true); 
        JFrame frame = new JFrame("Управление потоком");
        
  
        //Create and set up the content pane.
        Frame demo = new Frame();
        frame.setContentPane(demo.createContentPane()); // запускаем метод описывающий внешний вид
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);	
	}

}

