import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print ( c );
            }
            System.out.println ();
        }
    }

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-',},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard ( gameBoard );

        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter your placement (1-9): ");
        int pos = scan.nextInt ();

        System.out.println (pos);

    }

}