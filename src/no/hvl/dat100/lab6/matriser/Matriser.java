package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
//public static void main(String[] args) {
		
//		int[][] mat1 = { 
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		int[][] mat2 = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//						
//		
//		skrivUt(mat1);
//		tilStreng(mat1);
//		skaler(mat1);
//		erLik(mat1);
//}
		
		
		

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad: matrise) {
			for(int j: rad) {
				if (j < 100) System.out.print(" ");
				if (j < 10) System.out.print(" ");
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
		for(int[] array : matrise) {
			for(int i : array) {
				s += (i+" ");
			}
			s += "\n";
		}
		return s;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int number = 0;
		int nyMatrise[][] = new int[matrise.length][matrise[0].length];
		for (int i = 0; i<nyMatrise.length; i++) {
			for (int j = 0; j<nyMatrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * number;
			}
		}
		skrivUt(nyMatrise);
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length != b.length)return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) return false;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;
		}
		
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
