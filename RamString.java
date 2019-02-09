

public class RamString implements WackyStringInterface {

	private String current;

	public RamString(String s) {
		setWackyString(s);
	} 

	public void setWackyString(String s){
		current = s;
	}

	
	public String getWackyString(){
		return current;
	}

	public String getEvenCharacters(){

		String even = "";

		if (getWackyString() == (null)){
			return "String is null.";
		}

		if (getWackyString().equals("")){
			return "No characters in string.";
		}

		String word[] = getWackyString().split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

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

	private String getEvenCharacters(String s){

		String word[] = s.split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

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

	private String getOddCharacters(String s){

		String word[] = s.split("");

		// index 0 counts as position 1 which is odd
		// index 1 counts as position 2 which is even

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

	public int countNonDigits(){

		if (getWackyString() == (null)){
			return 0;
		}

		String word = getWackyString();
		int numDigits = 0;
		int nonDigits = word.length();

		for (int i = 0; i < word.length(); i++){
			if (Character.isDigit(word.charAt(i))){
				numDigits = numDigits + 1;
			}
		}

		nonDigits = nonDigits - numDigits;

		return nonDigits;

	}

	

	public boolean isValidEmail(){
		/* only true if following conditions met:
			1) one or more characters before @
			2) one or more characters in between @ and .
			3) one or more characters after .
		*/

		boolean valid = true;

		String email = getWackyString();
		int atIndex = 0;
		int pdIndex = 0;

		// if no "@" inside email return false
		if(email.indexOf("@") == -1){
			valid = false;
			//System.out.println("no @");
		}

		// if there is more than one @ return false
		if (!(email.indexOf("@") == (email.lastIndexOf("@"))) ){
			valid = false;
			//System.out.println("too many @");
		}
			
		atIndex = email.indexOf("@");
		
		// if no "." inside email return false
		if(email.indexOf(".") == (-1)){
			valid = false;
			//System.out.println("no '.'");
		}

		// check if '.' is after the @
		if (!(email.lastIndexOf(".") > atIndex)){
			valid = false;
			//System.out.println(" '.' isn't after the '@'");
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
			//System.out.println("not enough characters before '@'");
		}

		// check for chars before between '@' and '.'
		int inBetweenCount = 0;
		for(int i = atIndex; i < pdIndex; i++){
			inBetweenCount = inBetweenCount + 1;
		}

		if (!(inBetweenCount >= 1)){
			valid = false;
			//System.out.println("not enough characters in between '@' and '.'");
		}

		// check for chars after '.'
		int afterPdCount = 0;
		for(int i = pdIndex; i < (email.length() -1); i++){
			afterPdCount = afterPdCount + 1;
		}

		if (!(afterPdCount >= 1)){
			valid = false;
			//System.out.println("not enough characters after '.'");
		}

		//System.out.println("atIndex: " + atIndex);
		//System.out.println("pdIndex: " + pdIndex);

		return valid;
	}

	

	public void ramifyString(){
		
		String str = getWackyString();

		// replace the double zeros first so
		// we don't mistakenly count them as two
		// single zeros

		str = str.replace("00", "VCU");
		str = str.replace("0", "Rams");

		setWackyString(str);
	}

	
	public void convertDigitsToRomanNumeralsInSubstring(int x,int y){

	}
	/*
	public static void main(String[] args) {
		RamString str = new RamString("00 0 00 0");
		ramifyString();
		System.out.println(getWackyString());
	}
	*/

}