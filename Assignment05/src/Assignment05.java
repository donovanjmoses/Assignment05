// CSE 110     : <Class #75326> / <ONLINE>
// Assignment  : <ASSIGNMENT05>
// Author      : <DONOVAN MOSES>  <1210366219>
// Description : <A PROGRAM CENTERED ON WRITING METHODS>

public class Assignment05 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	displayGreeting();
    	
    	String str = "I was passed through to a method!";
    	displayText(str);
    	
    	int total_One = 5;
    	int total_Two = 7;
    	int total_Three = 9;
    	printTotal(total_One, total_Two, total_Three);
    	getTotal(total_One, total_Two, total_Three);
    	
    	double float_One = 5.0;
    	double float_Two = 7.0;
    	double float_Three = 9.0;
    	getAverage(float_One, float_Two, float_Three);
    	
    	String str_One = "a";
    	String str_Two = "ab";
    	String str_Three = "abc";
    	averageLength(str_One, str_Two, str_Three);
    	lengthOfShortest(str_One, str_Two);
    	
    	char asterisk = '*';
    	stringOfStars(str);
    	
    	maxStringOfStars(str_One, str_Two);
    	midStringOfStars(str_One, str_Two, str_Three);
    			
    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    private static void displayGreeting() {
    	System.out.println("Hello, and welcome!");
    }
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    private static void displayText(String str) {
    	System.out.println(str);
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    private static void printTotal(int total_One, int total_Two, int total_Three) {
    	int totalSum = (total_One + total_Two + total_Three);
    	System.out.println(totalSum);
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    private static int getTotal(int total_One, int total_Two, int total_Three) {
    	int totalSum = (total_One + total_Two + total_Three);
    	return totalSum;
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    private static double getAverage(double float_One, double float_Two, double float_Three) {
    	double avgOfDoubles = (float_One + float_Two + float_Three) / 3;
    	return avgOfDoubles;
    }
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    private static double averageLength(String str_One, String str_Two, String str_Three) {
    	double avgLength = (str_One.length() + str_Two.length() + str_Three.length()) / 3;
    	return avgLength;
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    private static int lengthOfShortest(String str_One, String str_Two) {
    	int shortestString;
    	if (str_One.length() < str_Two.length()) {
    		shortestString = str_One.length();
    	}
    	else {
    		shortestString = str_Two.length();
    	}
    	return shortestString;
    }
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    private static String stringOfStars(String str) {
    	String result = "";
    	char asterisk = '*';
    	for (int i = 0; i < str.length(); i++) {
    		result += asterisk;
    	}
    	return result;
    }
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    private static String maxStringOfStars(String str_One, String str_Two) {
    	String result = "";
    	char asterisk = '*';
    	int longestString;
    	if (str_One.length() > str_Two.length()) {
    		longestString = str_One.length();
    	}
    	else {
    		longestString = str_Two.length();
    	}
    	for (int i = 0; i < longestString; i++) {
    		result += asterisk;
    	}
    	return result;
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    private static String midStringOfStars (String str_One, String str_Two, String str_Three) {
    	String result = "";
    	char asterisk = '*';
    	int midString = str_Two.length();
    	if (str_Two.length() > str_One.length() && str_Two.length() < str_Three.length()) {
    		for (int i = 0; i < midString; i++) {
        		result += asterisk;
        	}
    	}
    	return result;
    }

}
