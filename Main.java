import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char map[][] = new char[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                map[i][j] = j;
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
