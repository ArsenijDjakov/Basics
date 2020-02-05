package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        //task 1
//        Scanner scanner = new Scanner(System.in);
//        String name  = scanner.nextLine();
//        String surname = scanner.nextLine();
//        Integer age = scanner.nextInt();
//        System.out.println("Hello I am " + name + " " + surname + ". I am attending IT Academy 2020!" );
        //task 2
//        Scanner scanner = new Scanner(System.in);
//        boolean booleanPrimitive =  scanner.nextBoolean();
//        byte bytePrimitive =  scanner.nextByte();
//        char charPrimitive =  scanner.next().charAt(0);
//        float floatPrimitive =  scanner.nextFloat();
//        int intPrimitive =  scanner.nextInt();
//        short shortPrimitive =  scanner.nextShort();
//        System.out.println(charPrimitive + "" + intPrimitive + " w" + shortPrimitive + "r" + bytePrimitive + "d " + floatPrimitive + " " + booleanPrimitive);
        // task 3
//        Scanner scanner = new Scanner(System.in);
//        Integer size = scanner.nextInt();
//        Arithmetics arithmetics = new Arithmetics();
//        System.out.println(arithmetics.volume(size));
//        System.out.println(arithmetics.perimemeter(size));
        //task 4
//        Scanner scanner = new Scanner(System.in);
//        double feet = scanner.nextDouble();
//        double inches = scanner.nextDouble();
//        Arithmetics arithmetics = new Arithmetics();
//        System.out.println(arithmetics.converter(feet, inches));
//        //task 5
//        Scanner scanner = new Scanner(System.in);
//        int side1 = scanner.nextInt();
//        int side2 = scanner.nextInt();
//        int side3 = scanner.nextInt();
//        Operators operators = new Operators();
//        System.out.println("Triangle is " + operators.triangle(side1,side2,side3) + ". Sides:" + side1 + " " + side2 + " " + side3);
        //task 6
//        Scanner scanner = new Scanner(System.in);
//        int destination = scanner.nextInt();
//        double fuelInTank = scanner.nextDouble();
//        double fuelUsage = scanner.nextDouble();
//        double cost = scanner.nextDouble();
//        Operators operators = new Operators();
//        System.out.println("Destination is " + destination + "km. " + operators.reach(destination,fuelInTank,fuelUsage,cost));
        //task 7 and 8
//        Scanner scanner = new Scanner(System.in);
//        int days = scanner.nextInt();
//        Loops loops = new Loops();
//        System.out.println(loops.forCalculator(days));
//        System.out.println(loops.whileCalculator(days));
        //task 9
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        Loops loops = new Loops();
//        System.out.println(loops.factorial(number));
        //task 10
        boolean work = true;
        while (work) {
            Calculator calculator = new Calculator();
            System.out.println("If you want to finish work press 'q'.");
            System.out.println("Please, choose figure: 1 - Triangle; 2 -  Rectangle; 3 - Square.");
            Scanner scanner = new Scanner(System.in);
            String figure = scanner.nextLine();
            int a,b,c;
            switch (figure) {
                case "1":
                    System.out.println("Please, input triangle 3 sides sizes:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    c = scanner.nextInt();
                    if (a<=0||b<=0||c<=0)
                        System.out.println("Wrong values.");
                    else  System.out.println(calculator.triangle(a,b,c));
                    break;
                case "2":
                    System.out.println("Please, input rectangle 2 sides sizes:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    if (a<=0||b<=0)
                        System.out.println("Wrong values.");
                    else System.out.println(calculator.rectangle(a,b));
                    break;
                case "3":
                    System.out.println("Please, input square side size:");
                    a = scanner.nextInt();
                    if (a<=0)
                        System.out.println("Wrong value.");
                    else System.out.println(calculator.square(a));
                    break;
                case "q":
                    work = false;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}