package org.tc.builders;

public class House {

    private final int rooms;  //required
    private final int bathrooms; //required
    private final boolean hasGarage; //Optional
    private final boolean hasGarden; //Optional
    private final boolean hasSwimmingPool; //Optional

    // Private constructor ensures objects can only be created via the Builder
    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    // Static nested Builder class
    public  static class Builder {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

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

        public House build() {
            if (hasSwimmingPool && !hasGarden) {
                throw new IllegalArgumentException("A house with a swimming pool must have a garden.");
            }
            return new House(this);
        }
    }
}
