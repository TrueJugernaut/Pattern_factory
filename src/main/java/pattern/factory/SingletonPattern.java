package pattern.factory;

public class SingletonPattern implements Pattern{
    private static SingletonPattern example;
    private SingletonPattern() {
    }
    public static SingletonPattern getInstance() {
        if(example == null) {
            example = new SingletonPattern();
        }
        return example;
    }

    @Override
    public String getPatternName() {
        return "Singleton";
    }
}
