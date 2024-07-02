class booking implements Runnable{
	Thread t;
	String tname;
	booking(String a){
		tname = a;
		System.out.println(tname+" booking requested");
		System.out.println(tname+" booking started");
	}
	public void run() {
		try {
			for(int i=10;i>0;i--) {
				System.out.println(tname+" "+i+" seconds remain");
				System.out.println("------------------------");
				Thread.sleep(1000);
			}
			System.out.println(tname+" booking complete");
		}catch(Exception e) {
			System.out.println(tname+" booking error");
		}
	}
	public void start() {
		if(t==null) {
			t = new Thread(this, tname);
			t.start();
		}
	}
}

public class i312100f {

	public static void main(String[] args) {
		booking u1 = new booking("User 1");
		u1.start();
		booking u2 = new booking("User 2");
		u2.start();
		
	}

}
