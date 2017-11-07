import java.util.Scanner;

public class witaj_swiecie {

    public static String welcomeMessage = "Witaj swiecie!";
    public static String exitMessage = "Wpisz exit i wcisnij ENTER aby zamknac aplikacje ";
    public static String input;

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println(welcomeMessage+"\n");
       do{
            System.out.println(exitMessage);
            input = userInput.nextLine();

        }while(!input.contains("exit"));
    }
}
