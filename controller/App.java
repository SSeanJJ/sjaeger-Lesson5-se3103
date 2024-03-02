package controller;

import javax.swing.JFrame;

import view.AppWIndow;

public class App {


    public static final AppWIndow win = new AppWIndow();
    public static void main(String[] args) {
        win.setTitle("Interface Demo");
        win.setLocation(300, 200);
        win.init();

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);
    }




}