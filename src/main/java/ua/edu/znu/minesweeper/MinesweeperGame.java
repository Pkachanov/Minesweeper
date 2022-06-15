package ua.edu.znu.minesweeper;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *  Main class in this project
 *  JFrame An extended version of java.awt.Frame that adds support for the JFC/Swing component architecture
 */
public class MinesweeperGame extends JFrame {

    private JLabel statusbar;
    /**
     *  Construct of class that start inithializathion of UI
     */
    public MinesweeperGame() {
        initUI();
    }
    /**
     * inithializathion of UI with Title and borders and Board
     */
    private void initUI() {
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);
        add(new Board(statusbar));
        setResizable(false);
        pack();
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     *  Main method that creates object of class MinesweeperGame Class
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new MinesweeperGame();
            ex.setVisible(true);
        });
    }
}
