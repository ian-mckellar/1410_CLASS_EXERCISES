package review;

import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("ant");
        animals.add("ape");
        animals.add("cat");
        //System.out.println("Animals: " + animals);

        animals.add("dog");
        //System.out.println("Animals: " + animals);

        animals.add(2, "bee");
        //System.out.println("Animals: " + animals);

        animals.remove(1);
        System.out.println("Animals: ");

        for (String a : animals) {
            System.out.print(a + " ");
        }
        System.out.println();

        String firstAnimal = animals.get(0);
        System.out.println("First Animal: " + firstAnimal);

        String lastAnimal = animals.get(animals.size() - 1);
        System.out.println("Last Animal: " + lastAnimal);
    }
}