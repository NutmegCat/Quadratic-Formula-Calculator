//Aaron Prince Anu

class roots
{
    public static void main(String[] args) 
    {
        //declare vars
        double a;
        double b;
        double c;
        double firstRoot;
        double secondRoot;
        final double PRECISION = 0.01;

        //Inputs
        System.out.println("\nWhat is your a value?");
        a = In.getDouble();

        System.out.println("\nWhat is your b value");
        b = In.getDouble();

        System.out.println("\nWhat is your c value");
        c = In.getDouble();

        //Calculate

        firstRoot = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
        secondRoot = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);

        //Round

        double firstRoundedRoot = Math.round(firstRoot / PRECISION) * PRECISION;
        double secondRoundedRoot = Math.round(secondRoot / PRECISION) * PRECISION;

        //Output
        System.out.println("\nThe first root is: " + firstRoundedRoot);        
        System.out.println("The second root is: " + secondRoundedRoot);    
    }
}