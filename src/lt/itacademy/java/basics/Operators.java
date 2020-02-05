package lt.itacademy.java.basics;

public class Operators {

    String triangle (int side1, int side2, int side3){
        if (side1 == side2 && side1 == side3) return "Equilaterial";
        else if (side1 == side2 || side1 == side2 || side3 == side2) return "Isosceles";
        else return "Scalene";
    }
    String reach (int destination, double fuelInTank, double fuelUsage, double cost){
        double possibleDestination = 100*fuelInTank/fuelUsage;
        double fuelLeft =fuelInTank - destination*0.01*fuelUsage;
        if (possibleDestination>=destination)
        {
            return "Car is able to reach the destination. It will have " + fuelLeft + " liters of fuel left.";
        }
        else {
            return "Car is not able to reach the destination. It needs " + fuelLeft*-1  + " of fuel more. It will cost " + cost + ".";
        }
    }

}
