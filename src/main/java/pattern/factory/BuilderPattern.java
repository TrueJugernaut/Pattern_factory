package pattern.factory;

public class BuilderPattern implements Pattern{
    private String firstName;
    private String lastName;
    private BuilderPattern() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Builder newBuilder() {
        return new BuilderPattern().new Builder();
    }

    @Override
    public String getPatternName() {
        return "Builder";
    }

    public class Builder {
        public Builder() {
        }
        public Builder setFirstName() {
            BuilderPattern.this.firstName = firstName;
            return this;
        }

        public Builder setLastName() {
            BuilderPattern.this.lastName = lastName;
            return this;
        }
        public BuilderPattern build() {
            return BuilderPattern.this;
        }
    }
}
