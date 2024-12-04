import java.util.*;

public class BreakDemo{

    public static void main(String[] args){

	//4.1 Schleife mit break verlassen
	int bedingung = 50;
	boolean bedingungsWertWurdeGefunden = false;
	int[] zehnBisSiebzig = {10,20,30,40,50,60,70};
	int[] fuenfBisFuenfUndVierzig = {5,15,25,35,45};
	int[] sechzigBisNeunzig = {60,70,80,90};
	int[] leer = {};
	int[][] testArrays = {zehnBisSiebzig,fuenfBisFuenfUndVierzig,sechzigBisNeunzig,leer};

	for(int[] testArray : testArrays){
	    System.out.println();
	    System.out.println("Array    : " + toString(testArray));
	    System.out.println("Kriterium: " + bedingung);
	    if(testArray.length == 0){
		System.out.println("Array ist leer. Kein Wert ueberpruefbar.");
	    }else{
	    	for(int testValue : testArray){
		    if(testValue > bedingung){
		    	System.out.println("Gefundener Wert: " + testValue);
		    	bedingungsWertWurdeGefunden = true;
		    	break;
		    }else{
		    	System.out.println(testValue);
		    }
	    	}
	    	if(!bedingungsWertWurdeGefunden){
		    System.out.println(testArray + " beinhaltet keinen Wert, welcher die Bedingung erfüllt");
	    	}
	    }
	}	
    }

    public static String toString(int[] array){
	if(array.length == 0){
	    return "{}";
	}else{
	    String stringOfArray = "[" + array[0];
	    for(int i = 1; i < array.length; i++){
	    	stringOfArray += "," + String.valueOf(array[i]);
	    }
	    stringOfArray += "]";
	    return stringOfArray;
	}
    }
}
