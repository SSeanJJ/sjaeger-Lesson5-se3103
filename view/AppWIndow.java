package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class AppWIndow extends JFrame{

    private AppCanvas canvas = new AppCanvas();

    public void init(){
        Container cp = getContentPane();
        cp.add(canvas, BorderLayout.CENTER);
    }
    
}
