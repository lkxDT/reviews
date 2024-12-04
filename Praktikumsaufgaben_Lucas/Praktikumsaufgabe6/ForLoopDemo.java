public class ForLoopDemo{

    public static void main(String[] args){

	String[] einsBisFuenf = {"eins", "zwei", "drei", "vier", "fuenf"};
	    
	//2.1 Iteration mit for-Schleifen
	for(int i = 0; i < einsBisFuenf.length; i++){
	    System.out.println(einsBisFuenf[i]);
	}

	for(int i = einsBisFuenf.length - 1; i >= 0; i--){
	    System.out.println(einsBisFuenf[i]);
	} 
    }
}
