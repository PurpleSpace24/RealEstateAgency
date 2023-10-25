package org.example;

import Entity.Broker;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.setId(132);
        broker.setName("James Corn");
        System.out.println(broker.toString());

        Broker broker1 = new Broker();
        broker1.setId(13);
        broker1.setName("Ivan Ivanov");
        System.out.println(broker1.toString());
    }
}