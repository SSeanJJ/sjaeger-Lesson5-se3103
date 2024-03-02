package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventHandler implements MouseListener /* , MouseMotionListener*/ {

    @Override
    public void mouseClicked(MouseEvent e) {
       // System.out.println(String.format("Clicked (%d, %d)", e.getX(), e.getY()));


    }

    @Override
    public void mousePressed(MouseEvent e) {
        App.model.selectedIndex = -1; // reset
        int x = e.getX();
        int y = e.getY();

        for (int i = App.model.shapes.size() -1; i >= 0; i--){
            if (App.model.shapes.get(i).contains(x, y)) {
                App.model.selectedIndex = i;
                break;
            }
        }
        
        App.win.repaintCanvas();
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println(String.format("Released(%d, %d)", e.getX(), e.getY()));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // System.out.println(String.format("Entered (%d, %d)", e.getX(), e.getY()));
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // System.out.println(String.format("Exited (%d, %d)", e.getX(), e.getY()));
    }

    // @Override
    // public void mouseDragged(MouseEvent e) {
    //     System.out.println(String.format("Dragged (%d, %d)", e.getX(), e.getY()));
    // }

    // @Override
    // public void mouseMoved(MouseEvent e) {
    //     System.out.println(String.format("Moved (%d, %d)", e.getX(), e.getY()));
    // }
    
}
