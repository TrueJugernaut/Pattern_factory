package pattern.factory;

public class ProxyPatternExample implements PatternExample{
    @Override
    public Pattern makePattern() {
        return new ProxyPattern();
    }
}

