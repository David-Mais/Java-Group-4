public class Computer {
    private String manufacturerCountry;
    private String brand;
    private double price;
    private boolean warranty;

    public Computer(String manufacturerCountry, String brand, double price, boolean warranty) {
        this.manufacturerCountry = manufacturerCountry;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public class Monitor {
        private double diagonalLength;
        private String resolution;
        private int refreshRate;

        public Monitor(double diagonalLength, String resolution, int refreshRate) {
            this.diagonalLength = diagonalLength;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public double getDiagonalLength() {
            return diagonalLength;
        }

        public void setDiagonalLength(double diagonalLength) {
            this.diagonalLength = diagonalLength;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public int getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(int refreshRate) {
            this.refreshRate = refreshRate;
        }
    }

    public class Motherboard {
        private int slotCount;
        private String memoryType;
        private double fsbSpeed;

        public Motherboard(int slotCount, String memoryType, double fsbSpeed) {
            this.slotCount = slotCount;
            this.memoryType = memoryType;
            this.fsbSpeed = fsbSpeed;
        }

        public int getSlotCount() {
            return slotCount;
        }

        public void setSlotCount(int slotCount) {
            this.slotCount = slotCount;
        }

        public String getMemoryType() {
            return memoryType;
        }

        public void setMemoryType(String memoryType) {
            this.memoryType = memoryType;
        }

        public double getFsbSpeed() {
            return fsbSpeed;
        }

        public void setFsbSpeed(double fsbSpeed) {
            this.fsbSpeed = fsbSpeed;
        }
    }
}
