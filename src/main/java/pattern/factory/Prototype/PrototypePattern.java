package pattern.factory.Prototype;

import pattern.factory.Pattern;
import pattern.factory.PatternExample;

public class PrototypePattern implements Cloneable, Pattern {
    private String param;

    public PrototypePattern(String param) {
        this.param = param;
    }

    @Override
    protected PrototypePattern clone() throws CloneNotSupportedException {
        return (PrototypePattern) super.clone();
    }

    @Override
    public String getPatternName() {
        return "Prototype";
    }
}

