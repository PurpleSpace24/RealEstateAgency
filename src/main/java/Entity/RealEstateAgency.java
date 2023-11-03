package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class RealEstateAgency {
    private String name;
    private List<Broker> brokerList;

    public RealEstateAgency() {
        this.brokerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Broker> getBrokerList() {
        return brokerList;
    }

    public void setBrokerList(List<Broker> brokerList) {
        this.brokerList = brokerList;
    }

    public void add(Broker broker){
        brokerList.add(broker);
    }

    public void displayAllBrokers(){
       for (Broker broker : brokerList){
            out.println(broker);
        }
    }

    public void displayBrokerWithLowerRegNumber(){
        Optional<Broker> minBroker = brokerList.stream().min((Broker.brokerRegNumber));

        minBroker.ifPresent(broker -> System.out.println("Broker with the minimum registration number: " + broker));
    }

    @Override
    public String toString() {
        return "RealEstateAgency{" +
                "name='" + name + '\'' +
                '}';
    }
}
