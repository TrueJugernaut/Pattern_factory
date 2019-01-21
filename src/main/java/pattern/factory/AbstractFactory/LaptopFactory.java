package pattern.factory.AbstractFactory;

public class LaptopFactory implements Factory{
    public Laptop createLaptop(String typeOfLaptop) {
        switch (typeOfLaptop){
            case "PC":
                return new Pc();
            case "Mac":
                return new Mac();
            default:
                return null;
        }
    }
}
