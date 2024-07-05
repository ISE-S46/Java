import java.util.Scanner;

public class F {
    public static void main(String[] args){
		String[] food = {"moo","hed","ped"};
		int[] fw = {20,50,100};
        System.out.println("Enter food type");
		Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int y = 0;
		for(int i=0;i<3-1;i++) {
			if( x.equals(food[i])) {
				y = fw[i];
			}
		}
        System.out.println(y);
    }
}
