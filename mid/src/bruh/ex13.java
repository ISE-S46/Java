package bruh;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) { 
		Scanner in=new Scanner(System.in);
		int x1,y1,x2,y2;
		x1 = 2;
		y1 = 2;
		x2 = 2;
		y2 = 2;
		if (x1 != y2) {
			System.out.println("Matrix multiplication is impossible");
		    } else{
		        int a[][] = new int[x1][y1];
		        int b[][] = new int[x2][y2];
		        int c[][] = new int[x1][y2];
		        System.out.println("Enter values for matrix A");
		        for (int i = 0; i < x1; i++) {
		            for (int j = 0; j < y1; j++) 
		                a[i][j] = in.nextInt();
		        }
		        System.out.println("Enter values for matrix B");
		        for (int i = 0; i < x2; i++) {
		            for (int j = 0; j < y2; j++) 
		                b[i][j] = in.nextInt();
		        }
		        for(int i = 0; i < x1; i++) {    
		            for(int j = 0; j < y2; j++){    
		              c[i][j]=0;      
		              for(int k = 0; k < y1; k++){      
		                c[i][j] += a[i][k] * b[k][j];      
		              }
		              System.out.print(c[i][j] + " ");  
		            }
		            System.out.println();
		        }    
		    }
		    
	}

}
