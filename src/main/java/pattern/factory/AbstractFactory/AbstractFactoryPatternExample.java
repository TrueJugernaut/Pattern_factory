package pattern.factory.AbstractFactory;

import pattern.factory.Pattern;
import pattern.factory.PatternExample;

public class AbstractFactoryPatternExample implements PatternExample {
    @Override
    public Pattern makePattern() {
        return new AbstractFactoryPattern();
    }
}

