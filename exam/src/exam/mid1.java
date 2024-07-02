package exam;

public class mid1 {

	public static void main(String[] args) {
		int a,b,c,n;
		a=0;
		b=1;
		n=10;
		System.out.print(a+" "+b+" ");
		for(int i=1;i <=n-2;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
