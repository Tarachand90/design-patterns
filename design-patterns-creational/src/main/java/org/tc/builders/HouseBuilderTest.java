package org.tc.builders;

public class HouseBuilderTest {

    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new House.BuilderStep1(2, 1));

        // Build a standard house
        House standardHouse = director.constructStandardHouse();
        System.out.println("Standard House: " + standardHouse);

        // Build a luxury house
        House luxuryHouse = new HouseDirector(new House.BuilderStep1(4, 3))
                .constructLuxuryHouse();
        System.out.println("Luxury House: " + luxuryHouse);
    }
}
