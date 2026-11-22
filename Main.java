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
        int relicMap=4;
        int relicPlayer=0;
        char move= scanner.next().charAt(0);//I have planned to move the character with w a s d keys
        System.out.println("Please enter the row value and column value of the map (Both between 5 and 12 both included)");
        System.out.println("Row: ");
        int mapRow=scanner.nextInt();
        System.out.println("Column: ");
        int mapCol=scanner.nextInt();
        if(mapCol>=12||mapCol<=5||mapRow>=12||mapRow<=5){
            System.out.println("Please obey the border rules.");
            System.exit(1);
        }
        int energy=4*mapCol*mapRow;
        final int maxEnergy=4*mapCol*mapRow;//i havent use ai here i google'd.
        
    }
}