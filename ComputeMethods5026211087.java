import java.util.Random;

public class ComputeMethods5026211087 {
	public double fToC(double degreesF){
       	return ((5.0/9.0)*(degreesF-32));
   	}
	public double hypotenuse (int a, int b){
        int c;
        c = (int) Math.sqrt(a*a + b*b);
        return c;
   	}
    	public int roll(){
        return (int)(12.0*Math.random()+1);
    	}
    
	}

