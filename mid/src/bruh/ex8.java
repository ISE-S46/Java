package bruh;

public class ex8 {

	public static void main(String[] args) {
		int x=1;
		int n,i;
		do {
			i=0;
			n=2;
			while(n <= x/2) {
			if(x%n==0) {
				i++;
				break;
				}
			n++;
			}
		if(i==0&&x!=1) {
			System.out.print(x+" ");
			}
		x++;
		}while(x<=100);
		
	}

}
