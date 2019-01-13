package pattern.factory;

public class BuilderPatternExample implements PatternExample{
    @Override
    public Pattern makePattern() {
        return BuilderPattern.newBuilder().build();
    }
}

