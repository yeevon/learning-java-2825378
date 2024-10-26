import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeate? If so, answer yes");
            String userInput = input.next();

            isOnRepeat = !userInput.equals("yes");
        }
        System.out.println("Playing next song");
    }
}
