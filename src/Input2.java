import java.util.Scanner;

public class Input2 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your first name :: ");
        String firstname = keyboard.nextLine();

        System.out.print("Enter your last name :: ");
        String lastname = keyboard.nextLine();

        System.out.println("####################");
        System.out.println("####################");
        System.out.println(firstname+" "+ lastname);
        System.out.println("####################");
        System.out.println("####################");
        System.out.println(lastname+","  + " "+firstname);
        System.out.println("####################");
        System.out.println("####################");



    }
}

