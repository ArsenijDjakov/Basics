package lt.itacademy.java.basics;

public class Loops {

    String forCalculator(int days) {
        int minutes = 0;
        int hours = 0;
        for (int i = 1; i <= days; i++) {
            hours += 24;
            minutes += 1440;
        }
        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
    }

    String whileCalculator(int days) {
        int minutes = 0;
        int hours = 0;
        while (days>0) {
            hours += 24;
            minutes += 1440;
            days--;
        }
        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
    }

    String factorial (int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return "Factorial of number " + number + " is " + result + ".";
    }
}