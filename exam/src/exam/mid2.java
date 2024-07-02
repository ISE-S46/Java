package exam;

public class mid2 {

	public static void main(String[] args) {
		for(int x=1;x<=4;x++)
		{
			for(int y=4;y>=x;y--)
			{
				System.out.print("0");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
