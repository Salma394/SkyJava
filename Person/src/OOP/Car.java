package OOP;

public class Car {
   private String manufacturer;
   private String model;
    private String colour;
    private int age;
    private int mileage;
    private static String carType = "Vehicle";

    public Car (){

    }

    public Car(String manufacturer,String model,String colour,int mileage,int age){
        this.manufacturer = manufacturer;
        this.model= model;
        this.colour= colour;
        this.mileage = mileage;
        this.age = age;

    }


    public double calcMileage (){
        return ((100-age)/100.0)* mileage;
    }
    public String toString(){
        return ("Hello my car is a "+ colour + " "+  manufacturer +" "+  model+ " it is " + age + " years old. That has "+ calcMileage()+ " miles."   );
    }

    public static void setCarType(String carType){
        Car.carType=carType;
    }
    public static String getCarType(){
        return carType;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String getModel(){
        return model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColour(){
        return colour;
    }

    public int getAge(){
        return age;
    }

    public int getMileage(){
        return mileage;
    }



}
