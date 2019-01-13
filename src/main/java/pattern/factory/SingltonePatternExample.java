package pattern.factory;

public class SingltonePatternExample implements PatternExample{
    @Override
    public Pattern makePattern() {
        return SingletonPattern.getInstance();
    }
}

