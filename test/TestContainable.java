package test;

import model.Circle;
import model.MyShape;
import model.Rect;

public class TestContainable {

    public static void main(String[] args) {
        MyShape s1 = new Rect(0, 0,2,4);
        MyShape s2 = new Circle(0,0,1);

        System.out.println(s1.contains(0, 0));
        System.out.println(s1.contains(-1, 2));
        System.out.println(s1.contains(-1.1, 2));
        System.out.println();
        System.out.println(s2.contains(0, 0));
        System.out.println(s2.contains(1, 1));
        System.out.println(s2.contains(-0.5, 0.5));
    }
    
}
