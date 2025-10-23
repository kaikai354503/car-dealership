import java.util.Scanner;

public class HomeScreen {

    static Scanner scanner = new Scanner(System.in);

    public static void DisplayHomeScreen(){
        System.out.println("Please make a selection\n");
        System.out.println("1) Search by price range");
        System.out.println("2) search by make/model");
        System.out.println("3) search by year range");
        System.out.println("4) search by color");
        System.out.println("5) search by mileage");
        System.out.println("6) search by vehicle type");
        System.out.println("7) list all vehicles");
        System.out.println("8) add a vehicle");
        System.out.println("9) remove a vehicle");
        System.out.println("10) quit");

        String choice = scanner.nextLine() ;

        switch (choice){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
        }


    }
}
