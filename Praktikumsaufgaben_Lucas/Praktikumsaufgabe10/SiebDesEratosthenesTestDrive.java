import java.util.*;

public class SiebDesEratosthenesTestDrive{

    final static int max = 100;

    public static void main(String[] args){
	SiebDesEratosthenes testSieb = new SiebDesEratosthenes();
	timeGenPrimeList(testSieb);
    }

    public static void timeGenPrimeList(SiebDesEratosthenes testSieb){
	long startTime = System.nanoTime();
        testGenPrimeListUnoptimized(testSieb);
        long endTime = System.nanoTime();
        long durationUnoptimized = endTime - startTime;
        startTime = System.nanoTime();
        testGenPrimeListOptimized(testSieb);
        endTime = System.nanoTime();
        long durationOptimized = endTime - startTime;
	System.out.println("testGenPrimeListUnoptimized: finished in " + durationUnoptimized + " ns");
        System.out.println("testGenPrimeListOptimized: finished in " + durationOptimized + " ns");
	double optimizationRatio = (double) durationUnoptimized / (double) durationOptimized;
	System.out.printf("The optimized version runs %.5f times faster\n", optimizationRatio);
    }

    public static void testGenPrimeListUnoptimized(SiebDesEratosthenes testSieb){
	testSieb.maximum = max;
	ArrayList<Integer> primeList = testSieb.genPrimeListUnoptimized();
	String primeListString = testSieb.toString();
	testSieb.maximum = 2;
	primeList = testSieb.genPrimeListUnoptimized();
	primeListString = testSieb.toString();
	try{
	    testSieb.maximum = 1;
	    primeList = testSieb.genPrimeListUnoptimized();
	    primeListString = testSieb.toString();
	}catch(IllegalArgumentException e){
	    System.out.println("testGenPrimeListUnoptimized expected IllegalArgumentException was successful");
	    e.printStackTrace();
	}
    }

    public static void testGenPrimeListOptimized(SiebDesEratosthenes testSieb){
	testSieb.maximum = max;
        ArrayList<Integer> primeList = testSieb.genPrimeList();
        String primeListString = testSieb.toString();
        testSieb.maximum = 2;
        primeList = testSieb.genPrimeList();
        primeListString = testSieb.toString();
        try{
            testSieb.maximum = 1;
            primeList = testSieb.genPrimeList();
            primeListString = testSieb.toString();
        }catch(IllegalArgumentException e){
            System.out.println("testGenPrimeList expected IllegalArgumentException was successful");
            e.printStackTrace();
        }
    }
}
