package pattern.factory.Adapter;

import pattern.factory.Adapter.AdapterPattern;
import pattern.factory.Adapter.SingleBike;
import pattern.factory.Pattern;
import pattern.factory.PatternExample;

public class AdapterPatternExample implements PatternExample {
    @Override
    public Pattern makePattern() {
        return new AdapterPattern(new SingleBike());
    }
}

