package org.tc.builders;

public class HouseBuilderpatternTest {

    public static void main(String[] args) {
        // Constructing a simple house with 3 rooms, 2bathrooms and a garage
        House simpleHouse = new House.Builder(3, 2)
                .setGarage(true)
                .build();
        System.out.println("Simple House: " + simpleHouse);

        // Constructing a luxury house with a garden and swimming pool
        //5 rooms, 4 bathrooms

        House luxuryHouse = new House.Builder(5, 4)
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .build();
        System.out.println("Luxury House: " + luxuryHouse);
    }
}
