package pattern.factory.Adapter;

import pattern.factory.Pattern;

public class AdapterPattern implements Pattern, MonoBike {
    public static void main(String[] args) {
        Bike mono = new Bike();
        mono.ride(new AdapterPattern(new SingleBike()));
    }

    MyBike bike;

    public AdapterPattern(MyBike bike) {
        this.bike = bike;
    }

    @Override
    public void ride() {
        bike.rideTheHorse();
    }

    @Override
    public String getPatternName() {
        return "Adapter";
    }
}

