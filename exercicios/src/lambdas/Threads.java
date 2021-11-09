package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		
		//implamentado com classe externa
		Runnable trabalho1 = new Trabalho1();
		
		//implementado nessa classe
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Trabalho #02");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};
		
		//também é possível utilizar lambdas com thread
		Runnable trabalho3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Trabalho #03");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}			
		};
		
		
		//Thread é um processo que pode correr paralelamente com outro a definição é feita pelo processador
				
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
