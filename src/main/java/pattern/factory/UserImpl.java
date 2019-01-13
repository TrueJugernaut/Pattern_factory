package pattern.factory;

public class UserImpl implements User{
    @Override
    public String className() {
        return this.getClass().getSimpleName();
    }
}

