package Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    @Test
    void add() {
        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Peter");
        Broker broker1 = new Broker("John");
        Broker broker2 = new Broker("Jason");
        Broker broker3 = new Broker("Olga");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);
    }

    @Test
    void displayAllBrokers() {
        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Peter");
        Broker broker1 = new Broker("John");
        Broker broker2 = new Broker("Jason");
        Broker broker3 = new Broker("Olga");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);

        realEstateAgency.displayAllBrokers();
    }

    @Test
    void displayBrokerWithLowerRegNumber() {
        RealEstateAgency realEstateAgency = new RealEstateAgency();

        Broker broker = new Broker("Peter");
        Broker broker1 = new Broker("John");
        Broker broker2 = new Broker("Jason");
        Broker broker3 = new Broker("Olga");

        realEstateAgency.add(broker);
        realEstateAgency.add(broker1);
        realEstateAgency.add(broker2);
        realEstateAgency.add(broker3);

        realEstateAgency.displayBrokerWithLowerRegNumber();

    }
}