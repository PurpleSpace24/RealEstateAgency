package Entity;

public class Broker {
    private long id;
    private String name;

    public Broker() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Broker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
