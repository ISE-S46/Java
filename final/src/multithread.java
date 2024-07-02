class timer implements Runnable{
	private Thread t;
	private String tname;
	timer(String name){
		tname = name;
		System.out.println(tname+" Start");
	}
	public void run() {
		try {
			for(int i=1;i<11;i++) {
				System.out.println(tname+" "+i+" second have passed");
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(tname+" run out of time");
	}
	public void start() {
		if(t==null) {
			t = new Thread(this, tname);
			t.start();
		}
	}
}

public class multithread {

	public static void main(String[] args) {
		timer a1 = new timer("A1");
		a1.start();
		timer a2 = new timer("A2");
		a2.start();
	}

}
