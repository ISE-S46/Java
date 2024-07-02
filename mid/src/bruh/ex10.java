package bruh;

public class ex10 {

	public static void main(String[] args) {
		int a,b,c,d,e;
		a=50;
		b=40;
		c=40;
		d=60;
		e=10;
		if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) {
	        System.out.println (a);
	    } else if ((b >= c) && (b >= d) && (b >= e)) {      
	        System.out.println ( b);
	    } else if ((c >= d) && (c >= e)) {                  
	        System.out.println ( c);
	    } else if (d >= e) {                                
	        System.out.println ( d);
	    } else {                                            
	        System.out.println (e);
	    }

	}

}
