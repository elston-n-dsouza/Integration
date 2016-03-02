/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 *
 * @author Teacher
 */
public class Integration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
//        double[] epsilons = new double[120];
//        double a = 0;
//        double b = 30;
//        int h = 1;
//        epsilons[0] = getLeftHandSum(a, b, h);
//        /**/
//        epsilons[1] = getRightHandSum(a, b, h);
//        epsilons[2] = getMidpointSum(a, b, h);
//        for (int i = 3; i < epsilons.length; i++) {
//            epsilons[i] = getLeftHandSum(a, b, h);
//            epsilons[i + 1] = getRightHandSum(a, b, h);
//            epsilons[i + 2] = getMidpointSum(a, b, h);
//            h *= 2;
//        }
//
//        for (int i = 3; i < epsilons.length; i++) {
//            double current = epsilons[i];
//            double oldcurrent = epsilons[i - 3];
//            double approx = 100 * ((current - oldcurrent) / current);
//            epsilons[i] = approx;
//
//        }
//        //Print 
//        
//        printIt(epsilons);
//
//        
//        Testing methods
//        while (h > 0){
//            System.out.println(trapezoidal(a,b,h));
//            System.out.println(getLeftHandSum(a,b,h));
//            h *= 2;
//        }
        //Get the approximations 










    }

    public static void printIt(double[] a) {
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");

            }
            System.out.println();

        }

//
}

abstract class Integrator {
    private double a ; 
    private double b; 
    Integrator (double a , double b){
        this.a = a ; 
        this.b = b;
        
    }
    
    
       public  double trapezoidal( int numOfSquares) {
       double sum = 0;

        double change = getChange( numOfSquares);
        while (a < b) {
            a   += change;
            sum += getTrapezoidalArea(function(a),function(a+change), change);
        }
        return sum;  
    }
    public  double getTrapezoidalArea ( double a , double b , double delta ){
        return 0.5*(a+b)*delta;
    }

    public  double getRightHandSum(int numOfSquares) {
        double sum = 0;

        double change = getChange( numOfSquares);
        while (a < b) {
            a += change;
            sum += getArea(function(a), change);
        }
        return sum;
    }

    public  double getMidpointSum( int numOfSquares) {

        double sum = 0;

        double change = getChange( numOfSquares) / 2;
        while (a < b) {
            a += change;
            sum += getArea(function(a), change * 2);
        }
        return sum;

    }

    public  double getChange( int numOfSquares) {
        return (a + b) / numOfSquares;
    }
    public  double getLeftHandSum(double a, double b, int numOfSquares) {
    double sum = 0;
    double change = getChange( numOfSquares);
    while (a < b) {
        sum += getArea(function(a), change);
        a += change;
    }
    return sum;
    }
    
    
    public  double getArea(double length, double width) {
        return length * width;
    }

    public abstract double function (double xValue);
    
    public double boole(double a , double b){
        double diff = b - a;
        double change = getChange (4);
        double sum = 0;
        sum = 7*(function(a)) + 32*(function(a+2*change))+ 12*(function (a+3*change))+ 32 *function (a+4*change)+ 7*function (a+5*change);
        return (double)diff * sum;
    }
    
}
  
class Polynomial extends Integrator {
    
}




///
//
//    
//
//    public static double getArea(double length, double width) {
//        return length * width;
//    }
//
//    public static double function(double xValue) {
//        double fun = 200 * (xValue / (xValue + 5)) * Math.pow(Math.E, -(2 * xValue / 30));
//        return fun;
//
//    }
//    public static double function2 (double xValue ){
//        
//    } 
//    public static double function3 (double xValue){
//        
//    }
//    public static double function (double xValue){
//        
//    }
//
//    public static double getLeftHandSum(double a, double b, int numOfSquares) {
//        double sum = 0;
//        double change = getChange(a, b, numOfSquares);
//        while (a < b) {
//            sum += getArea(function(a), change);
//            a += change;
//        }
//        return sum;
//    }
//
//    public static double Simpsons(double a, double b, int numOfSquares) {
//        
//    }
//
//    public static double booles(double a, double b, int numOfSquares){
//    }
//
//    public static double trapezoidal(double a, double b, int numOfSquares) {
//       double sum = 0;
//
//        double change = getChange(a, b, numOfSquares);
//        while (a < b) {
//            a   += change;
//            sum += getTrapezoidalArea(function(a),function(a+change), change);
//        }
//        return sum;  
//    }
//    public static double getTrapezoidalArea (double a ,double b , double delta ){
//        return 0.5*(a+b)*delta;
//    }
//
//    public static double getRightHandSum(double a, double b, int numOfSquares) {
//        double sum = 0;
//
//        double change = getChange(a, b, numOfSquares);
//        while (a < b) {
//            a += change;
//            sum += getArea(function(a), change);
//        }
//        return sum;
//    }
//
//    public static double getMidpointSum(double a, double b, int numOfSquares) {
//
//        double sum = 0;
//
//        double change = getChange(a, b, numOfSquares) / 2;
//        while (a < b) {
//            a += change;
//            sum += getArea(function(a), change * 2);
//        }
//        return sum;
//
//    }
//
//    public static double getChange(double a, double b, int numOfSquares) {
//        return (a + b) / numOfSquares;
//    }
