package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard sudokuBoard = new SudokuBoard();
            sudokuBoard.loadExample();
            gameFinished = theGame.resolveSudoku(sudokuBoard);
        }
    }

    private boolean resolveSudoku(SudokuBoard sudokuBoard) {
        return false;
    }
}
