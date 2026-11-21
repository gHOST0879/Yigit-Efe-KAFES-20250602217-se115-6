import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAIN MENU");
        System.out.println("1. New Game");
        System.out.println("2. Exit");
        int menu = scanner.nextInt();
        int status = 1;//Status 1.active 2.abandoned 3.defeat 4.victory
        int[][] position =new int[12][12];
        int relic=4;
        char move= scanner.next().charAt(0);//I have planned to move the character with w a s d keys
    }
}