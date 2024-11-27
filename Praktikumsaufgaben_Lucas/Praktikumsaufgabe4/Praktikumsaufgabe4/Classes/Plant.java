package Classes;

public class Plant{

	private double height;
	private String type;
	private int waterLevel;

	public Plant(double height, String type, int waterLevel){

		this.height = height;
		this.type = type;
		this.waterLevel = waterLevel;
	}


	public void setHeight(double newHeight){
		
		if(newHeight < 0){
			//pio KI 
			//pio kein System.out in Fachklasse
			System.out.println("Input error: newHeight was expected to be greater than 0, but found: " + newHeight);
		}else{ 
			this.height = newHeight;
		}
	}


	public double getHeight(){
	    return this.height;
	}


	public void setType(String newType){
                //pio was ist mit null oder "    "
		this.type = newType;
	}


	public String getType(){

		return this.type;
	}


	public void setWaterLevel(int newWaterLevel){

		int maxWaterLevel = 10; //pio Ziffern immer Konstaten

		if(newWaterLevel > maxWaterLevel){

			System.out.println("Input error: newWaterLevel was expected to be less than " + maxWaterLevel + " but found: " + newWaterLevel);
		}else{

			this.waterLevel = newWaterLevel;
		}
	}


	public int getWaterLevel(){

		return this.waterLevel;
	}


	public void grow(int sunlightHours){

		this.height += 0.5 * sunlightHours;
	}


	public void water(int amount){ //pio immer ein Verb

		this.waterLevel += amount;
	}


	public boolean needsWater(){

		boolean res = false;

		if(this.waterLevel < 5) { 
			res = true; //pio keine Abkurzungen ... wenig kreativ ... immer bool als Frage
		}

		return res;	
	}
}
