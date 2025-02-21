package org.tc.builders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class House {

    private final int rooms;  //required
    private final int bathrooms; //required
    private final boolean hasGarage; //Optional
    private final boolean hasGarden; //Optional
    private final boolean hasSwimmingPool; //Optional
    private final List<Room> roomList;

    // Private constructor ensures objects can only be created via the Builder
    private House(BuilderStep3 builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        // Deep copy: Create a new list and add each element from the original list
        this.roomList = Collections.unmodifiableList(
                new ArrayList<>(builder.roomList));
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                "roomList="+roomList+
                '}';
    }

    // Step 1: Set mandatory properties
    public static class BuilderStep1 {
        private int rooms;
        private int bathrooms;

        public BuilderStep1(int rooms, int bathrooms) {
            if(rooms <= 0) {
                throw new IllegalArgumentException("Rooms must be greater than 0.");
            }

            if(bathrooms <= 0) {
                throw new IllegalArgumentException("Bathrooms must be greater than 0.");
            }
            this.rooms = rooms;
            this.bathrooms = bathrooms;
        }

        public BuilderStep2 setMandatory() {
            return new BuilderStep2(rooms, bathrooms);
        }

        public static BuilderStep2 rebuildWithChanges(House house, int extraRooms, int extraBathrooms) {
            if(extraRooms < 0) {
                throw new IllegalArgumentException("Number of extra room can't be negative");
            }

            if(extraBathrooms < 0) {
                throw new IllegalArgumentException("Number of extra Bathroom can't be negative");
            }
            return new BuilderStep2(house.rooms + extraRooms, house.bathrooms + extraBathrooms)
                    .setGarage(house.hasGarage)
                    .setGarden(house.hasGarden)
                    .setSwimmingPool(house.hasSwimmingPool);
        }
    }

    // Step 2: Set optional properties
    public static class BuilderStep2 {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public BuilderStep2(int rooms, int bathrooms) {
            this.rooms = rooms;
            this.bathrooms = bathrooms;
        }

        public BuilderStep2 setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public BuilderStep2 setGarden(boolean hasGarden) {
            if(hasGarden && rooms < 2) {
                throw new IllegalArgumentException("A house with a garage must have at least 2 rooms.");
            }
            this.hasGarden = hasGarden;
            return this;
        }

        public BuilderStep2 setSwimmingPool(boolean hasSwimmingPool) {
            if (hasSwimmingPool && !hasGarden) {
                throw new IllegalArgumentException("A house with a swimming pool must have a garden.");
            }
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public BuilderStep3 finishOptions() {
            return new BuilderStep3(this);
        }

        // Overloaded method to support modification of an existing house
        public BuilderStep3 finishOptions(House house) {
            return new BuilderStep3(this, house);
        }
    }

    public static class BuilderStep3 {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        private  List<Room> roomList;

        public BuilderStep3(BuilderStep2 builder) {
            this.rooms = builder.rooms;
            this.bathrooms = builder.bathrooms;
            this.hasGarage = builder.hasGarage;
            this.hasGarden = builder.hasGarden;
            this.hasSwimmingPool = builder.hasSwimmingPool;;
            this.roomList = new ArrayList<>();
        }

        public BuilderStep3(BuilderStep2 builder, House house) {
            this(builder);
            this.roomList.addAll(house.getRoomList());
        }

        public BuilderStep3 addRoom(Room room) {
            if(room == null) {
                throw new IllegalArgumentException("Room cannot be null.");
            }

            roomList.add(room);
            return this;
        }

        public House build() {
            if (roomList.size() != rooms) {
                throw new IllegalArgumentException("Number of rooms must match the specified count.");
            }

            return new House(this);
        }

        
    }
}
