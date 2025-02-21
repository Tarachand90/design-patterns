package org.tc.builders;

public class HouseBuilderpatternTest {

    public static void main(String[] args) {
        // Build individual rooms using the Room.Builder
        Room livingRoom = new Room.Builder()
                .setName("Living Room")
                .setSize(400)
                .build();

        Room kitchen = new Room.Builder()
                .setName("Kitchen")
                .setSize(250)
                .build();

            Room bedroom = new Room.Builder()
                    .setName("Bedroom")
                    .setSize(300)
                    .build();


        House house = new House.BuilderStep1(3, 2)
                        .setMandatory()
                        .setGarage(true)
                        .setGarden(true)
                .finishOptions()
                .addRoom(livingRoom)
                .addRoom(kitchen)
                .addRoom(bedroom)
                .build();



        System.out.println(house);

        Room guestRoom = new Room.Builder()
                .setName("Guest Room")
                .setSize(30)
                .build();


        // Rebuilding house with extra room and bathroom
        House house2 = House.BuilderStep1.rebuildWithChanges(house, 1, 1)
                .setGarage(false)
                .setSwimmingPool(true)
                .finishOptions(house)
                .addRoom(guestRoom)
                .build();

        System.out.println(house2);

    }
}
