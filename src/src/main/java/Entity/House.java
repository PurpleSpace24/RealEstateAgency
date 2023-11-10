package Entity;

public class House extends RealEstate{
    public House() {
    }

    public House(String address, long regNumber, double price_per_square_meter, double area) {
        super(address, regNumber, price_per_square_meter, area);
    }

}
