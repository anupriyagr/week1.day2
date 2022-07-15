package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String test = "madam";
    String rev = "";
    char[] charArray = test.toCharArray();
   // char[] revArray = rev.toCharArray();
    for (int i = charArray.length-1; i >= 0; i--) {
    	rev = rev+charArray[i];
	}
    if (test.equals(rev)) {
    	System.out.print("Word '"+test+"' is a Palindrome");
    }
    else
    	System.out.println("Word '"+test+"' is not a Palindrome");   
	}
}

