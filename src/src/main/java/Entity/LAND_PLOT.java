package Entity;

public class LAND_PLOT extends RealEstate{

    public LAND_PLOT() {
    }

    public LAND_PLOT(String address, long regNumber, double price_per_square_meter, double area) {
        super(address, regNumber, price_per_square_meter, area);
    }

}
