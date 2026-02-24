public class Computer {

    // Required parameters
    private final String cpu;
    private final String ram;
    private final String storage;

    // Optional parameters
    private final boolean graphicsCard;
    private final boolean bluetooth;
    private final boolean wifi;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + storage + "\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Bluetooth: " + bluetooth + "\n" +
                "WiFi: " + wifi;
    }

    // Static Builder class
    public static class Builder {

        // Required parameters
        private final String cpu;
        private final String ram;
        private final String storage;

        // Optional parameters - initialized to default values
        private boolean graphicsCard = false;
        private boolean bluetooth = false;
        private boolean wifi = false;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder setGraphicsCard(boolean value) {
            this.graphicsCard = value;
            return this;
        }

        public Builder setBluetooth(boolean value) {
            this.bluetooth = value;
            return this;
        }

        public Builder setWifi(boolean value) {
            this.wifi = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}