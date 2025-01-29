public class SpeedOfLightTestDrive{

    public static void main(String[] args){
	testPrintSpeedOfLight();
	testFractionizeSpeedOfLight();
	testPrintFraction();
    }

    public static void testPrintSpeedOfLight(){
	int speedOfLight = SpeedOfLight.speedOfLight;
	System.out.println(speedOfLight);
    }

    public static void testFractionizeSpeedOfLight(){
	double fractionHalf = SpeedOfLight.fraction(0.5);
	System.out.printf("%.2f\n", fractionHalf);
	double fractionOne = SpeedOfLight.fraction(1.0);
	System.out.printf("%.2f\n", fractionOne);
	double fractionZero = SpeedOfLight.fraction(0.0);
	System.out.printf("%.2f\n", fractionZero);
	try{
	    double falseFraction = SpeedOfLight.fraction(2.0);
	}catch(IllegalArgumentException e){
	    System.out.println("testFractionizeSpeedOfLight IllegalArgumentException catch was successful");
	    e.printStackTrace();
	}
    }

    public static void testPrintFraction(){
	double fractionHalf = SpeedOfLight.printFraction(0.5);
	double fraction = SpeedOfLight.printFraction(0.3);
    }
}
