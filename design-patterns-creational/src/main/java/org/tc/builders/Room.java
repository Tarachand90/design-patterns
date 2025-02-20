package org.tc.builders;

// Room class with its own builder
public class Room {
    private final String name;
    private final int size;

    private Room(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Room{name='" + name + "', size=" + size + " sq ft}";
    }

    public static class Builder {
        private  String name;
        private  int size;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(int size) {
            if (size <= 0) {
                throw new IllegalArgumentException("Room size must be greater than 0.");
            }
            this.size = size;
            return this;
        }

        public Room build() {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Room name cannot be null or empty.");
            }
            return new Room(this);
        }

    }
}
