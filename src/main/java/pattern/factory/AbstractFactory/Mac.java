package pattern.factory.AbstractFactory;

public class Mac implements Laptop {
    @Override
    public void createSteel() {
        System.out.println("$with british accent$ - perfect compuktar");
    }
}
