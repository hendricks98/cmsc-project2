

public class RamStringTester {

	static RamString myString = new RamString("defaultString");
	static int failCount = 0;
	static int passCount = 0;
	static int testCount = 0;

	public static void setUp(){
		RamString myString = new RamString("default string");
	}

	public static void resetString(){
		myString.setWackyString("default string");
	}

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

	public void testRamifyString1(){
		myString.setWackyString("00 0 00");

		System.out.println("----- Test ramifyString() (1) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'VCU Rams VCU'");
		String expected = "VCU Rams VCU";

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
	}

	public void testRamifyString2(){
		myString.setWackyString("00000 00");

		System.out.println("----- Test ramifyString() (2) -----");
		System.out.println("RamString: '" + myString.getWackyString() + "'");
		System.out.println("Expected: 'VCU Rams VCU'");
		String expected = "VCU Rams VCU";

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
	}


	public static void main(String[] args) {
		
		RamStringTester tester = new RamStringTester();
		tester.setUp();

		System.out.println("--------- TEST EVEN CHARACTERS ----------");
		System.out.println("Return the 2nd, 4th, 6th, and so on chars.\n");
		tester.testEvenCharacters1();
		tester.testEvenCharacters2();
		tester.testEvenCharacters3();
		tester.testEvenCharacters4();
		tester.testEvenCharacters5();
		tester.testEvenCharacters6();

		System.out.println("--------- TEST ODD CHARACTERS ----------");
		System.out.println("Return the 1st, 3rd, 5th, and so on chars.\n");
		tester.testOddCharacters1();
		tester.testOddCharacters2();
		tester.testOddCharacters3();
		tester.testOddCharacters4();
		tester.testOddCharacters5();
		tester.testOddCharacters6();

		System.out.println("--------- TEST COUNT NON DIGITS ----------");
		System.out.println("Count the number of non digits in the str.\n");
		tester.testCountNonDigits1();
		tester.testCountNonDigits2();
		tester.testCountNonDigits3();
		tester.testCountNonDigits4();
		tester.testCountNonDigits5();

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

		System.out.println("--------- TEST RAMIFY STRING ----------");
		System.out.println("Replace 00 with VCU and 0 with Rams.\n");
		tester.testRamifyString1();
		tester.testRamifyString2();

		System.out.println("---------- TESTING SUMMARY ----------");
		System.out.println("=====================================");
		System.out.println("# of tests: " + testCount);
		System.out.println("# of passed tests: " + passCount);
		System.out.println("# of failed test: " + failCount);
	}
}