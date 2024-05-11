import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private JLabel resultLabel;
    private boolean xTurn;
    private boolean gameOver;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        xTurn = true;
        gameOver = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
                buttons[i][j].addActionListener(this);
                panel.add(buttons[i][j]);
            }
        }

        resultLabel = new JLabel("X's Turn");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver)
            return;

        JButton clickedButton = (JButton) e.getSource();
        if (clickedButton.getText().equals("")) {
            if (xTurn) {
                clickedButton.setText("X");
                resultLabel.setText("O's Turn");
            } else {
                clickedButton.setText("O");
                resultLabel.setText("X's Turn");
            }

            xTurn = !xTurn;

            if (checkWin()) {
                String winner = xTurn ? "O" : "X";
                resultLabel.setText("Player " + winner + " wins!");
                gameOver = true;
            } else if (checkTie()) {
                resultLabel.setText("It's a tie!");
                gameOver = true;
            }
        }
    }

    private boolean checkWin() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = buttons[i][j].getText();
            }
        }

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].equals("")) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j]) && !board[0][j].equals("")) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals("")) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].equals("")) {
            return true;
        }

        return false;
    }

    private boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
}

