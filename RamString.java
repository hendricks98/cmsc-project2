/*
Jamel Hendricks
02/09/2019
CMSC 256 - Project 2
*/

public class RamString implements WackyStringInterface {

	private String current;


	// constructor for ramstring
	// parameter "s" is passed to set the RamString object value
	public RamString(String s) {
		setWackyString(s);
	} 

	// sets RamSTring value to paramater "s"
	public void setWackyString(String s){
		current = s;
	}

	// returns the String attribute of RamString
	public String getWackyString(){
		return current;
	}

	// return the even indexed characters of the RamString
	public String getEvenCharacters(){

		String even = "";

		// if string is null return
		if (getWackyString() == (null)){
			return "String is null.";
		}

		// if string is empty return
		if (getWackyString().equals("")){
			return "No characters in string.";
		}

		// split each char of the string into an array "word"
		String word[] = getWackyString().split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

		// for each char in "word", if in an even position
		// add the char to the string "even"
		int position = 1;
		for (String letter : word){
			
			if (position > (word.length - 1) ){
				break;
			} else{ 
				even = even + word[position];
				position = position + 2;
			}

		}

		return even;
	}

	// return the even indexed characters of the RamString
	private String getEvenCharacters(String s){

		String word[] = s.split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

		// for each char in "word", if in an even position
		// add the char to the string "even"
		int position = 1;
		String even = "";
		for (String letter : word){

			if (position > (word.length - 1) ){
				break;
			} else{ 
				even = even + word[position];
				position = position + 2;
			}
		}

		return even;
	}

	// return the odd indexed characters of the RamString
	// return type is a string so "String is null." is returned
	public String getOddCharacters(){
		String odd = "";

		if (getWackyString() == (null)){
			return "String is null.";
		}

		if (getWackyString().equals("")){
			return "No characters in string.";
		}

		String word[] = getWackyString().split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

		// for each char in "word", if in an odd position
		// add the char to the string "odd"
		int position = 0;
		for (String letter : word){

			if (position > (word.length - 1) ){
				break;
			} else{ 
				odd = odd + word[position];
				position = position + 2;
			}

		}

		return odd;
	}

	// return the odd indexed characters of the RamString
	private String getOddCharacters(String s){

		String word[] = s.split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

		// for each char in "word", if in an odd position
		// add the char to the string "odd"
		int position = 0;
		String odd = "";
		for (String letter : word){

			if (position > (word.length - 1) ){
				break;
			} else{ 
				odd = odd + word[position];
				position = position + 2;
			}

		}

		return odd;
	}

	// count each of the non digit char in a string
	public int countNonDigits(){

		// return a "0" if string is null
		if (getWackyString() == (null)){
			return 0;
		}

		String word = getWackyString();
		int numDigits = 0;
		int nonDigits = word.length();

		// for each char in the word, check if digit
		// and at to counter if so
		for (int i = 0; i < word.length(); i++){
			if (Character.isDigit(word.charAt(i))){
				numDigits = numDigits + 1;
			}
		}

		// find the number of non-digits
		nonDigits = nonDigits - numDigits;

		return nonDigits;

	}

	
	// returns true if string is a valid email
	public boolean isValidEmail(){
		/* only true if following conditions met:
			1) one or more characters before @
			2) one or more characters in between @ and .
			3) one or more characters after .
		*/

		// assume email is valid until proven otherwise
		boolean valid = true;

		String email = getWackyString();
		int atIndex = 0;
		int pdIndex = 0;

		// if email is empty or null
		if(email == null){
			valid = false;
			return valid;
		}

		// if no text in string, invalid
		if (email.equals("")){
			valid = false;
		}

		// if two "." in a row return false
		if(email.contains("..")){
			valid = false;
		}

		// if no "@" inside email return false
		if(email.indexOf("@") == -1){
			valid = false;
		}

		// if there is more than one @ return false
		if (!(email.indexOf("@") == (email.lastIndexOf("@"))) ){
			valid = false;
		}
			
		atIndex = email.indexOf("@");
		
		// if no "." inside email return false
		if(email.indexOf(".") == (-1)){
			valid = false;
		}

		// check if '.' is after the @
		if (!(email.lastIndexOf(".") > atIndex)){
			valid = false;
		}

		pdIndex = email.lastIndexOf(".");

		String[] wordArr = email.split("");

		// check for chars before @''
		int beforeAtCount = 0;
		for(int i = 0; i < atIndex; i++){
			beforeAtCount = beforeAtCount + 1;
		}

		if (!(beforeAtCount >= 1)){
			valid = false;
		}

		// check for chars before between '@' and '.'
		int inBetweenCount = 0;
		for(int i = atIndex; i < pdIndex; i++){
			inBetweenCount = inBetweenCount + 1;
		}

		if (!(inBetweenCount >= 1)){
			valid = false;
		}

		// check for chars after '.'
		int afterPdCount = 0;
		for(int i = pdIndex; i < (email.length() -1); i++){
			afterPdCount = afterPdCount + 1;
		}

		if (!(afterPdCount >= 1)){
			valid = false;
		}

		return valid;
	}

	
	// change single and double zeroes in string to Rams or VCU
	public void ramifyString(){
		
		String str = getWackyString();

		// if string is null return
		if (str == null){
			System.out.println("String is null.");
			return;
		}

		// iterate through each char of the string
		for (int i = 0; i < str.length(); i++){

			// check for chars in the middle part of the string
			if ( (0 < i) && (i < str.length()-1)){

				// single zero , check that indexes before and after i do not equal zero
				if (str.charAt(i) == '0' && !(str.charAt(i+1) == '0') && !(str.charAt(i-1) == '0') ){
					str = str.substring(0, i) + "Rams" + str.substring(i+1, str.length());
				}

				// double zero, checks that indexes before and after i do not equal zero
				if (str.charAt(i) == '0' && (str.charAt(i+1) == '0') && !(str.charAt(i-1) == '0')){

					// if third spot is possible, check for third spot
					if ( (i+2) < str.length() -1){
						if (!(str.charAt(i+2) == '0')){
							str = str.substring(0, i) + "VCU" + str.substring(i+2, str.length());
						}

					} else {
						str = str.substring(0, i) + "VCU" + str.substring(i+2, str.length());
					}
				}
			}

			// check the first char of the string
			if ( i == 0){
				// single zero , check that indexes before and after i do not equal zero
				if (str.charAt(i) == '0' && !(str.charAt(i+1) == '0') ){
					str = str.substring(0, i) + "Rams" + str.substring(i+1, str.length());
				}

				if ( (i+2) < str.length() -1){
					// double zero, checks that indexes before and after i do not equal zero
					if (str.charAt(i) == '0' && (str.charAt(i+1) == '0') &&  !(str.charAt(i+2) == '0')  ){
						str = str.substring(0, i) + "VCU" + str.substring(i+2, str.length());
					}
				}
			}

			// check the last char of the string
			if ( (i == str.length()-1)){

				// single zero , check that indexes before and after i do not equal zero
				if (str.charAt(i) == '0' && !(str.charAt(i-1) == '0') ){
					str = str.substring(0, i) + "Rams" + str.substring(i+1, str.length());
				}


				if ( (i+2) < str.length() -1){
					// double zero, checks that indexes before and after i do not equal zero
					if (str.charAt(i) == '0' && !(str.charAt(i-1) == '0') ){
						str = str.substring(0, i) + "VCU" + str.substring(i+2, str.length());
					}
				}
			}

		}

		setWackyString(str);
	}

	
	// convert digits 1-9 to roman numerals
	// ** does not include 0, there is no roman numeral for 0 (natural numbers only) **
	public void convertDigitsToRomanNumeralsInSubstring(int x,int y){
		String str = getWackyString();
		
		// if string is null return
		if (str == null){
			System.out.println("String is null.");
			return;
		}

		// check if passed range is legal
		try{
			if (x > y){
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid character interval.");
			return;
		}

		// check if passed range is legal
		try{
			if (x < 0 || y > str.length()){
				throw new MyIndexOutOfBoundsException();
			}
		} catch (MyIndexOutOfBoundsException e) {
			System.out.println("One or more indexes out of bounds.");
			return;
		}

		// iterate through each char in the specified range
		for (int i = x; i <= y; i++){

			char number = str.charAt(i);

			// for cases where the roman numeral inserts more than one character
			// the 'y' variable has to be modified to take account for 
			// the additional indexes being created, not doing so would result in
			// the possibility of some numbers not being converted

			// if the current char is a digit, replace with it's roman numeral
			if ( Character.isDigit(str.charAt(i))){

				switch(number){
					case '1': 
						str = str.substring(0,i) + "I" + str.substring(i+1,str.length());
						break;
					case '2': 
						str = str.substring(0,i) + "II" + str.substring(i+1,str.length());
						y++;
						break;
					case '3': 
						str = str.substring(0,i) + "III" + str.substring(i+1,str.length());
						y = y +2;
						break;
					case '4': 
						str = str.substring(0,i) + "IV" + str.substring(i+1,str.length());
						y++;
						break;
					case '5': 
						str = str.substring(0,i) + "V" + str.substring(i+1,str.length());
						break;
					case '6': 
						str = str.substring(0,i) + "VI" + str.substring(i+1,str.length());
						y++;
						break;
					case '7': 
						str = str.substring(0,i) + "VII" + str.substring(i+1,str.length());
						y = y+2;
						break;
					case '8': 
						str = str.substring(0,i) + "VIII" + str.substring(i+1,str.length());
						y= y+3;
						break;
					case '9': 
						str = str.substring(0,i) + "IX" + str.substring(i+1,str.length());
						y++;
						break;
				}
			}
		}

		setWackyString(str);

	}

}