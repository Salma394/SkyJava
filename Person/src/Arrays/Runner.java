package Arrays;

import java.util.ArrayList;
import OOP.Car;

public class Runner {
    public static void main(String[] args) {

        String [] cars= {"Mercedes","BMW","Ford","Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("The cars I own are: "  + cars[i]);
        }

        for (String car : cars) {
            System.out.println("Name: " + car);
        }

        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("BMW");
        cars1.add("Mazda");
        cars1.add("Ford");
        cars1.add("Mercedes");

        for(int i = 0; i <cars1.size();i++){
            System.out.println("The car I like is:"+ cars1.get(i));
}

    }
}
