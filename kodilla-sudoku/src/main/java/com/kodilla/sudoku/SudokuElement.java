package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static final int EMPTY = 0;
    private List<Integer> permissibleValues = new ArrayList<Integer>(value);

    public SudokuElement(int value) {
        this.value = value;
        permissibleValues();
    }

    public List<Integer> getPermissibleValues() {
        return permissibleValues;
    }

    public int getValue() {
        return value;
    }

    private void permissibleValues() {
        for (int i = 1; i < 10; i++) {
            permissibleValues.add(i);
        }
    }

    @Override
    public String toString() {
        return (value != EMPTY) ? "" + value : " ";
    }
}
