package lt.itacademy.java.basics;

public class Calculator {

   String rectangle (int a, int b){
        int p,s;
        p = (a+b)*2;
        s = a*b;
        return "Rectangle perimeter is " + p + " and area is " + s + ".";
    }

    String square (int a){
        int p,s;
        p = a*4;
        s = a*a;
        return "Rectangle perimeter is " + p + " and area is " + s + ".";
    }
    String triangle (int a, int b, int c){
        int p,s;
        p = a+b+c;
        s = (a+b)/2;
        return "Rectangle perimeter is " + p + " and area is " + s + ".";
    }
}
