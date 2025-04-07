package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame(); //Neues Fenster
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X Button schließt das Game
        window.setResizable(false); //Größe des Fensters nicht mehr veränderbar
        window.setTitle("Dominik Simulator"); //Titel als Text oben im Fenster

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); //setzt Größe des Fensters  fest

        window.setLocationRelativeTo(null); //Fenster ist mittig vom Screen angeordnet
        window.setVisible(true); //Fenster wird sichtbar

        gamePanel.startGameThread();

    }

}
