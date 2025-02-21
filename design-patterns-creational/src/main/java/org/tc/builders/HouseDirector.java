package org.tc.builders;

public class HouseDirector {

    private final House.BuilderStep1 builderStep1;

    public HouseDirector(House.BuilderStep1 builderStep1) {
        this.builderStep1 = builderStep1;
    }

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

    Room masterBedroom = new Room.Builder()
            .setName("Master Bedroom")
            .setSize(3000)
            .build();

    Room guestRoom = new Room.Builder()
            .setName("Guest Room")
            .setSize(500)
            .build();

    Room homeTheater = new Room.Builder()
            .setName("Home Theater")
            .setSize(1500)
            .build();

    // Construct a standard house
    public House constructStandardHouse() {
        return builderStep1.setMandatory()
                .setGarage(true)
                .setGarden(false)
                .setSwimmingPool(false)
                .finishOptions()
                .addRoom(bedroom)
                .addRoom(livingRoom)
                .build();
    }

    // Construct a luxury house
    public House constructLuxuryHouse() {
        return builderStep1.setMandatory()
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .finishOptions()
                .addRoom(masterBedroom)
                .addRoom(guestRoom)
                .addRoom(homeTheater)
                .addRoom(livingRoom)
                .build();
    }
}
