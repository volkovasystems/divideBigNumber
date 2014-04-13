package divideBigNumber;

import java.math.BigInteger;

public class divideBigNumber{
	public static void main( String... parameters ){
		try{
			BigInteger quotient = divideBigNumber( parameters );
			System.out.print( quotient.toString( ) );
		}catch( Exception exception ){
			System.err.print( exception.getMessage( ) );
		}
	}

	public static final BigInteger divideBigNumber( String... numbers ){
		BigInteger quotient = new BigInteger( numbers[ 0 ] );
		for( int index = 1; index < numbers.length; index++ ){
			quotient = quotient.divide( new BigInteger( numbers[ index ] ) );	
		}
		return quotient;
	}
}