package bruh;
import java.util.Scanner;
import java.util.Random;
public class bank_code {

	public static void main(String[] args) {
		        Scanner in =new Scanner(System.in);
		        Random ran = new Random();
		        int upperbound = 3;    
		        int x = in.nextInt();//x axis
		        int y = in.nextInt();//y axis
		        int z = in.nextInt();//z axis
		        int[][][] a;
		        a = new int[x][y][z];
		        int[][][] b;
		        b = new int[x][y][z];
		        int[][][] c;
		        c = new int[x][y][z];
		        for(int k=0;k<z;k++){
		        	for(int j=0;j<y;j++){
		        			for(int i=0;i<x;i++){
		        				a[i][j][k]=ran.nextInt(upperbound);
		        			}
		        	}			
		        }
		        for(int k=0;k<z;k++){
		        for(int j=0;j<y;j++){
		        for(int i=0;i<x;i++){
		        
		            b[i][j][k] =ran.nextInt(upperbound);
		        }}}
		        for(int k=0;k<z;k++){
		        for(int j=0;j<y;j++){
		        for(int i=0;i<x;i++){
		        
		            c[i][j][k]=a[i][j][k]+b[i][j][k];
		        }}}
		        for(int k=0;k<z;k++){
		        for(int j=0;j<y;j++){
		        for(int i=0;i<x;i++){
		        
		            System.out.print(c[i][j][k]+" ");
		            if(c[i][j][k]<10){
		                System.out.print(" ");
		            }
		            if(c[i][j][k]<100){
		                System.out.print(" ");
		            }
		        }
		            System.out.println();
		        }
		            System.out.println("");
		        }
		    
	}

}
