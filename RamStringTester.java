

public class RamStringTester {

	static RamString myString = new RamString("defaultString");

	// variables to track passed tests and failed tests, as well as the total number of tests
	static int failCount = 0;
	static int passCount = 0;
	static int testCount = 0;

	// helper method for student/project identification
	public static void printHeading(){
		System.out.print("Jamel Hendricks\nProject #2 - RamString\nCMSC 256 - Spring 2019\n");
	}

	// create a new RamString and set a defualt string to the string attribute
	public static void setUp(){
		RamString myString = new RamString("default string");
	}

	// reset the RamString to the default string value, to be used after tests
	public static void resetString(){
		myString.setWackyString("default string");
	}

	// test for basic usage
	public void testEvenCharacters1(){
		myString.setWackyString("1234");

		System.out.println("---- Test getEvenCharacters() (1) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: '24' ");
		String expected = "24";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing basic usage
	public void testEvenCharacters2(){
		myString.setWackyString("12");

		System.out.println("---- Test getEvenCharacters() (2) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: '2' ");
		String expected = "2";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing letters and numbers
	public void testEvenCharacters3(){
		myString.setWackyString("ab12cd34");

		System.out.println("---- Test getEvenCharacters() (3) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'b2d4' ");
		String expected = "b2d4";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing with an empty string
	public void testEvenCharacters4(){
		myString.setWackyString("");

		System.out.println("---- Test getEvenCharacters() (4) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'No characters in string.' ");
		String expected = "No characters in string.";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing with a null string
	public void testEvenCharacters5(){
		myString.setWackyString(null);

		System.out.println("---- Test getEvenCharacters() (5) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'String is null.' ");
		String expected = "String is null.";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with whitespace characters only
	public void testEvenCharacters6(){
		myString.setWackyString("  ");

		System.out.println("---- Test getEvenCharacters() (5) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: ' ' ");
		String expected = " ";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing basic usage
	public void testOddCharacters1(){
		myString.setWackyString("1234");

		System.out.println("---- Test getOddCharacters() (1) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: '13' ");
		String expected = "13";

		myString.setWackyString(myString.getOddCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing basic usage
	public void testOddCharacters2(){
		myString.setWackyString("12");

		System.out.println("---- Test getOddCharacters() (2) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: '1' ");
		String expected = "1";

		myString.setWackyString(myString.getOddCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing with letters and numbers
	public void testOddCharacters3(){
		myString.setWackyString("ab12cd34");

		System.out.println("---- Test getOddCharacters() (3) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'a1c3' ");
		String expected = "a1c3";

		myString.setWackyString(myString.getOddCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing empty string case
	public void testOddCharacters4(){
		myString.setWackyString("");

		System.out.println("---- Test getOddCharacters() (4) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'No characters in string.' ");
		String expected = "No characters in string.";

		myString.setWackyString(myString.getOddCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;

	}

	// testing null string case
	public void testOddCharacters5(){
		myString.setWackyString(null);

		System.out.println("---- Test getOddCharacters() (5) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'String is null.' ");
		String expected = "String is null.";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with whitespace characters only
	public void testOddCharacters6(){
		myString.setWackyString("  ");

		System.out.println("---- Test getOddCharacters() (5) ----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: ' ' ");
		String expected = " ";

		myString.setWackyString(myString.getEvenCharacters());
		System.out.println("Result: '" + myString.getWackyString() +"'" );

		if (expected.equals(myString.getWackyString())){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing basic usage, letters and numbers
	public void testCountNonDigits1(){
		myString.setWackyString("abc123");

		System.out.println("----- Test countNonDigits() (1) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 3");
		int expected = 3;

		int result = myString.countNonDigits();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing letters only
	public void testCountNonDigits2(){
		myString.setWackyString("abc");

		System.out.println("----- Test countNonDigits() (2) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 3");
		int expected = 3;

		int result = myString.countNonDigits();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing numbers only
	public void testCountNonDigits3(){
		myString.setWackyString("123");

		System.out.println("----- Test countNonDigits() (3) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 0");
		int expected = 0;

		int result = myString.countNonDigits();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing an empty string
	public void testCountNonDigits4(){
		myString.setWackyString("");

		System.out.println("----- Test countNonDigits() (4) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 0");
		int expected = 0;

		int result = myString.countNonDigits();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing a null string
	public void testCountNonDigits5(){
		myString.setWackyString(null);

		System.out.println("----- Test countNonDigits() (5) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 0");
		int expected = 0;

		int result = myString.countNonDigits();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing an average email address
	public void testIsValidEmail1(){
		myString.setWackyString("email@vcu.edu");

		System.out.println("----- Test isValidEmail() (1) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: true");
		boolean expected = true;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with whitespace in email (valid according to discussion board)
	public void testIsValidEmail2(){
		myString.setWackyString(" @vcu.edu");

		System.out.println("----- Test isValidEmail() (2) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: true");
		boolean expected = true;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with letters and whitespace (valid according to discussion board)
	public void testIsValidEmail3(){
		myString.setWackyString("spaceIn email@vcu.edu");

		System.out.println("----- Test isValidEmail() (3) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: true");
		boolean expected = true;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing without required char before the '@'
	public void testIsValidEmail4(){
		myString.setWackyString("@vcu.edu");

		System.out.println("----- Test isValidEmail() (4) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with no char b/t the '@' and the '.'
	public void testIsValidEmail5(){
		myString.setWackyString("@.edu");

		System.out.println("----- Test isValidEmail() (5) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with no '.'
	public void testIsValidEmail6(){
		myString.setWackyString("email@com");

		System.out.println("----- Test isValidEmail() (6) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with too many '@'
	public void testIsValidEmail7(){
		myString.setWackyString("email@@gmail.com");

		System.out.println("----- Test isValidEmail() (7) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with multiple periods (valid)
	public void testIsValidEmail8(){
		myString.setWackyString("2.peroids@gmail.com");

		System.out.println("----- Test isValidEmail() (8) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: true");
		boolean expected = true;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with two periods back to back (invalid)
	public void testIsValidEmail9(){
		myString.setWackyString("2periods2@gmail..com");

		System.out.println("----- Test isValidEmail() (9) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing an empty string
	public void testIsValidEmail10(){
		myString.setWackyString("");

		System.out.println("----- Test isValidEmail() (10) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing a null string
	public void testIsValidEmail11(){
		myString.setWackyString(null);

		System.out.println("----- Test isValidEmail() (11) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	public void testIsValidEmail12(){
		myString.setWackyString(null);

		System.out.println("----- Test isValidEmail() (12) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: false");
		boolean expected = false;

		boolean result = myString.isValidEmail();
		System.out.println("Result: " + result);

		if (expected == result){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing basic usage
	public void testRamifyString1(){
		myString.setWackyString("00 foo 0");

		System.out.println("----- Test ramifyString() (1) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'VCU foo Rams'");
		String expected = "VCU foo Rams";

		myString.ramifyString();
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}

		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with too many consecutive zeroes
	public void testRamifyString2(){
		myString.setWackyString("00000 00");

		System.out.println("----- Test ramifyString() (2) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: '00000 VCU'");
		String expected = "00000 VCU";

		myString.ramifyString();
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing with no zeroes
	public void testRamifyString3(){
		myString.setWackyString("blah");

		System.out.println("----- Test ramifyString() (3) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'blah'");
		String expected = "blah";

		myString.ramifyString();
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}


	// testing an empty string
	public void testRamifyString4(){
		myString.setWackyString("");

		System.out.println("----- Test ramifyString() (4) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: ''");
		String expected = "";

		myString.ramifyString();
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing a null string
	public void testRamifyString5(){
		myString.setWackyString(null);

		System.out.println("----- Test ramifyString() (5) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'null'");
		String expected = null;

		myString.ramifyString();
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected == (result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing basic usage
	public void testConvertDigitsToRomanNumeralsInSubstring1(){
		myString.setWackyString("One -> 1 Two -> 2");

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (1) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 16");
		System.out.println("Expected: 'One -> I Two -> II'");
		String expected = "One -> I Two -> II";

		myString.convertDigitsToRomanNumeralsInSubstring(0,16);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}


	// testing the range of the selected chars
	public void testConvertDigitsToRomanNumeralsInSubstring2(){
		myString.setWackyString("One -> 1 Two -> 2");

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (2) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 8");
		System.out.println("Expected: 'One -> I Two -> 2'");
		String expected = "One -> I Two -> 2";

		myString.convertDigitsToRomanNumeralsInSubstring(0,8);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing multiple numbers back to back
	public void testConvertDigitsToRomanNumeralsInSubstring3(){
		myString.setWackyString("2 4 5");

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (3) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 4");
		System.out.println("Expected: 'II IV V'");
		String expected = "II IV V";

		myString.convertDigitsToRomanNumeralsInSubstring(0,4);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing multiple numbers attached
	public void testConvertDigitsToRomanNumeralsInSubstring4(){
		myString.setWackyString("123");

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (4) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 2");
		System.out.println("Expected: 'IIIIII'");
		String expected = "IIIIII";

		myString.convertDigitsToRomanNumeralsInSubstring(0,2);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing an empty string
	public void testConvertDigitsToRomanNumeralsInSubstring5(){
		myString.setWackyString("");

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (5) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 2");
		System.out.println("Expected: ''");
		String expected = "";

		myString.convertDigitsToRomanNumeralsInSubstring(0,2);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected.equals(result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}

	// testing a null string
	public void testConvertDigitsToRomanNumeralsInSubstring6(){
		myString.setWackyString(null);

		System.out.println("----- Test convertDigitsToRomanNumeralsInSubstring() (6) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Converting from 0 -> 2");
		System.out.println("Expected: 'null'");
		String expected = null;

		myString.convertDigitsToRomanNumeralsInSubstring(0,2);
		String result = myString.getWackyString();
		System.out.println("Result: '" + result + "'");

		if (expected == (result)){
			System.out.println("Passed Test!");
			passCount++;
		} else {
			System.out.println("Failed Test!");
			failCount++;
		}
		System.out.println("");
		resetString();
		testCount++;
	}


	public static void main(String[] args) {
		
		// create a new testing object and a default string
		RamStringTester tester = new RamStringTester();
		tester.setUp();

		// print out student/project information
		System.out.println("=======================");
		printHeading();
		System.out.println("=======================\n");

		// run a series of test for getEvenCharacters()
		System.out.println("--------- TEST EVEN CHARACTERS ----------");
		System.out.println("Return the 2nd, 4th, 6th, and so on chars.\n");
		tester.testEvenCharacters1();
		tester.testEvenCharacters2();
		tester.testEvenCharacters3();
		tester.testEvenCharacters4();
		tester.testEvenCharacters5();
		tester.testEvenCharacters6();

		// run a series of test for getOddCharacters()
		System.out.println("--------- TEST ODD CHARACTERS ----------");
		System.out.println("Return the 1st, 3rd, 5th, and so on chars.\n");
		tester.testOddCharacters1();
		tester.testOddCharacters2();
		tester.testOddCharacters3();
		tester.testOddCharacters4();
		tester.testOddCharacters5();
		tester.testOddCharacters6();

		// run a series of test for getNonDigits()
		System.out.println("--------- TEST COUNT NON DIGITS ----------");
		System.out.println("Count the number of non digits in the str.\n");
		tester.testCountNonDigits1();
		tester.testCountNonDigits2();
		tester.testCountNonDigits3();
		tester.testCountNonDigits4();
		tester.testCountNonDigits5();

		// run a series of test for isValidEmail()
		System.out.println("--------- TEST IS VALID EMAIL ----------");
		System.out.println("Return true/false if email is valid/invalid.\n");
		tester.testIsValidEmail1();
		tester.testIsValidEmail2();
		tester.testIsValidEmail3();
		tester.testIsValidEmail4();
		tester.testIsValidEmail5();
		tester.testIsValidEmail6();
		tester.testIsValidEmail7();
		tester.testIsValidEmail8();
		tester.testIsValidEmail9();
		tester.testIsValidEmail10();
		tester.testIsValidEmail11();

		// run a series of test for ramifyString()
		System.out.println("--------- TEST RAMIFY STRING ----------");
		System.out.println("Replace 00 with VCU and 0 with Rams.\n");
		tester.testRamifyString1();
		tester.testRamifyString2();
		tester.testRamifyString3();
		tester.testRamifyString4();
		tester.testRamifyString5();

		// run a series of tests for convertDigitsToRomanNumeralsInSubstring()
		System.out.println("--------- TEST CONVERT TO ROMAN NUMERAL ----------");
		System.out.println("Convert digits in range to roman numerals.\n");
		tester.testConvertDigitsToRomanNumeralsInSubstring1();
		tester.testConvertDigitsToRomanNumeralsInSubstring2();
		tester.testConvertDigitsToRomanNumeralsInSubstring3();
		tester.testConvertDigitsToRomanNumeralsInSubstring4();
		tester.testConvertDigitsToRomanNumeralsInSubstring5();
		tester.testConvertDigitsToRomanNumeralsInSubstring6();

		// summarize all of the tests
		System.out.println("---------- TESTING SUMMARY ----------");
		System.out.println("=====================================");
		System.out.println("# of tests: " + testCount);
		System.out.println("# of passed tests: " + passCount);
		System.out.println("# of failed test: " + failCount);
	}
}