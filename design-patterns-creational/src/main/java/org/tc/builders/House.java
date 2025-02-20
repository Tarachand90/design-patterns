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
    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        // Deep copy: Create a new list and add each element from the original list
        this.roomList = Collections.unmodifiableList(
                new ArrayList<>(builder.roomList));
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

    // Static nested Builder class
    public  static class Builder {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        private  List<Room> roomList;
        // Step-by-step configuration methods
       public Builder(int rooms, int bathrooms) {
           if(rooms <= 0) {
               throw new IllegalArgumentException("Rooms must be greater than 0.");
           }

           if(bathrooms <= 0) {
               throw new IllegalArgumentException("Bathrooms must be greater than 0.");
           }
           this.rooms = rooms;
           this.bathrooms = bathrooms;
           this.roomList = new ArrayList<>();
       }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setGarden(boolean hasGarden) {
           if(hasGarden && rooms < 2) {
               throw new IllegalArgumentException("A house with a garage must have at least 2 rooms.");
           }
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {

            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder addRoom(Room room) {
           if(room == null) {
               throw new IllegalArgumentException("Room cannot be null.");
           }
           roomList.add(room);
           return this;
        }

        public House build() {
            if (hasSwimmingPool && !hasGarden) {
                throw new IllegalArgumentException("A house with a swimming pool must have a garden.");
            }

            if(roomList.size() != rooms) {
                throw new IllegalArgumentException("Number of rooms must match the specified rooms count.");
            }
            return new House(this);
        }
    }
}
