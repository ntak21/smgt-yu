import java.util.Random;
public class TestClass5026211087 {

    public static void main(String args[]) {
        ComputeMethods5026211087 cm = new  ComputeMethods5026211087();
        double temp = cm.fToC(100);
        double hypo = cm.hypotenuse(6,8);
        int rdice = cm.roll();
        
        System.out.println("Your temperature in celcius is "+ temp);
        System.out.println("Hypotenuse is "+ hypo);
        System.out.println("The sum of the dice values is "+ rdice);
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
    }
}