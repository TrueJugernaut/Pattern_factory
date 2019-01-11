package pattern.factory;

public class AdapterPatternExample implements PatternExample {
    @Override
    public Pattern makePattern() {
        return new AdapterPattern(new SingleBike());
    }
}
