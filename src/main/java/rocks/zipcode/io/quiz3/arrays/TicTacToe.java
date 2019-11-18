package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] ticBoard;

    public TicTacToe(String[][] board) {
        this.ticBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] rowArray = new String[2];
        for (int i = 0; i < ticBoard.length; i++){
            if (ticBoard[i][0].equals(value) && ticBoard[i][1].equals(value) && ticBoard[i][2].equals(value)){
                Arrays.copyOf(ticBoard, rowArray.length);
                ticBoard[i] = rowArray;
            }
        }
        return rowArray;
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;

    }

    public String[][] getBoard() {
        return null;
    }
}
