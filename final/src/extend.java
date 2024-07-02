class MUDA extends extend{
	void muda() {
		try {
		for(int i=0;i<10;i++) {
		System.out.print("MUDA ");
		Thread.sleep(200);
		}
		}catch(Exception R) {
			System.out.println(R);
		}
		System.out.println();
	}
}
class ORA extends extend{
	void ora() {
		try {
		for(int i=0;i<10;i++) {
		System.out.print("ORA ");
		Thread.sleep(200);
		}
		}catch(Exception R) {
			System.out.println(R);
		}
		System.out.println();
	}
}
public class extend {

	public static void main(String[] args) {
		ORA jojo = new ORA();
		MUDA dio = new MUDA();
		jojo.ora();
		dio.muda();

	}

}
