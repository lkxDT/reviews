public class MathUtils{

    public static double divide(int number1, int number2) throws IllegalArgumentException{
	if(number2 == 0){
	    throw new IllegalArgumentException("MathUtils.divide divided by 0 error");
	}
	double quotient = (double) number1 / (double) number2;
	return quotient;
    }
}
