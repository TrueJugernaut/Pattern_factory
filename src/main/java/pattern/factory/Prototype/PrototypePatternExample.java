package pattern.factory.Prototype;

import pattern.factory.Pattern;
import pattern.factory.PatternExample;

public class PrototypePatternExample implements PatternExample {
    @Override
    public Pattern makePattern() {
        try {
            return new PrototypePattern("Example").clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
