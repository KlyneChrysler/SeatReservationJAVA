import java.util.Scanner;

public class SeatReservation {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        String[][] seat = new String[10][4];
        
        int rres , rcol;
        for ( int row = 0; row < seat.length; row++ ) {
                for ( int col = 0; col < seat[row].length; col++ ) {
                    seat[row][col] = "*";
                }
        }

        do {
            System.out.println("BUS SEAT RESERVATION: ");;
            System.out.print("\t");
            for ( int x = 1; x <= 4; x++ ) {
                System.out.print("COL " + x + "\t");
            }
            System.out.println();
            for ( int row = 0; row < seat.length; row++ ) {
                System.out.print("ROW " + (row + 1) + "\t|");
                for ( int col = 0; col < seat[row].length; col++ ) {
                    System.out.print(seat[row][col] + "\t");
                }
                System.out.println();
            }
            
            System.out.print("ENTER ROW AND COLUMN NUMBER TO RESERVE SEPARATED BY SPACE(ENTER A NEGATIVE NUMBER TO EXIT): ");
            rres = scan.nextInt();
            if ( rres <= -1 ) {
                System.out.println("PROGRAM EXIT");
                break;
            }
            rcol = scan.nextInt();
            rres-=1;
            rcol-=1;
            seat[rres][rcol] = "X"; 
        } while ( true );
    }
}