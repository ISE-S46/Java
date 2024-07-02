package bruh;
import java.util.Scanner;
import java.util.Random;
public class ex4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random lol=new Random();
		int x = in.nextInt();
		int y = in.nextInt();
		int[][] bruh = new int[x][y];
		for(int b=0;b<y;b++) {
			for(int a=0;a<x;a++) {
				System.out.print(bruh[a][b]);
			}
			System.out.println();
		}
		

	}

}
