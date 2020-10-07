package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		
		int[] tab = {1,2,3};
		//skrivUt(tab);
		//tilStreng(tab);
		summer(tab);
		
		}
	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int i=0; i<=tabell.length; i++) {
			System.out.println("Tall er: " + i);
			
			//int[] skrivut = {1,2,3};
			//System.out.println(skrivut);
			//System.out.println("2");
			
		}
		// TODO

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String s = "[";
		for (int i = 0; i < tabell.length; i++) {
			s += tabell[i];
			if (i < tabell.length - 1) s += ",";
		}
		return s += "]";
		
	}

	// c)
	public static int summer(int[] tabell) {
		int total = 0;
		
		for (int i : tabell) {
			total += i;

		}
		return total;
		
	
	}
	public static int summer1(int[] tabell) {
		int i = 0;
		int total = 0;
		while (i<tabell.length) {
			total += tabell[i];
			i++;
		}
		return total;
		
	}
	public static int summer2(int[] tabell) {
		int total = 0;
		for(int i =0; i<tabell.length; i++) total += tabell[i];
		return total;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i]==tall) return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i=0; i<tabell.length; i++) {
			if (tabell[i]==tall) 
				return i;
		}
		return -1;
	}
		

	// f)
	public static int[] reverser(int[] tabell) {

		int[] p = new int[tabell.length];
		for(int i = 0; i<tabell.length; i++) {
			p[tabell.length - i -1] = tabell[i];
		}
		return p;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i<tabell.length; i++) {
			if (tabell [i]<tabell[i-1]) return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] p = new int[tabell1.length + tabell2.length];
		for(int i = 0; i<p.length; i++) {
			if(i<tabell1.length) p[i] = tabell1[i];
			else p[i] = tabell2[i-tabell1.length];
		}
		return p;
	}
	}



