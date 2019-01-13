package pattern.factory.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    public static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperByLanguage(String language) {
        Developer developer = developers.get(language);

        if (developer == null){
            switch (language) {
                case "java":
                    System.out.println("Hire new java dev!");
                    developer = new JavaDev();
                    break;
                case "python":
                    System.out.println("Hire new python dev!");
                    developer =  new PythonDev();
                    break;
            }
            developers.put(language, developer);
        }
        return developer;
    }
}

