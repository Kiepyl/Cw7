public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start(){
        System.out.println("Auto robi wrum wrum z " + numberOfSeats + " osobami.");
    }

    @Override
    public void stop(){
        System.out.println("Auto robi stop z " + numberOfSeats + " osobami.");
    }
}