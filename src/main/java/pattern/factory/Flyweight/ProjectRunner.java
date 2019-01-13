package pattern.factory.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("python"));
        developers.add(developerFactory.getDeveloperByLanguage("python"));
        developers.add(developerFactory.getDeveloperByLanguage("python"));
        developers.add(developerFactory.getDeveloperByLanguage("python"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}

