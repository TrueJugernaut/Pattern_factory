package pattern.factory;

public class BuilderPattern implements Pattern{
    private String firstName;
    private String lastName;
    private BuilderPattern() {
    }

    public BuilderPattern(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String getPatternName() {
        return "Builder";
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder firstName() {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName() {
            this.lastName = lastName;
            return this;
        }
        public BuilderPattern build() {
            return new BuilderPattern(firstName, lastName);
        }
    }
}
