package bruh;
import java.util.Scanner;
public class ex15 {
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] test = {1,2,3,4,5};
		int a = in.nextInt();
		System.out.println(a+" is found at index: "+linearSearch(test, a));

	}

}
