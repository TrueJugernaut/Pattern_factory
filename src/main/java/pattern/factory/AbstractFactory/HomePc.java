package pattern.factory.AbstractFactory;

public class HomePc implements Computer {
    @Override
    public void createComputer() {
        System.out.println("Simple Computer created");
    }
}
