package pattern.factory.AbstractFactory;

import pattern.factory.Pattern;

public class AbstractFactoryPattern implements Pattern {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Block":
                return new BlocComputerFactory();
            case "Laptop":
                return new LaptopFactory();
            default:
                return null;
        }
    }

    @Override
    public String getPatternName() {
        return "AbstractFactoryPattern";
    }
}

