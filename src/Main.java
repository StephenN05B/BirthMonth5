import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month: [1-12]");
        if(console.hasNextInt());
        {
            birthMonth = console.nextInt();
            console.nextLine(); //clear the buffer
            if(birthMonth >= 1 && birthMonth <= 12);
            {
                System.out.println("You said your birth month is " + birthMonth);
            }
                else
            {

                System.out.println("Not sure what month" + birthMonth + "is");
            }
        }
        else
        {
            trash = console.nextLine();
            System.out.println("You said your birth month was " + trash);
            System.out.println("Run the program again!");
        }



    }
}