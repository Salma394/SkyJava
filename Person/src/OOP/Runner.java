package OOP;

public class Runner {
    public static void main(String[] args) {
    Car VW = new Car();
        System.out.println(VW.toString());
        VW.setManufacturer("Volkswagen");
        VW.setModel("Golf");
        VW.setColour("Black");
        VW.setAge(5);
        VW.setMileage(15000);
        System.out.println(VW.toString());


        Car BMW = new Car("BMW","3Series","Black",1500,7);
        System.out.println(BMW.toString());

        Car.setCarType("Hybrid");
        System.out.println(BMW.getCarType());
        System.out.println(BMW);
    }

}