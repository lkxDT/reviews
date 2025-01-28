import java.util.Arrays;
import java.util.Scanner;

public class DateTestDrive{

    public static void main(String[] args){
	try{
	    int[] localizedTime = UserCommunication.readDate();
	    UserCommunication.printLocalizedTime(localizedTime);
	}catch(Exception e){
	    e.printStackTrace();
	    if(!UserCommunication.isQuitting()){
		main(args);
	    }
	}finally{	
	    UserCommunication.scanner.close();
	    System.out.println("Scanner is now closed");
	}
    }
}
