package com.example.p1;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        drive(car);
        flow(boat);
    }
    static void drive(Car car) {
        car.drive();
    }

    static void flow(Boat boat) {
        boat.flow();
    }

    static class Car{
        public void drive() {
            System.out.println("Many code: car drive");
        }
    }

    static class Boat{
        public void flow() {
            System.out.println("Many code: boat flow");
        }
    }
}
