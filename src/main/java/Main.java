import pattern.factory.AbstractFactory.AbstractFactoryPatternExample;
import pattern.factory.Adapter.AdapterPatternExample;
import pattern.factory.BuilderPatternExample;
import pattern.factory.Pattern;
import pattern.factory.PatternExample;
import pattern.factory.Prototype.PrototypePatternExample;
import pattern.factory.ProxyPatternExample;
import pattern.factory.SingltonePatternExample;

public class Main {
    public static void main(String[] args) {
        PatternExample singltonePatternExample = new SingltonePatternExample();
        PatternExample proxyPatternExample = new ProxyPatternExample();
        PatternExample builderPatternExample = new BuilderPatternExample();
        PatternExample adapterPatternExample = new AdapterPatternExample();
        PatternExample prototypePatternExample = new PrototypePatternExample();
        PatternExample abstractFactoryPattern = new AbstractFactoryPatternExample();

        Pattern builder = builderPatternExample.makePattern();
        Pattern singleton = singltonePatternExample.makePattern();
        Pattern proxy = proxyPatternExample.makePattern();
        Pattern adapter = adapterPatternExample.makePattern();
        Pattern prototype = prototypePatternExample.makePattern();
        Pattern abstractFatory = abstractFactoryPattern.makePattern();

        System.out.println("I'm " + builder.getPatternName());
        System.out.println("I'm " + singleton.getPatternName());
        System.out.println("I'm " + proxy.getPatternName());
        System.out.println("I'm " + adapter.getPatternName());
        System.out.println("I'm " + prototype.getPatternName());
        System.out.println("I'm " + abstractFatory.getPatternName());
    }
}
