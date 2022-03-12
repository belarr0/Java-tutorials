public class Vehicle {
    private String model;
    private int power;
    private int speed;

    Vehicle(){}

    Vehicle(String model, int power, int speed){
        this.model = model;
        this.power = power;
        this.speed = speed;
    }

    public void getModel() {
        System.out.println("Model: " + model);
    }

    public void setModel(String m) {
        model = m;
    }

    public void getPower() {
        System.out.println("Power: " + power + " hp");
    }

    public void setPower(int p) {
        power = p;
    }

    public void getSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }

    public void setSpeed(int s) {
        speed = s;
    }

}
