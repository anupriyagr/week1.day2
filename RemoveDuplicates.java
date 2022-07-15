package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String withDup = "We learn java basics as part of java sessions in java week1";
    String[] split = withDup.split(" ");
    for (int i = 0; i < split.length; i++) {
    int counter = 0;
    for (int j = 0; j < split.length; j++) {
    	if (split[i].equalsIgnoreCase(split[j])) {
			counter++;
    	if (counter>1)
    		split[j] = "";
    }
	}	
	}
    for (int i = 0; i < split.length; i++) {
    	System.out.print(split[i]+" ");
	}
	}
	}