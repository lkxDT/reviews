public class SpeedOfLight{

    public static final int speedOfLight = 299792458;

    public static double fraction(double factor) throws IllegalArgumentException{
	if(factor < 0 || factor > 1){
	    throw new IllegalArgumentException("SpeedOfLight fraction error: Please choose a factor between and including 0 and 1");
	}
	double speedOfLightFraction = speedOfLight * factor;
	return speedOfLightFraction;
    }

    /*
    printFraction:
        Da diese Methode den geteilten Wert nicht nur in dem angegebenen in die Konsole ausgeben, sondern auch
	als Rückgabewert zurückgeben soll, haben wir zwei Variablen mit dem geteilten Wert deklariert. Die eine 
	Variable 'speedOfLightFraction' dient als Speichervariable und 'speedOfLightFractionSize' als Nutzvariable.
        Die Formatierung soll den getielten Wert immer in 3er Packete mit einer Trennung darstellen, daher 
	nehmen wir in jeder while-Schleifen-Iteration den aktuellen Wert modulo 1000. Das bewirkt dass wir die
	drei ersten Ziffern der Zahl von dem Rest separieren und als String zu 'printableFraction' ergänzen 
	können. Um über die ganze Zahl iterieren zu können müssen wir jetzt nur noch die ersten drei Ziffern
	von der Zahl 'entfernen', was mit der Division mit 1000 funktioniert.	
    */
    public static double printFraction(double factor){
	double speedOfLightFraction = fraction(factor);
	double speedOfLightFractionSize = speedOfLightFraction;
	int fractionDecimalPlaces = getDecimalPlaces(speedOfLightFractionSize, 2);
	int fractionTriplet = (int) speedOfLightFractionSize % 1000;
	String printableFraction = Integer.toString(fractionTriplet) + "." + Integer.toString(fractionDecimalPlaces);
	speedOfLightFractionSize /= 1000;
	while(speedOfLightFractionSize >= 1){
	    fractionTriplet = (int) speedOfLightFractionSize % 1000;
	    printableFraction = Integer.toString(fractionTriplet) + "," + printableFraction;
	    speedOfLightFractionSize /= 1000;	    
	}
	System.out.println(printableFraction);
	return speedOfLightFraction;
    }

    public static int getDecimalPlaces(double number, int numberOfDecimalPlaces){
	double decimalPlaces = number - Math.floor(number);
	int decimalPlacesAsInt = (int) Math.floor(decimalPlaces * Math.pow(10,numberOfDecimalPlaces));
	return decimalPlacesAsInt;	
    }
}
