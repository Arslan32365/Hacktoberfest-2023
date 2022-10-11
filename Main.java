package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Tale of Ummon");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); //causes this window to be sized such that it fits the preferred size
                       //of its subcomponents (in this case the subcomponent is gamePanel)

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();

        gamePanel.startGameThread();
    }
}
