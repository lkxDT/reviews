public class MathUtilsTestDrive{

    public static void main(String[] args){
	assertEquals(0.0,MathUtils.divide(0,19));
	assertEquals(1.0,MathUtils.divide(19,19));
	assertEquals(-1.0,MathUtils.divide(19,-19));
	assertEquals(-1.0,MathUtils.divide(-19,19));
	assertEquals(2.0,MathUtils.divide(4,2));
	assertEquals(0.5,MathUtils.divide(2,4));
	try{
	    MathUtils.divide(19,0);
	}catch(IllegalArgumentException e){
	    System.out.println("[PASSED] Expected IllegalArgumentException and an IllegalArgumentException has been thrown");
	    e.printStackTrace();
	}
    }

    public static void assertEquals(double expected,double actual){
	if(expected == actual){
	    System.out.printf("[PASSED] Expected %.1f and found %.1f\n", expected, actual);
	}else{
	    System.out.printf("[FAILED] Expected %.1f but found %.1f\n", expected, actual);
	}
    }
}
