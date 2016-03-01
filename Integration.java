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
        double [] epsilons = new double [120];
        double a = 0 ;
        double b = 30;
        int h = 1;
        epsilons [0] = getLeftHandSum (a,b, h);
        /**/
        epsilons [1] = getRightHandSum (a,b, h);
        epsilons [2] = getMidpointSum (a,b, h);
       for (int i = 3 ; i < epsilons.length; i++ ){
        epsilons [i] = getLeftHandSum (a,b, h);
        /**/
        epsilons [i+1] = getRightHandSum (a,b, h);
        epsilons [i+2] = getMidpointSum (a,b, h); 
        h*=2;
       }
       
       for (int i = 3 ; i < epsilons.length; i++ ){
        double current = epsilons [i];
        double oldcurrent = epsilons [i-3];
        double approx = 100 * ((current-oldcurrent)/current);
        epsilons [i] =  approx;
        
       }
       
       
       
       //Get the approximations 
       
       
       
       
       
       
       
       
       
       
    }
    
      public static  void printIt(double[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int b = 0; b < a[0].length; b++) {
        System.out.print(a[i][b] + " ");

      }
      System.out.println();

    }
    System.out.println();



  }
  //Create following methods.
  public static double Simpsons (){
  }
  public static double booles (){
  }
  public static double trapezoidal (){
  }
    public static double getArea (double length , double width){
        return length * width ;
    }
    
    public static double function (double xValue){
        double fun = 200 * (xValue/(xValue+5)) * Math.pow(Math.E,-(2*xValue/30));
        return fun;
        
    }
    public static double getLeftHandSum(double a , double b, int numOfSquares){
       double sum = 0 ; 
       double change = getChange (a,b,numOfSquares);
       while (a < b){
           sum += getArea(function(a), change);
           a += change ;
       }
       return sum;
    }
    public static double getRightHandSum(double a , double b, int numOfSquares){
       double sum = 0 ; 
       
       double change = getChange (a,b,numOfSquares);
       while (a < b){
           a += change ;
           sum += getArea(function(a), change);
       }
       return sum;
    }
    public static double getMidpointSum (double a , double b , int numOfSquares){
        
         double sum = 0 ; 
       
       double change = getChange (a,b,numOfSquares)/2;
       while (a < b){
           a += change ;
           sum += getArea(function(a), change*2);
       }
       return sum;
        
    }
    public static double getChange (double a , double b, int numOfSquares){
        return (a+b)/numOfSquares;
    }
    
}
