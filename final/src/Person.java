class car extends Person{
	public void d() {
		String st1 = "Ferrari";
		System.out.println(st1);
	}
}
public class Person {
	String dn = "jojo";
	String dbg = "A";
	public static void main(String[] args) {
		car c = new car();
		System.out.println(c.dn);
		System.out.println(c.dbg);
		c.d();

	}

}