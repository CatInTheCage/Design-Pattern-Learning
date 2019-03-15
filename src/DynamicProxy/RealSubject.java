package DynamicProxy;

public class RealSubject implements Subject{
    @Override
    public int sellBooks() {
        System.out.println("sell books.");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("hey sweet heart, have a nice day");
        return "bigpower";
    }
}
