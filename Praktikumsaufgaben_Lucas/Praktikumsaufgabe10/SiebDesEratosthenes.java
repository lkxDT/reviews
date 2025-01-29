import java.util.*;

public class SiebDesEratosthenes{

    public int maximum;
    private ArrayList<Integer> primeList;

    public SiebDesEratosthenes(){
	this.maximum = 2;
	this.primeList = new ArrayList<>();
    }

    public ArrayList<Integer> genPrimeListUnoptimized() throws IllegalArgumentException{
	this.primeList.clear();
	if(this.maximum < 2){
	    throw new IllegalArgumentException("Sieb des Eratosthenes genPrimeListUnoptimized error: Please choose a maximum Value greater or equal to 2");
	}
	for(int i = 2; i <= this.maximum; i++){
	    if(!containsPrimeFactorUnoptimized(i)){
		this.primeList.add(i);
	    }
	}
	System.out.println("Size of prime list: " + this.primeList.size());
	return this.primeList;
    }

    private boolean containsPrimeFactorUnoptimized(int number){
        boolean containsPrimeFactor = false;
        for(int prime : this.primeList){
            if(number % prime == 0){
                containsPrimeFactor = true;
            }
        }
        return containsPrimeFactor;
    }

    public ArrayList<Integer> genPrimeList() throws IllegalArgumentException{
	int skipCounter = 0;
	int skip = 0;
	this.primeList.clear();
	if(this.maximum < 2){
	    throw new IllegalArgumentException("Sieb des Eratosthenes genPrimeList error: Please choose a maximum Value greater or equal to 2");
	}
	this.primeList.add(2);
	if(this.maximum % 2 == 0){
	    for(int i = 3; i < this.maximum; i += 2 + skip){
		skip = 0;
	        if(!containsPrimeFactor(i)){
		    this.primeList.add(i);
	        }
		skipCounter++;
		if(skipCounter == 3){
		    skip = 2;
		    skipCounter = 1; 
		}
	    }
	}else{
	    for(int i = 3; i <= this.maximum; i += 2){
                if(!containsPrimeFactor(i)){
                    this.primeList.add(i);
                }
            }
	}
	System.out.println("Size of prime list: " + this.primeList.size());
	return this.primeList;
    }

    private boolean containsPrimeFactor(int number){
        for(int prime : this.primeList){
	    if(prime >= number/2){
		return false;
	    }else if(number % prime == 0){
                    return true;
            }
        }
        return false;
    }

    /*
    public ArrayList<Integer> genPrimeList() throws IllegalArgumentException{
        this.primeList.clear();
        if(this.maximum < 2){
            throw new IllegalArgumentException("Sieb des Eratosthenes genPrimeList error: Please choose a maximum Value greater or equal to 2");
        }
        this.primeList.add(2);
        for(int i = 3; i <= this.maximum; i += 2){
            if(!containsPrimeFactor(i)){
                this.primeList.add(i);
            }
        }
        System.out.println("Size of prime list: " + this.primeList.size());
        return this.primeList;
    }
    */

    @Override
    public String toString(){
        String printableList = "(" + this.maximum + ") " + "<2";
        for(int i = 1; i < this.primeList.size(); i++){
            printableList += "," + Integer.toString(this.primeList.get(i));
        }
        printableList += ">";
        System.out.println(printableList);
	return printableList;
    }
}
