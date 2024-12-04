public class WhileLoopDemo{

    public static void main(String[] args){

	String[] einsBisFuenf = {"eins", "zwei", "drei", "vier", "fuenf"};
	int arrayIndex = 0;

	while(arrayIndex < einsBisFuenf.length){
		System.out.println(einsBisFuenf[arrayIndex]);
		arrayIndex++;
	}

	/*
	 Da wir arrayIndex in der vorherigen while-Schleife hochgezählt haben und am Ende den selben Wert wie einsBisFuenf.length hat,
	 müssen wir vor der Benutzung in der folgenden while-Schleife eins abziehen, da der maxIndex nur bis einsBisFuenf.length - 1 geht.
	 */
	arrayIndex--;
	while(arrayIndex >= 0){
		System.out.println(einsBisFuenf[arrayIndex]);
		arrayIndex--;
	}
    }
}
