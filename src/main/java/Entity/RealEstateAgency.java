package Entity;

public class RealEstateAgency {
    private String name;

    public RealEstateAgency() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RealEstateAgency{" +
                "name='" + name + '\'' +
                '}';
    }
}
