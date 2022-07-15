package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
			if(i%2!=0) 
			{
				String rev = "";
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1; j >= 0; j--) 
				{
			    	rev = rev+charArray[j];
				}
				split[i] = rev;
			}
		}
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+ " ");
		}
	}

}
