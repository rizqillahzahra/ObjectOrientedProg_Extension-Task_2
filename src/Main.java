/**
 *
 * @author Zahra
 */
import java.util.Scanner;

public class Main {
    private static Scanner obj = new Scanner(System.in);
    private static Hotel NewBooking = new Hotel();
    public static void main(String[] argsStrings) {

        System.out.println("Welcome to Hotel Transylvania!");
        System.out.println("------------------------------");
        System.out.print("What's your name? ");
        String userName = obj.nextLine();  
        NewBooking.setVisitor(userName);
        System.out.println("Where do you want to stay today Mr/Mrs " + NewBooking.getVisitor() + "?"); 
        System.out.println("------------------------------");
        
        System.out.println("Available Room Type:");
        System.out.println("1. Standard Room");
        System.out.println("2. Superior Room");
        System.out.println("3. Deluxe Room");
        System.out.println("4. Suite Room");

        System.out.print("Choose your room type: ");
        int Input = obj.nextInt();
        NewBooking.setTypeKamar(Input);
        NewBooking.setHargaKamar(Input);
        System.out.println("You choose " + NewBooking.getTypeKamar(Input) + ".");
        System.out.println("------------------------------");

        System.out.print("How long you going to stay at Hotel Transylvania? Please type in number for days: ");
        int Days = obj.nextInt(); 
        NewBooking.setDurasiInap(Days);
        NewBooking.setTotalBayar(Input);
        System.out.println("------------------------------");

        System.out.println("------------SUMMARY------------");
        System.out.println("Your Name: " + NewBooking.getVisitor());
        System.out.println("You choose: " + NewBooking.getTypeKamar((int) Input) + ". Price: Rp" + NewBooking.getHargaKamar(Input) + "/day.");
        System.out.println("Staying for: " + NewBooking.getDurasiInap() + " days.");
        System.out.println("To Pay: Rp" + NewBooking.getTotalBayar());
        System.out.println("Thank you for choosing us!");
        System.out.println("----------END SUMMARY----------");
    }
}