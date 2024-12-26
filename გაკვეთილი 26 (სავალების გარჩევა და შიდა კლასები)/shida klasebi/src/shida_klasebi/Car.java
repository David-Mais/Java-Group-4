package shida_klasebi;

public class Car {
    private String make;
    private String model;
    private Engine engine;

    private class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }

    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(horsePower);
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

    public void getEngineInfo() {
        System.out.println(engine.horsePower);
    }


}
