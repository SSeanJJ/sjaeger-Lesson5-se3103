package test.demoInterface;

import java.util.Random;

public interface Operation {

    int N_OPERATIONS = 4; // public static final

    int increase(int n); // public abstract

    default int decrease(int n) {
        n = n - getAmount(n);
        return n;

    }

    static int raiseDouble(int n) {
        return n* 2;
    } 
    //private method
    private int getAmount(int n) {
        Random r = new Random();
        return r.nextInt(n);
    }
    
} 
    

