public class Car {
    private String make;
    private String model;
    private String licensePlate;
    private Engine engine;

    public Car(String make, String model, String licensePlate, Engine engine) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static class Engine {
        private String fuelType;
        private int cylinders;
        private double mpg;

        public Engine(String fuelType, int cylinders, double mpg) {
            this.fuelType = fuelType;
            this.cylinders = cylinders;
            this.mpg = mpg;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public int getCylinders() {
            return cylinders;
        }

        public void setCylinders(int cylinders) {
            this.cylinders = cylinders;
        }

        public double getMpg() {
            return mpg;
        }

        public void setMpg(double mpg) {
            this.mpg = mpg;
        }
    }
}
