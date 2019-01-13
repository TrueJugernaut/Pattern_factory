package pattern.factory.AbstractFactory;

public class GamePc implements Computer {
    @Override
    public void createComputer() {
        System.out.println("Powerful computer created");
    }
}

