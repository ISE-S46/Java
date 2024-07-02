import java.util.Scanner;
public class fb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] Ulist1 = new String[5];
		Ulist1[0] = "Intel"; 
		Ulist1[1] = "AMD";
		Ulist1[2] = "Nvidia";
		Ulist1[3] = "Apple";
		int a = Ulist1.length;
		System.out.println("You friend list : ");
		for(int i=0;i<a;i++) {
			if(Ulist1[i] != null) {
			System.out.println(Ulist1[i]);
			}
		}
		System.out.println();
		System.out.println("Enter freind name to add");
		String add = in.nextLine();
		System.out.println("Succesfully add "+add);
		System.out.println();
		Ulist1[4] = add; 	// adding friend to friend list
		System.out.println("You have mutual friend with Intel : ");
		String[] Intel = {"Samsung","AMD","Asus","Apple","MSI"};
		for(int i=0;i<a;i++) {
			if(Ulist1[i].equals(Intel[i])) { 	// find mutual friend
				System.out.println(Intel[i]);
			}
		}
		System.out.println();
		System.out.println("Enter freind name to Remove/Unfollowing");
		String del = in.nextLine();
		for(int i=0;i<a;i++) {
			if(del.equals(Ulist1[i])) { 	// remove friend from friend list
				Ulist1[i] =  null;
			}
		}
		System.out.println("Succesfully Remove/Unfollowing "+del);

	}

}
