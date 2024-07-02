
public class test {
	public static void main(String[] args) {
		int[] idk = new int[10];
		int j=0;
		for(int i =6;i<16;i++) {
			idk[j]=i;
	     	j++;
	    }
		int k=0;
		 for(int c=1;c<=5;c++) {
	            System.out.print(c+" ");
	        }
	        System.out.println();
	     for(int a=1;a<=4;a++){
	    	 for(int b=1;b<=a;b++){
	    		 System.out.print("0 ");
	         }
	         for(int c=4;c>=a;c--){
	        	 System.out.print(idk[k]+" ");
	        	 k++;
	         }
	         System.out.println();
	         }
	}

}
