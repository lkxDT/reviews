import java.util.Arrays;

public class Format{

    public static int[] parseISO8601ToIntArray(String inputString) throws NullPointerException, IllegalArgumentException, NumberFormatException{
	if(inputString == null){
	    throw new NullPointerException("Format.parseISO8601ToIntArray error: the input string is null");
	}
	if(inputString.length() != 10){
	    throw new IllegalArgumentException("Format.parseISO8601ToIntArray error: Please check your input string again");
	}
	if(inputString.charAt(4) != '-' || inputString.charAt(7) != '-'){
            throw new IllegalArgumentException("Format.parseISO8601ToIntArray error: Please use '-' as input spacings");
        }
	int year = Integer.parseInt(sliceString(inputString, 0, 4));
	int month = Integer.parseInt(sliceString(inputString, 5, 7));
	int day = Integer.parseInt(sliceString(inputString, 8, 10));
	int [] intArrayISO8601 = {year, month, day};
	return intArrayISO8601;
    } 

    private static String sliceString(String inputString, int start, int end) throws IllegalArgumentException{	
	if(start >= end || end > inputString.length()){
	    throw new IllegalArgumentException("Format.sliceString error: an index is out of bounds");
	}
	String subString = "";
	for(int i = start; i < end; i++){
	    subString += inputString.charAt(i);
	}
	return subString;
    }
}
