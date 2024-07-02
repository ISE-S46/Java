package bruh;

public class ex12 {

	public static void main(String[] args) {
		String w = "racecar", reversew = "";
	    
	    int wl = w.length();

	    for (int i = (wl - 1); i >=0; --i) {
	      reversew = reversew + w.charAt(i);
	    }

	    if (w.toLowerCase().equals(reversew.toLowerCase())) {
	      System.out.println(w + " string is a Palindrome.");
	    }
	    else {
	      System.out.println(w + " string is not a Palindrome.");
	    }
	}
}
