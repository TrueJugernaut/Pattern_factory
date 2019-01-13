package pattern.factory;

public class ProxyPattern implements Pattern, User {
    User user = new UserImpl();

    @Override
    public String getPatternName() {
        return "Proxy";
    }

    @Override
    public String className() {
        System.out.println("Proxy");
        return user.className();
    }
}
