package bruh;

public class array3d {

	public static void main(String[] args) {
		int[][][] array1= {{{1,2},{3,4}},
						  {{2,2},{2,2}}};
		int[][][] array2= {{{2,2},{2,2}},
						  {{2,3},{1,4}}};
		int x,y,z;
		x=2;
		y=2;
		z=2;
		int[][][] array3= new int[x][y][z];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++){ 
				for(int k = 0; k < z; k++){      
					array3[i][j][k] = array1[i][j][k]+array2[i][j][k];
					System.out.print(array3[i][j][k] + " ");  
				}
				System.out.println();
			}
			System.out.println("");
		}
	}

}
