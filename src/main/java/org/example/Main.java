package org.example;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Долгота1 в градусах");
        double a1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Широта1 в градусах");
        double b1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Долгота2 в градусах");
        double a2 = Math.toRadians(scanner.nextDouble());
        System.out.println("Широта2 в градусах");
        double b2 = Math.toRadians(scanner.nextDouble());

        double distance = Main(a1, b1, a2, b2);
        System.out.printf("ОТВЕТ: %.3f километра\n", distance);
        }
        static final double RADIUSZEMLI = 6371;
        static double Main(double a1, double b1, double a2, double b2)
        {
            double da = a2 - a1;
            double db = b2 - b1;

            double a = Math.pow(Math.sin(da / 2), 2) + Math.cos(a1) * Math.cos(a2) * Math.pow(Math.sin(db / 2), 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 -a));
            return RADIUSZEMLI * c;
        }
    }
