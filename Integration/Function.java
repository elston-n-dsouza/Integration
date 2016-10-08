
abstract class Function {
    //Limits of integration
    private double a ;
    private double b ;
    
    Function (){
        //Empty Constructor
    }
    Function (int a, int b){
        this.a = a;
        this.b = b;
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
   /*
    Implement your own function
    */
   abstract public double f(double xValue);
    
    public double leftHandSum (int numRect){
        double sum = 0 ;
        double change = getChange (numRect);//Width of the rectangles
        double TempA = a;
        while (TempA < b){
            sum += f(TempA) * change;
            TempA += change;
        }
        return sum;
    }
    public double rightHandSum (int numRect){
        double sum = 0 ;
        double change = getChange (numRect);//Width of the rectangles
        double TempA = a;
        while (TempA < b){
            TempA += change;
            sum += f(TempA) * change;
        }
        return sum;
        
    }
    public double getTrapezoidalSum (int numRect){
         double sum = 0 ;
        double change = getChange (numRect);//Width of the rectangles
        while (a < b){
           sum += getTrapezoidArea(f(a),f(a+change),change);
            a += change;
        }
        return sum;
        
    }
    private double getTrapezoidArea (double f, double fP , double change){
        return 0.5 * (f+fP) * change;
    }
    public double getEpsilon (double current, double previous){
        return (100*(Math.abs(current-previous)))/current;
    }
    private double getChange (int numRect){
        return Math.abs(b-a) / numRect;
    }
    public void printEpsilonSmaller(){
        int numOfRectangles = 1;
        double previousSum, currentSum ;
        
        previousSum = getMidpointSum(numOfRectangles);   
        while (true){//Infinite Loop
            numOfRectangles *= 2;

            currentSum = getMidpointSum(numOfRectangles);
            System.out.println(getEpsilon (currentSum,previousSum));
            previousSum = currentSum;
        }
    }
   
      public double getMidpointSum(int numOfSquares) {

        double sum = 0;
        double TempA = a;
        double change = getChange(numOfSquares);
        TempA += change/2;//Goes the x value of the midpoint
        while (TempA < b) {
            sum += (f(TempA)*(change));
            TempA += change;
        }
        return sum;

    }
    
    
}





















class FunA extends Function {
    //Limits of integration
    private double a ;
    private double b ;
    
     FunA(int a, int b){
       super (a, b);
        
    }
   public double f(double xValue){
        return 200 * (xValue / (xValue + 5)) * Math.pow(Math.E, -(2 * xValue / 30));

   }
 

    
}
class FunB extends Function {
    //Limits of integration
    private double a ;
    private double b ;
   
     FunB(int a, int b){
       super (a, b);
        
    }
   public double f(double xValue){
       return 1-xValue-Math.pow(-4*xValue, 3)+Math.pow(2*xValue, 5);

   }

    
}



class FunC extends Function {
    //Limits of integration
    private double a ;
    private double b ;
    
     FunC(int a, int b){
       super (a, b);
        
    }
   public double f(double xValue){
       return Math.pow((xValue + (1/xValue)),2);

   }

    
}


