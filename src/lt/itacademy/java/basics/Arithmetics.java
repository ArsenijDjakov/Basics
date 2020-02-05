package lt.itacademy.java.basics;

public class Arithmetics {

    int volume(int size) {
        return size * size * size;
    }

    int perimemeter (int size){
        return size*size;
    }
    double converter (double feet, double inches){
        double feetToCm = feet * 30.48;
        double inchesToCm = inches * 2.54;
        return feetToCm + inchesToCm;
    }
}
