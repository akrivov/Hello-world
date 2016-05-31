import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class StopActionListener implements ActionListener { // обработчик событий.
	
		public void actionPerformed(ActionEvent e) {
                  //Код, который нужно выполнить при нажатии
					MyThread.finish();
             }
        }