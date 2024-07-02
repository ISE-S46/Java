package Araidee;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		String[] food = {"moo","hed","ped"};
		int[] fw = {20,50,100};
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		for(int i=0;i<food.length;i++) {
			if(x == food[i]) {
				System.out.println(fw[i]);
			}
		}
	}

}
