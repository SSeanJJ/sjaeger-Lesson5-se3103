package test.demoInterface;

public class TestOperation {
    
    public static void main (String[] args) {
        DoSomething d = new DoSomething();
        int inc = d.increase(10);
        System.out.println("Increase: " + inc);
        int dec = d.decrease(10);
        System.out.println("Decrease: " + dec);
        int raise = Operation.raiseDouble(10);
        System.out.println("raiseDouble: " + raise);
        
    }

}

class DoSomething implements Operation{

    @Override
    public int increase(int n) {
        return n + 3;
    
    }

    // @Override
    // public int decrease(int n) {
    //     return n - 2;
    // }

}