import java.util.Scanner;
public class ahh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] a = new String[5];
		int[] b = new int[5];
		int[] e = new int[5];
		for(int i = 0;i<5;i++) {
			String c = in.nextLine();
			a[i] = c;
		}
		for(int i = 0;i<5;i++) {
			switch(a[i]) {
				case "A":
					b[i]= 1;
					e[i]= 1;
					break;
				case "J":
					b[i]= 10;
					e[i]= 11;
					break;
				case "Q":
					b[i]= 10;
					e[i]= 12;
					break;
				case "K":
					b[i]= 10;
					e[i]= 13;
					break;
				default:
					b[i] = Integer.parseInt(a[i]);  
		    	  	break;
			}
			
		}
		if( e[0]>e[1] && e[0]>e[2] && e[0]>e[3] && e[0]>e[4]) {
			System.out.println(a[0]);
		}else if(e[1]>e[0] && e[1]>e[2] && e[1]>e[3] && e[1]>e[4]) {
			System.out.println(a[1]);
		}else if(e[2]>e[0] && e[2]>e[1] && e[2]>e[3] && e[2]>e[4]) {
			System.out.println(a[2]);
		}else if(e[3]>e[0] && e[3]>e[1] && e[3]>e[2] && e[3]>e[4]) {
			System.out.println(a[3]);
		}else if(e[4]>e[0] && e[4]>e[1] && e[4]>e[2] && e[4]>e[3]) {
			System.out.println(a[4]);
		}
		int w,x,y,z;
		w = b[0]+b[1]+b[2]+b[3]+b[4];
		x = b[0]+b[1]+b[2]+b[3];
		y = b[0]+b[1]+b[2];
		z = b[0]+b[1];
		if(z >= 16 && z<=21) {
			System.out.println(z);
		}else if(y >= 16 && y<=21) {
			System.out.println(y);
		}else if(x >= 16 && x<=21) {
			System.out.println(x);
		}else if(w >= 16 && w<=21) {
			System.out.println(z);
		}else {
			System.out.println("busted");
		}
	}

}