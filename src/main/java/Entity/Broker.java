package Entity;

public class Broker {
    private long id;
    private static int nextId = 1;

    private String name;

    public Broker() {
        this.id = nextId++;
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
