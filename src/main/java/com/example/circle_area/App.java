
package com.example.circle_area;

public class App {

    public static double calculateArea(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        double radius = 5;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea(radius));
    }
}
