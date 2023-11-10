package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    @Test
    void add() {
        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Ivan");
        Broker broker1 = new Broker("Peter");
        Broker broker2 = new Broker("Alex");
        Broker broker3 = new Broker("Marta");
        Broker broker4 = new Broker("Kaloyan");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);
        realEstateAgency.add(broker4);

    }

    @Test
    void displayAllBrokers() {
        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Ivan");
        Broker broker1 = new Broker("Peter");
        Broker broker2 = new Broker("Alex");
        Broker broker3 = new Broker("Marta");
        Broker broker4 = new Broker("Kaloyan");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);
        realEstateAgency.add(broker4);

        realEstateAgency.displayAllBrokers();
    }

    @Test
    void displayBrokerWithLowerRegNumber() {

        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Ivan");
        Broker broker1 = new Broker("Peter");
        Broker broker2 = new Broker("Alex");
        Broker broker3 = new Broker("Marta");
        Broker broker4 = new Broker("Kaloyan");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);
        realEstateAgency.add(broker4);

        realEstateAgency.displayBrokerWithLowerRegNumber();

    }
}