import java.util.Scanner;

public class Main {

    public static void annouceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random word and Enter to start developer tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
    public static void main(String[] args) {
        annouceDeveloperTeaTime();
    }

}
