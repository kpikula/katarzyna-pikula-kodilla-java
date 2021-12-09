package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final List<SudokuElement> sudokuRow = new ArrayList<>();

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    public SudokuRow() {
        for(int i=0; i<9; i++) {
            sudokuRow.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    @Override
    public String toString() {
        return sudokuRow.toString().replaceAll(",", " |").replaceAll("[\\[\\]]", " ");
    }

}
