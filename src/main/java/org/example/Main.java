package org.example;

import Entity.Broker;
import Entity.RealEstateAgency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        RealEstateAgency realEstateAgency = new RealEstateAgency();

        boolean flag = true;

        do{
            try {
                FileReader fileReader = new FileReader("src/main/java/menu.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                System.out.println();
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line); // Process the menu item (e.g., display it)
                }
                System.out.println();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print("Enter number: ");
            int number = scanner.nextInt();

                if(number == 1){
                    System.out.print("How much people you want to add: ");
                    int n = scanner.nextInt();

                        if(!realEstateAgency.getBrokerList().isEmpty()){
                            for (int i = 0; i < n; i++) {
                                Broker broker = new Broker();

                                System.out.print("Enter name " + i + ": ");
                                String name = scanner.next();
                                broker.setName(name);
                                realEstateAgency.add(broker);
                            }

                        }else{
                            for (int i = 0; i < n; i++) {
                                Broker broker1 = new Broker();

                                System.out.print("Enter name " + i + ": ");
                                String name1 = scanner.next();
                                broker1.setName(name1);
                                realEstateAgency.add(broker1);
                            }

                        }
                }
                else if (number == 2){
                    realEstateAgency.displayAllBrokers();

                } else if (number == 3){
                    realEstateAgency.displayBrokerWithLowerRegNumber();

                } else if (number == 4){

                } else if (number == 5){
                    flag = false;
                    break;
                }

        }while (flag);

    }
}