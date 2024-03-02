package test;

import model.Circle;
import model.MyShape;
import model.Rect;

public class TestShape {
    
    public static void main(String[] args) {
       // MyShape s1 = new MyShape(0, 0); // cannot create object from abstract class
      // System.out.println(s1 + " area = " + s1.getArea()); //s1.toString()

        Circle c1 = new Circle(2,1,1);
        System.out.println(c1 + " area = " + c1.getArea());

        MyShape s2 = c1;
        // static binding 
        System.out.println(s2.toString() + " area = " + s2.getArea());

        MyShape s3 = new Rect(2,2,4,5);
        System.out.println(s3.toString());

        MyShape[] shapes = new MyShape[4];

        shapes[0] = new Circle(0,0,1);
        shapes[1] = new Rect(1, 1, 2, 2);
        shapes[2] = new Circle(2,2,2);
        shapes[3] = new Rect(2,2,4,5);

        //polymorphism
        for (MyShape s: shapes) {
            System.out.println(s.toString() + " area = " + s.getArea());
        }
    }
}
