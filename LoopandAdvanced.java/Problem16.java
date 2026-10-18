
public class Problem16 {
     public static void main(String[] args) {
        char [][] seats ={

            {'0','X','0','0'},
            {'X','X','0','0'},
            {'0','0','X','0'}
        
    };

    int empty = 0;
    int occupied = 0;
    int maxOccupied = 0;
    int bestRow = 0;

    for( int row = 0; row < seats.length; row++){
        int rowOccupied = 0;
        
        for( int col = 0; col < seats[row].length; col++){

            if(seats[row][col] == 'X'){
                occupied++;
                rowOccupied++;
            }
            else {
                empty++;
            }
        }
        if(rowOccupied > maxOccupied){
            maxOccupied = rowOccupied;
            bestRow = row + 1;
        }
        int total = empty + occupied;
        double rate = (double)occupied / total * 100;

        System.out.println("Empty seats =" + empty );
        System.out.println("Occupied seats =" + occupied );
        System.out.printf("Occupancy rate = %.2f%%%n", rate);
        System.out.println("Row with most occupied seats = " + bestRow);

      }
    }
}

