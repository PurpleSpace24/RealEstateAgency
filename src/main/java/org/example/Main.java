package org.example;

import Entity.Broker;
import Entity.RealEstateAgency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RealEstateAgency realEstateAgency = new RealEstateAgency();

        System.out.println("How much people you want to add: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            Broker broker = new Broker();

            System.out.println("Enter name: ");
            String name = scanner.next();
            broker.setName(name);

            realEstateAgency.add(broker);

        }

        realEstateAgency.displayAllBrokers();
    }
}