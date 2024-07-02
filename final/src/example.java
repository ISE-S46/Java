import java.util.Scanner;
public class example {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter array value (5)");
		for(int i=0;i<5;i++) {
			try {
			int b = in.nextInt();
			a[i]=b;
			}catch(Exception E) {
				System.out.println(E);
			}
		}
		System.out.println("Enter location of elements");
		try {
			int c = in.nextInt();
			System.out.println(a[c]);	
		}catch(Exception R) {
			System.out.println(R);
		}
		
	}

}
