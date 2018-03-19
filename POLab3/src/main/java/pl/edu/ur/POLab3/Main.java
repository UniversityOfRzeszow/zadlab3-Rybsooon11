import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO 1.4, 1.7,
		// TODO 2.2
		// TODO 3.3, 3.4
		// First();
		// Second();
		//Third();
		//Fourth();
		//Fifth();
	}

	public static void First() {
		byte a = 127, b;
		b = (byte) (a >> 3);
		System.out.println(b);

	}

	public static void Second() {
		int x = 1, y = 14, pom;
		pom = x ^ y;
		Dec_to_bin(x);
		System.out.println("\n");
		Dec_to_bin(y);
		System.out.println("\n");
		Dec_to_bin(pom);

		int z = 5, pom2;
		Dec_to_bin(z);
		System.out.println("\n");
		pom2 = ~z;
		Dec_to_bin(pom2);
	}

	public static void Third()
    {
    	// 1
    	String str = "Java";
    	char[] actualCharArray = str.toCharArray();
    	System.out.println(actualCharArray);
    	
    	// 2
    	String Str1 = new String ("Welcome to example");
    	
    	try {
    		String Str2 = new String( Str1.getBytes("UTF-8"));
    		System.out.println("Returned Value " + Str2);
    		Str2 = new String (Str1.getBytes("ISO-8859-1"));
    		System.out.println("Returned Value " + Str2 );
    	} catch ( UnsupportedEncodingException e) {
    			System.out.println("Unsupported character set");
    	}
    	
    	// 3
    	Boolean b1, b2;
    	boolean res;
    	
    	b1 = new Boolean(true);
    	b2 = new Boolean(false);
    	
    	res = b1.equals(b2);
    	
    	String strx = "b1:" +b1+ " and b2:" +b2+ " are equal is " + res;
    	System.out.println(strx);
    	
    	// 4
    	String zxc1 = new String("This is really not immutable!!");
    	String zxc2 = zxc1;
    	String zxc3 = new String("This is really not immutable!!");
    	String zxc4 = new String("This is REALLY NOT IMMUTABLE!!");
    	boolean retVal;
    	
    	retVal = zxc1.equals(zxc2);
    	System.out.println("Returned Value = "+ retVal);
    	
    	retVal = zxc1.equals(zxc3);
    	System.out.println("Returned Value = "+ retVal);
    	
    	retVal = zxc1.equalsIgnoreCase(zxc4);
    	System.out.println("Returned Value = "+ retVal);
    	
    	// 5
    	String cxz1 = "String method tutorial";
    	String cxz2 = "compareTo method example";
    	
    	int qaz1 = cxz1.compareTo(cxz2);
    	System.out.println("cxz1 & czx2 comparison: "+qaz1);
    	
    	// 6
    	String wqe1 = "Strings are immutable";
    	String wqe2 = "Strings are immutable";
        String wqe3 = "Integers are not immutable";

        int result = wqe1.compareToIgnoreCase( wqe2 );
        System.out.println(result);

        result = wqe2.compareToIgnoreCase( wqe3 );
        System.out.println(result);

        result = wqe3.compareToIgnoreCase( wqe1 );
        System.out.println(result);
        
        // 7
        String rty = "This is tutorialspoint";
        
        System.out.println("index of letter 's' = " 
           + rty.indexOf('s')); 
        
        System.out.println("index of letter 'e' = " 
           + rty.indexOf('e'));
        
        // 8 
        String plm = new String("Welcome to Tutorial");
        String Subplm = new String("Tutorials" );
        System.out.print("Found Index :" );
        System.out.println( plm.indexOf( Subplm, 15 ));
        
        // 9
        String wsx = new String("Welcome to Tutorial");
        System.out.print("Found Last Index :" );
        System.out.println(wsx.lastIndexOf( 'o' ));
        
        // 10
        String wsx1 = "Welcome to tutorials";
         
        System.out.println("index =  " + wsx1.lastIndexOf("tutorials")); 
        
        System.out.println("index =  " + wsx1.lastIndexOf("to"));    
     
        // 11 // 12
        StringBuilder str11 = new StringBuilder("admin");
        System.out.println("string = " + str11);

        System.out.println("substring is = " + str11.substring(3));

        System.out.println("substring is = " + str11.substring(1, 4));
        
        // 13
        String S1 = new String("the quick fox jumped");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("fox", "dog"));
        System.out.println("String after replacing all 'e' with 'a': " + S1.replace('e', 'a'));
        
        // 14
        
        String Str = new String("      Welcome to Tutorial   ");

        System.out.print("Return Value : " );
        System.out.println(Str.trim() );
        
        // 15
        String edc = new String("Welcome to Tutorial");

        System.out.print("Return Value :");
        System.out.println(edc.toLowerCase());
        
        // 16
        String rfv = new String("Welcome to Tutorial");

        System.out.print("Return Value :" );
        System.out.println(rfv.toUpperCase() );
        
        // 17
        String tgb = new String("Welcome-to-Tutorial");
        System.out.println("Return Value :" );
        
        for (String retval: tgb.split("-", 0)) {
           System.out.println(retval);
        }
        System.out.println("");
        // 18
        String yhn = "a d, m, i.n";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        String[] tokensVal = yhn.split(delimiters);
        System.out.println("Count of tokens = " + tokensVal.length);
      
        for(String token : tokensVal) {
           System.out.print(token);
        } 
       
	}

	public static void Fourth()

	{
		// a iteracyjnie
		int first = 2, second = 4, score=1;
		for(int i = 1; i <= second ; i++)
		{
			score = score*first;
			System.out.println(score);
		}
		
		// b rekurencyjnie
		System.out.println(rekursja(2,4));
	}
	
	public static void Fifth()
	{
		int score1 = fibo(19);
		System.out.println(score1);
	}
	
	public static void Dec_to_bin(int liczba) {
		int i = 0;
		int[] tab = new int[10];
		while (liczba != 0) {
			tab[i++] = liczba % 2;
			liczba /= 2;
		}
		for (int j = i - 1; j >= 0; j--)
			System.out.println(tab[j]);

	}
	
	public static int rekursja(int a, int b)


	{
		if(b==0) return 1;
		else
			return a=a*rekursja(a,--b);
	}
	
	public static int fibo(int n)
	{
		if((n==1 || n==2)) return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}
