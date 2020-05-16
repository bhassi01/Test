package Group_Questions;

public class diagonal_sum {

	static int[][] ar = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };
	static int row = ar.length;
	static int column = ar[0].length;
	static int diagonal1, diagonal2;
	static int k = column-1;

	public static void diagonal_sum(int[][] ar) {
		System.out.println( "rows"+row);
		System.out.println("column"+column);

		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <=column-1; j++) {
				System.out.println("elements are --->" +ar[i][j]);
				if (i == j) {
					//System.out.println("adding to diagonal1---->"+ar[i][j]);


					diagonal1 = diagonal1+ar[i][j];
				}
				System.out.println(+diagonal1);

			}
		if (k>=0) {
			//System.out.println("i"+i+"k "+k );
			diagonal2 = diagonal2+ar[i][k];
			//System.out.println("adding to diagonal2--->"+ar[i][k]);
			k--;
			System.out.println(+diagonal2);}

		//}

	}

	System.out.println(diagonal1 - diagonal2);

}

public static void main(String args[]) {


	diagonal_sum(ar);
}
}
