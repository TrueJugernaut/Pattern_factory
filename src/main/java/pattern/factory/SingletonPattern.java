package pattern.factory;

public class SingletonPattern implements Pattern{
    private static SingletonPattern singleton;
    private SingletonPattern() {
    }
    public static SingletonPattern getInstance() {
        if(singleton == null) {
            singleton = new SingletonPattern();
        }
        return singleton;
    }

    @Override
    public String getPatternName() {
        return "Singleton";
    }
}
