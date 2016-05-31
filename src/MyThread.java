import java.util.Date;

//Создание второго потока
class MyThread extends Thread {
	
	
	volatile static boolean finish = false;
	volatile static boolean play = true;
	
	 public static void finish()	
	{
		 finish = !finish;
		 play = true;
	}
	
	// Перерпределяем метод run
	public void run(){
		do
		{
				if(play){
					System.out.println("Стартуем");
					play = false;
					for (int i = 0; i <60; i++) {
						if(!finish) {
						Date date = new Date();
						
							System.out.println(date.toString());	
							try {
								sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							}
					else {
						System.out.println("Прерван");
						return;
				
				}		
			}
		}
				else{
					System.out.println("Поток уже запущен");
						}
	}
		while(true); 
}
}		