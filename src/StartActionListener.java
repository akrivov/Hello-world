import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.Finishings;
 
public class StartActionListener implements ActionListener { // обработчик событий.
	
	static MyThread mSecondThread;
	
        public void actionPerformed(ActionEvent e) {
                  //Код, который нужно выполнить при нажатии
        	if(MyThread.play){
        		MyThread.finish = false; 
        		mSecondThread = new MyThread();	
        		mSecondThread.start();
        	}
        	else{
        		System.out.println("Уже запущено");
        	}
        	}
        }