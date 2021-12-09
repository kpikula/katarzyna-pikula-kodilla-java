package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoard.add(new SudokuRow());
        }
    }

    public SudokuElement getElement(int col, int row) {
        return sudokuBoard.get(row).getSudokuRow().get(col);
    }

    public void setElement(int col, int row, int value) {
        sudokuBoard.get(row).getSudokuRow().set(col, new SudokuElement(value));
    }

    @Override
    public String toString() {

        return sudokuBoard.toString().replaceAll(",", " |").replaceAll("[\\[\\]]", " ");
    }

    public void loadExample() {
        //wypełnić sudoku danymi przykładowymi
    }


}
