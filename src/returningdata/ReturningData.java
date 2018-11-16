/*
Mouner Dabjan
November 15 2018
Using created methods and returning the values 
 */

package returningdata;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class ReturningData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option; 
        Scanner keyedInput = new Scanner(System.in); 
        
        System.out.println("Please choose which method you want to try: ");   //itroducing the options to the user 
        System.out.println("");
        System.out.println("1. Find the average of your 10 school tests.");
        System.out.println("2. Find the missing angle in a triangle.");
        System.out.println("3. Find the midpoint of a line.");
        System.out.println("4. Find the area of a triangle.");
        System.out.println("5. Find the parameter of a rectangle.");
        System.out.println("6. Convert from meters to kilometers");
        System.out.println("7. Finding the accelaration of an object.");
        System.out.println("8. Adding two fraction.");
        System.out.println("9. Multiply two fractions.");
        System.out.println("10. Divide two fractions.");
        
        option = keyedInput.nextInt();           //getting the user's input 
        
        
        if (option==1)
        {
            int n1, n2 ,n3,n4,n5,n6,n7,n8,n9,n10;  //declaring the variables 
            
            System.out.println("Enter the 10 marks you want to get the average of: "); //getting the user's input 
            n1 = keyedInput.nextInt();
            n2 = keyedInput.nextInt();
            n3 = keyedInput.nextInt();
            n4 = keyedInput.nextInt();
            n5 = keyedInput.nextInt();
            n6 = keyedInput.nextInt();
            n7 = keyedInput.nextInt();
            n8 = keyedInput.nextInt();
            n9 = keyedInput.nextInt();
            n10 = keyedInput.nextInt();
           
            System.out.println("Your average is " + avgAndOut(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10));
        }
        
        if(option==2)
        {
            int angle1;                    //declaring the variables 
            int angle2; 
            
            System.out.println("Enter the value of the two present angles: "); //getting the user's input 
            angle1 = keyedInput.nextInt();
            angle2 = keyedInput.nextInt();
            
            System.out.println("The missing angle is " + angAndOut(angle1,angle2));
        }
        
        if(option==3)
        {
            double distance;
            
            System.out.println("Enter the distance of the line: ");
            distance = keyedInput.nextDouble();
            System.out.println("The midpoint of the line is " + midAndOut(distance));
            
        }
        
        if(option==4)
        {
            int height;
            int base;
            
            System.out.println("Enter the value of the height and base of the triangle: ");
            height = keyedInput.nextInt();
            base = keyedInput.nextInt();
            
            System.out.println("The area of the triangle is " + areaAndOut(height,base));
        }
        
        if(option==5)
        {
            int length;
            int width; 
            
            System.out.println("Enter the value of the length of the rectangle: ");
            length = keyedInput.nextInt();
            
            System.out.println("Enter the value of the width of the rectangle: ");
            width = keyedInput.nextInt();
            
            System.out.println("The parameter of the rectangle is " + parAndOut(length,width));
            
        }
        
        if(option==6)
        {
            double meters;
            
            System.out.println("Enter the number you want to conver to kilometers: ");
            meters = keyedInput.nextDouble();
            
            System.out.println("The value of the number is kilometers is " + kiloAndOut(meters));
        }
        
        if(option==7)
        {
            double velocity; 
            double velocity2; 
            double time; 
            
            System.out.println("Enter the value of the second velocity: ");
            velocity2= keyedInput.nextDouble();
            
            System.out.println("Enter the value of the first velocity: ");
            velocity = keyedInput.nextDouble();
            
            System.out.println("Enter the value of the total time: ");
            time = keyedInput.nextDouble();
            
            System.out.println("The value of the acceleration is " + accAndOut(velocity2,velocity,time));
        }
        
        if(option==8)
        {
            int den1;
            int num1;
            int den2;
            int num2; 
            
            System.out.println("Enter the numerator of the first fraction: ");
            num1 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the first fraction: ");
            den1 = keyedInput.nextInt();
            System.out.println("Enter the numerator of the second fraction: ");
            num2 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the second fraction: ");
            den2 = keyedInput.nextInt();
            
            addAndOut(num1,den1,num2,den2); 
            
        }
        
        if(option==9)
        {
            int num1;
            int den1;
            int num2;
            int den2;
            
            System.out.println("Enter the numerator of the first fraction: ");
            num1 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the first fraction: ");
            den1 = keyedInput.nextInt();
            System.out.println("Enter the numerator of the second fraction: ");
            num2 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the second fraction: ");
            den2 = keyedInput.nextInt();
            
            mulAndOut(num1,den1,num2,den2); 
            
        }
        
        if(option==10)
        {
            int num1;
            int den1;
            int num2;
            int den2; 
            
            System.out.println("Enter the numerator of the first fraction: ");
            num1 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the first fraction: ");
            den1 = keyedInput.nextInt();
            System.out.println("Enter the numerator of the second fraction: ");
            num2 = keyedInput.nextInt();
            System.out.println("Enter the denominator of the second fraction: ");
            den2 = keyedInput.nextInt();
            
            
            divAndOut(num1,den1,num2,den2);      
        }
            
    }
    
    /*
    This method is used to calculate the average of 10 school marks 
    */   
    
    public static double avgAndOut(int n1,int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10)        
    {
        double average =  (double) (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        return (average); 
    }
    
     /*
    Ths method is used to calculate the missing angle in a triangle
     */
  
    public static int angAndOut(int n1, int n2)
    {
        int missing = 180 - (n1+n2); 
        return(missing); 
    }
    /*
    This method is used to calculate the midpoint of a line 
     */
    public static double midAndOut(double n1)
    {
        double midpoint = n1/2;
        return(midpoint); 
                
    }
    
    /*
    This method calculates the area of the triangle 
    */
    public static int areaAndOut(int n1, int n2)
    {
        int area = (n1*n2)/2; 
        return(area); 
    }
    /*
    This method calculates the parameter of the triangle 
    */
    public static int parAndOut(int n1, int n2)
    {
        int parameter = (2*n1) + (2*n2); 
        return(parameter); 
    }
    /*
    This method converts from meters ot kilometers 
    */
    public static double kiloAndOut(double n1)
    {
        double kilometers = n1/1000;
        return(kilometers); 
    }
    /*
    This method calculates the acceleration 
    */
    public static double accAndOut(double n1, double n2, double n3)
    {
        double acceleration = (n1-n2)/n3; 
        return(acceleration); 
    }
    
    /*
    This method adds two fractions 
    */
    public static void addAndOut(int n1,int n2, int n3, int n4)
    {
        n1 = n1*n4;
        n2 = n2*n4; 
        n3 = n3*n4; 
        
        int sum = n1+n3;
        System.out.println("The sum of the two fractions " + sum + "/ " + n2);
        
    }
    /*
    This method multiplies two fractions 
    */
    public static void mulAndOut(int n1, int n2, int n3, int n4)
    {
        n1 = n1*n3;
        n2 = n2*n4; 
        
        System.out.println("The product of the two fractions is " + n1 + "/" + n2);
    }
    
    /*
    This method divides two fractions 
    */
    public static void divAndOut(int n1,int n2, int n3, int n4)
    {
        n1 = n1*n4;
        n2 = n2*n3;
        
        System.out.println("The quotient of the two fractions is " + n1 + "/" + n2);
    }
    
}
