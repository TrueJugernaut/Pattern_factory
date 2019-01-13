package pattern.factory.AbstractFactory;

public class Pc implements Laptop {
    @Override
    public void createSteel() {
        System.out.println("powerful laptop created!");
    }
}

