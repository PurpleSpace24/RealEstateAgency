package Entity;

abstract class RealEstate {

    private String address;
    private long regNumber;
    private double price_per_square_meter;
    private double area;

    public RealEstate() {
    }

    public RealEstate(String address, long regNumber, double price_per_square_meter, double area) {
        this.address = address;
        this.regNumber = regNumber;
        this.price_per_square_meter = price_per_square_meter;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public double getPrice_per_square_meter() {
        return price_per_square_meter;
    }

    public void setPrice_per_square_meter(double price_per_square_meter) {
        this.price_per_square_meter = price_per_square_meter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "address='" + address + '\'' +
                ", regNumber=" + regNumber +
                ", price_per_square_meter=" + price_per_square_meter +
                ", area=" + area +
                '}';
    }
}
