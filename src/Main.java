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
// 1 version - not complete
        //char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
        //{'-', '+', '-', '+', '-',},
        //{' ', '|', ' ', '|', ' '},
        //{'-', '+', '-', '+', '-'},
        //{' ', '|', ' ', '|', ' '}};

        //printGameBoard ( gameBoard );

        //Scanner scan = new Scanner (System.in);
        //System.out.println ("Enter your placement (1-9): ");
        //int pos = scan.nextInt ();

        //System.out.println (pos);

        // 2 version

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner ( System.in );
        int input;
        char turn = 'X';
        int currentTurn = 1;


        while (true) {
            do {
                System.out.print ( "Enter a position: " );
                input = scanner.nextInt ();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');
            pos[input - 1] = turn;

            System.out.println ( " " + pos[6] + " | " + pos[7] + " | " + pos[8] + " " );
            System.out.println ( "---+---+---" );
            System.out.println ( " " + pos[3] + " | " + pos[4] + " | " + pos[5] + " " );
            System.out.println ( "---+---+---" );
            System.out.println ( " " + pos[0] + " | " + pos[1] + " | " + pos[2] + " " );

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    ||pos[3] == turn && pos[4] == turn && pos[5] == turn
                    ||pos[6] == turn && pos[7] == turn && pos[8] == turn
                    ||pos[6] == turn && pos[3] == turn && pos[0] == turn
                    ||pos[7] == turn && pos[4] == turn && pos[1] == turn
                    ||pos[8] == turn && pos[5] == turn && pos[2] == turn
                    ||pos[6] == turn && pos[4] == turn && pos[2] == turn
                    ||pos[8] == turn && pos[4] == turn && pos[0] == turn) {
                System.out.println (turn + " is the Winner");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }

            currentTurn++;
            if (currentTurn > 9) {
                System.out.println ("DRAW");
                break;
            }

        }

    }
}