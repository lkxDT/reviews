import java.util.Arrays;
import java.util.Scanner;
import java.time.*;

public class DateTestDrive{

    public static void main(String[] args){
	int[] iso8601DateArray = new int[3];
	String date = "";
	try{
	    iso8601DateArray = Format.parseISO8601ToIntArray("2002-01-10");
	    date = UserCommunication.printLocalizedDate(iso8601DateArray);
	    assertEquals(date, "THURSDAY, 10 JANUARY 2002");
	}catch(Exception e){
	    System.err.println("[FAILED] an unexpected exception was thrown");
	    e.printStackTrace();
	}
	try{
            iso8601DateArray = Format.parseISO8601ToIntArray("1234-23-23");
            date = UserCommunication.printLocalizedDate(iso8601DateArray);
        }catch(DateTimeException e){
            System.err.println("[PASSED] DateTimeException was thrown correctly");
            e.printStackTrace();
        }
	try{
	    iso8601DateArray = Format.parseISO8601ToIntArray(null);
        }catch(NullPointerException e){
	    System.err.println("[PASSED] NullPointerException was thrown correctly");
	    e.printStackTrace();
        }
	try{
	    iso8601DateArray = Format.parseISO8601ToIntArray("187");
        }catch(IllegalArgumentException e){
	    System.err.println("[PASSED] IllegalArgumentException was thrown correctly");
	    e.printStackTrace();
        }
	try{
            iso8601DateArray = Format.parseISO8601ToIntArray("2002.01-10");
        }catch(IllegalArgumentException e){
            System.err.println("[PASSED] IllegalArgumentException was thrown correctly");
	    e.printStackTrace();
        }
	try{
	    iso8601DateArray = Format.parseISO8601ToIntArray("200a-01-10");
        }catch(NumberFormatException e){
	    System.err.println("[PASSED] NumberFormatExcepetion was thrown correctly");
	    e.printStackTrace();
        }
    }

    public static void assertEquals(String actual, String expected){
	if(actual.equals(expected)){
	    System.out.printf("[PASSED] expected %s and found %s\n", expected, actual);
	}else{
	    System.out.printf("[FAILED] expected %s and found %s\n", expected, actual);
	}
    }
}
