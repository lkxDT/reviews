/*@author Lukas Dreistadt */

public class Plant{
    private double height;
    private String type;
    private int waterLevel;

    public Plant(double height, String type, int waterLevel){
        //Konstruktormethode für die Klasse
        this.height = height;
        this.type = type;
        this.waterLevel = waterLevel;
    }

    //Getter und Setter für alle der drei Instanzvariablen
    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        if(height >= 0){
            this.height = height;
        }
        
        else{
            System.out.println("Height not possible");
        }
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getWaterLevel(){
        return this.waterLevel;
    }

    public void setWaterLevel(int waterLevel){
        if(0<=waterLevel){
            this.waterLevel = waterLevel;
        }

        else if(waterLevel < 20){
            this.waterLevel = 20;
            System.out.println("Water level not possible!");
        }
    }


    public void grow(int sunlightHours){
        this.height += sunlightHours*0.5;
    }

    public void water(int amount){
        //Erhöht den Wert von waterLevel
        this.waterLevel += amount;
    }

    public boolean needsWater(){
         //Kontrolliert ob die Variable waterLevel kleiner oder gleich 5 ist
        if(this.waterLevel <= 5) 
            return true;
        else
            return false;
    }
}