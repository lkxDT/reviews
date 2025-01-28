import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class UserCommunication{

    public static Scanner scanner = new Scanner(System.in);

    public static int[] readDate() throws NullPointerException, NumberFormatException, IllegalArgumentException{
	//Scanner dateScanner = new Scanner(System.in);
	System.out.println("Please enter a date in ISO8601-format (****-**-**; year, month, day):");
	int[] iso8601DateArray = Format.parseISO8601ToIntArray(scanner.nextLine());
	return iso8601DateArray;
    }

    public static void printLocalizedTime(int[] iso8601DateArray){
	LocalDate localDate = LocalDate.of(iso8601DateArray[0], iso8601DateArray[1], iso8601DateArray[2]);
	DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	System.out.printf("%s, %d %s %d\n", dayOfWeek, iso8601DateArray[2], localDate.getMonth(), iso8601DateArray[0]);
    }

    public static boolean isQuitting(){
	boolean wantsToQuit = false;
	//Scanner scanner = new Scanner(System.in);
	System.out.println("Do you want to continue? (Y/n)");
	wantsToQuit = !(scanner.nextLine().equals("Y"));
	return wantsToQuit;
    }
}
