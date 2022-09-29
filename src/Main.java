import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

         double Celsius;
         double Far;
         String Trash = "";


        Celsius = in.nextInt();
         in.nextLine();
         System.out.println("Enter the temperature in celsius ");

         Far = Celsius * 1.8 + 32;

        System.out.println("\n Your conversion is: " +Far);


        if(in.hasNextInt()) {
            Celsius = in.nextInt();
            in.nextLine();
            System.out.println("The Temp is " + Far);
        }

        else {


            Trash = in.nextLine();
            System.out.println(Trash + " is not a valid number");
        }
    }
}