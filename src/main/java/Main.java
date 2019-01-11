import pattern.factory.Adapter.AdapterPatternExample;
import pattern.factory.BuilderPatternExample;
import pattern.factory.Pattern;
import pattern.factory.PatternExample;
import pattern.factory.ProxyPatternExample;
import pattern.factory.SingltonePatternExample;

public class Main {
    public static void main(String[] args) {
        PatternExample singltonePatternExample = new SingltonePatternExample();
        PatternExample proxyPatternExample = new ProxyPatternExample();
        PatternExample builderPatternExample = new BuilderPatternExample();
        PatternExample adapterPatternExample = new AdapterPatternExample();

        Pattern builder = builderPatternExample.makePattern();
        Pattern singleton = singltonePatternExample.makePattern();
        Pattern proxy = proxyPatternExample.makePattern();
        Pattern adapter = adapterPatternExample.makePattern();

        System.out.println("I'm " + builder.getPatternName());
        System.out.println("I'm " + singleton.getPatternName());
        System.out.println("I'm " + proxy.getPatternName());
        System.out.println("I'm " + adapter.getPatternName());
    }
}
