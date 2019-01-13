package pattern.factory.Flyweight;

import pattern.factory.Flyweight.Developer;

public class JavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("writing Java code...");
    }
}

