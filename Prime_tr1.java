import static java.lang.Math.*;

class Prime_tr1 {
	
	public static void main(String args[] ) {
		int nmax = 1000;
		int p = 7;
		int index = 0;
		int a[] = new int[500];
		while( p < nmax ) {
			
			if( checkFactors(p) ) {
				a[index++] = p;
			}

			p += 2;
		}

		for( int val : a ){
			
			if( val != 0 )
				System.out.println(val);

		}


	}  // main ends here

	static boolean checkFactors( int n ) {

		int i = 3;

		while( i <= sqrt(n) ) {

			if( n%i == 0 )
				break;

			i += 2;
		}

		if( i>sqrt(n) )
			return true;		// no factors found
		else
			return false;		// found some divisor
	}

}  // class ends here