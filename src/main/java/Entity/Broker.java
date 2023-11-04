package Entity;

import java.util.Comparator;
import java.util.Random;

public class Broker {
    Random random = new Random();
    private long regNumber;
    private static int nextId = 101;

    private String name;

    public Broker() {
        nextId = random.nextInt(1001);
        this.regNumber = nextId;
    }

    public Broker(String name) {
        nextId = random.nextInt(1001);
        this.regNumber = nextId;
        this.name = name;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
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
                "id=" + regNumber +
                ", name='" + name + '\'' +
                '}';
    }
    public static Comparator<Broker> brokerRegNumber = new Comparator<Broker>() {
        @Override
        public int compare(Broker broker, Broker broker1) {
            return Long.compare(broker.getRegNumber(),(broker1.getRegNumber()));
        }
    };
}
