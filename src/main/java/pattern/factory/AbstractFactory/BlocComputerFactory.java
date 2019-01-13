package pattern.factory.AbstractFactory;

public class BlocComputerFactory implements Factory{
    public Computer createComputer(String typeOfComputer) {
        switch (typeOfComputer){
            case "Home":
                return new HomePc();
            case "Game":
                return new GamePc();
            default:
                return null;
        }
    }
}
