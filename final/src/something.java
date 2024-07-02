import java.util.Scanner;
public class something {
	public static void GPA(double[] a,double[] b) {
		double c = (a[0])+(a[1])+(a[2])+(a[3])+(a[4])+(a[5]);// *หน่วยกิต
		double d = c/6;
		System.out.println("GPA : "+d);
	}
	public static void grade(int[] a,double[] b) {
		double[] grade = new double[8];
		for(int i = 0;i<6;i++) {
			switch(a[i]){
				case 10:
					grade[i] = 4;
		            break;
				case 9:
					grade[i] = 4;
		            break;
				case 8:
					grade[i] = 4;
		            break;
				case 7:
					grade[i] = 3;
		        	break;
				case 6:
					grade[i] = 2;
		        	break;
				case 5:
					grade[i] = 1;
		        	break;
				default:
					grade[i] = 0;
		    	  	break;
		      		}
			}
			GPA(grade,b);
		}
	public static void id(String a,String b,String c) {
		System.out.println("name : "+a);
		System.out.println("ID : "+b);
		System.out.println("Faculty : "+c);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name :");
		String x = in.nextLine();
		System.out.println("Enter student ID :");
		String y = in.nextLine();
		System.out.println("Enter faculty :");
		String z = in.nextLine();
		System.out.println("Enter 6 couurses score");
		int[] g = new int[6];
		for(int i = 0;i<6;i++) {
			int gr = in.nextInt();
			if(gr<=100&&gr>=0) {
				g[i]=gr/10;
			}else {
				System.out.println("Error");
				break;
			}
		}
		double[] cg = new double[5];
		id(x,y,z);
		grade(g,cg);
	}

}