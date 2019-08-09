package scheduler;
//Alaa Harajli


public class ImplementJobWorkable implements JobWorkable {

	@Override
	public void doWork() {
		System.out.println(Thread.currentThread().getName() + "  is working");
		
	}

}
