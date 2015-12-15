package fain.ticTacToe;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Game Tic Tac Toe on table 3 x 3
 */

public class TicTacToe extends Applet implements ActionListener {
    Button squares[];
    Button newGameButton;
    Label score;
    int emptySquaresLeft = 9;

    /**
     * Metod Init -> its applet constructor
     */

    public void init() {
        // Set applet manager, color, shrift

        this.setLayout(new BorderLayout());
        this.setBackground(Color.CYAN);

        //set shrift and size
        Font appletFont = new Font("Monospased", Font.BOLD, 20);
        this.setFont(appletFont);

        //Create button New Game and reg in listener for action
        newGameButton = new Button("New Game");
        newGameButton.addActionListener(this);

        Panel topPanel = new Panel();
        topPanel.add(newGameButton);

        this.add(topPanel, "North");

        Panel centerPanel = new Panel();
        centerPanel.setLayout(new GridLayout(3, 3));
        this.add(centerPanel, "Center");

        score = new Label("Your Turn!");
        this.add(score, "South");

        //create array, we need save links on 9 buttons
        squares = new Button[9];

        //create buttons, save links on them in array
        //regi in them listener, color them
        //in orange color, and add them to panel
        for (int i = 0; i < 9; i++) {
            squares[i] = new Button();
            squares[i].addActionListener(this);
            squares[i].setBackground(Color.ORANGE);
            centerPanel.add(squares[i]);
        }
    }


    /**
     * This method will be work with all event
     *
     * @param ActioonEvent object
     */
    public void actionPerformed(ActionEvent e) {
        Button theButton = (Button) e.getSource();

        //this button new game
        if (theButton == newGameButton) {
            for (int i = 0; i < 9; i++) {
                squares[i].setEnabled(true);
                squares[i].setLabel("");
                squares[i].setBackground(Color.ORANGE);
            }

            emptySquaresLeft = 9;
            score.setText("Your Turn");
            newGameButton.setEnabled(false);
            return;
        }

        String winner = "";

        //its one of Kletka
        for (int i = 0; i < 9; i++) {
            if (theButton == squares[i]) {
                squares[i].setLabel("X");
                winner = lookForWinner();

                if (!"".equals(winner)) {
                    endTheGame();
                } else {
                    computerMove();
                    winner = lookForWinner();
                    if (!"".equals(winner)) {
                        endTheGame();
                    }
                }

                break;
            }
        } //end cykle

        if (winner.equals("X")) {
            score.setText("You Won!");
        } else if (winner.equals("O")) {
            score.setText("You Lost!");
        } else if (winner.equals("T")) {
            score.setText("It's a Tie!");
        }
    } //end method actionPerformed

    /**
     * This method work after every steps (hoda), to know Check Winner
     * Hes check every time columb and diagonal, he search every 3 pont with same result
     * (not null)
     *
     * @return "X", "O", "T", "";
     */

    String lookForWinner() {
        String theWinner = "";
        emptySquaresLeft--;

        if (0 == emptySquaresLeft) {
            return "T"; //set tie
        }

        //Check row, 0, 1, 2 elem in arr
        if (!squares[0].getLabel().equals("") &&
                squares[0].getLabel().equals(squares[1].getLabel()) &&
                squares[0].getLabel().equals(squares[2].getLabel())) {
            theWinner = squares[0].getLabel();
            highLightWinner(0, 1, 2);
            //Check 2nd row - elem arr 3, 4, 5;
        } else if (!squares[3].getLabel().equals("") &&
                squares[3].getLabel().equals(squares[4].getLabel()) &&
                squares[3].getLabel().equals(squares[5].getLabel())) {
            theWinner = squares[3].getLabel();
            highLightWinner(3, 4, 5);
            //Check 3rd row - elem arr 6, 7, 8;
        } else if (!squares[6].getLabel().equals("") &&
                squares[6].getLabel().equals(squares[7].getLabel()) &&
                squares[6].getLabel().equals(squares[8].getLabel())) {
            theWinner = squares[6].getLabel();
            highLightWinner(6, 7, 8);
            //Check Column arr 0 3 6
        } else if (!squares[0].getLabel().equals("") &&
                squares[0].getLabel().equals(squares[3].getLabel()) &&
                squares[0].getLabel().equals(squares[6].getLabel())) {
            theWinner = squares[0].getLabel();
            highLightWinner(0, 3, 6);
            //check 2nd column 1 4 7
        } else if (!squares[1].getLabel().equals("") &&
                squares[1].getLabel().equals(squares[4].getLabel()) &&
                squares[1].getLabel().equals(squares[7].getLabel())) {
            theWinner = squares[0].getLabel();
            highLightWinner(1, 4, 7);
            //check 3rd column 2 5 8
        } else if (!squares[2].getLabel().equals("") &&
                squares[2].getLabel().equals(squares[5].getLabel()) &&
                squares[2].getLabel().equals(squares[8])) {
            theWinner = squares[2].getLabel();
            highLightWinner(2, 5, 8);
            //Check Left diagonal 0 4 8
        } else if (!squares[0].getLabel().equals("") &&
                squares[0].getLabel().equals(squares[4].getLabel()) &&
                squares[0].getLabel().equals(squares[8].getLabel())) {
            theWinner = squares[0].getLabel();
            highLightWinner(0, 4, 8);
            //check right diagonal 2, 4, 6;
        } else if (!squares[2].getLabel().equals("") &&
                squares[2].getLabel().equals(squares[4].getLabel()) &&
                squares[2].getLabel().equals(squares[6].getLabel())) {
            theWinner = squares[2].getLabel();
            highLightWinner(2, 4, 6);
        }

        return theWinner;
    }

    /**
     * This method do rools (primeniaet nabor pravil),
     * Computer find best step. If step good not find ->
     * select random point
     */
    void computerMove() {
        int selectedSquare;

        //At first - Computer Try to find nearest point with hith Noul
        // he wont to win

        selectedSquare = findEmptySquare("O");

        //If he can find pond with 2 Noul
        //He will try to not add Good X (to another 2X) to opponent
        //He will set Noul near another 2 X
        if (-1 == selectedSquare) {
            selectedSquare = findEmptySquare("X");
        }

        //If selectedSquare still == -1,
        //He will try set Noul to Central point
        if ((-1 == selectedSquare) &&
                (squares[4].getLabel().equals(""))) {
            selectedSquare = 4;
        }

        //If central point not null
        //Set him to random point
        if (-1 == selectedSquare) {
            selectedSquare = getRandomSquare();
        }

        squares[selectedSquare].setLabel("O");
    }

    /**
     * This method check every row, column and diagonal
     * to know, haw them 2 points
     * with sama point, or null point
     *
     * @param gift X - for users, and gift O for computer
     * @return total free point
     * or -1 if not find 2 points
     * with same Result (X or O);
     */
    int findEmptySquare(String player) {
        int weight[] = new int[9];
        for (int i = 0; i < 9; i++) {
            if (squares[i].getLabel().equals("O")) {
                weight[i] = -1;
            } else if (squares[i].getLabel().equals("X")) {
                weight[i] = 1;
            } else {
                weight[i] = 0;
            }
        }

        int twoWeights = player.equals("O") ? -2 : 2;

        //Check, hew in 1st row 1 or 2 same point
        //And 1 - null
        if (weight[0] + weight[1] + weight[2] == twoWeights) {
            if (0 == weight[0]) {
                return 0;
            } else if (0 == weight[1]) {
                return 1;
            } else {
                return 2;
            }
        }

        //Check, hew in 2nd row 1 or 2 same point
        //And 1 - null
        if (weight[3] + weight[4] + weight[5] == twoWeights) {
            if (0 == weight[3]) {
                return 3;
            } else if (0 == weight[4]) {
                return 4;
            } else {
                return 5;
            }
        }

        //Check, hew in 3rd row 1 or 2 same point
        //And 1 - null
        if (weight[6] + weight[7] + weight[8] == twoWeights) {
            if (0 == weight[6]) {
                return 6;
            } else if (0 == weight[7]) {
                return 7;
            } else {
                return 8;
            }
        }

        //Check, hew in 1st column 1 or 2 same point
        //And 1 - null
        if (weight[0] + weight[3] + weight[6] == twoWeights) {
            if (0 == weight[0]) {
                return 0;
            } else if (0 == weight[3]) {
                return 3;
            } else {
                return 6;
            }
        }

        //Check, hew in 2nd column 1 or 2 same point
        //And 1 - null
        if (weight[1] + weight[4] + weight[7] == twoWeights) {
            if (0 == weight[1]) {
                return 1;
            } else if (0 == weight[4]) {
                return 4;
            } else {
                return 7;
            }
        }

        //Check, hew in 3rd column 1 or 2 same point
        //And 1 - null
        if (weight[2] + weight[5] + weight[8] == twoWeights) {
            if (0 == weight[2]) {
                return 2;
            } else if (0 == weight[5]) {
                return 5;
            } else {
                return 8;
            }
        }

        //Check, hew in left diagonal 1 or 2 same point
        //And 1 - null
        if (weight[0] + weight[4] + weight[8] == twoWeights) {
            if (0 == weight[0]) {
                return 0;
            } else if (0 == weight[4]) {
                return 4;
            } else {
                return 8;
            }
        }

        //Check, hew in right diagonal 1 or 2 same point
        //And 1 - null
        if (weight[2] + weight[4] + weight[6] == twoWeights) {
            if (0 == weight[2]) {
                return 2;
            } else if (0 == weight[4]) {
                return 4;
            } else {
                return 6;
            }
        }

        //Not Found 2any neighbor point
        //return -1
        return -1;
    } //end of method findEmptySquare

    /**
     * This Method select any null point
     *
     * @return random selected number of point
     */

    int getRandomSquare() {
        boolean gotEmptySquare = false;
        int selectedSquare = -1;
        do {
            selectedSquare = (int) (Math.random() * 9);
            if (squares[selectedSquare].getLabel().equals("")) {
                gotEmptySquare = true; //Need for end cyckle
            }
        } while (!gotEmptySquare);

        return selectedSquare;
    } //end method getRandom

    /**
     * This method highlight selected line
     */
    void highLightWinner(int win1, int win2, int win3) {
        squares[win1].setBackground(Color.CYAN);
        squares[win2].setBackground(Color.CYAN);
        squares[win3].setBackground(Color.CYAN);
    }

    //Do not available point and available Button "New Game"
    void endTheGame() {
        newGameButton.setEnabled(true);
        for (int i = 0; 9 > i; i++) {
            squares[i].setEnabled(false);
        }
    }
}
