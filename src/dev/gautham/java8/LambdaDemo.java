package dev.gautham.java8;

interface Car {
    void start(int i);
}

class Suzuki implements Car {
    public void start(int i) {
        System.out.println("Starting Suzuki typically: " + i);
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Typical way of calling a method
        Car typicalCar = new Suzuki();
        typicalCar.start(1);

        // Anonymous class
        Car anonmyousCar = new Car() {
            public void start(int i) {
                System.out.println("Starting Suzuki using anonymous class: " + i);
            }
        };
        anonmyousCar.start(2);

        // Lambda code, removes many boilerplate codes // Check Consumer interface in Java 8
        Car lambaCar = i -> System.out.println("Starting Suzuki as an Lambda expression: " + i);
        lambaCar.start(3);
    }
}
