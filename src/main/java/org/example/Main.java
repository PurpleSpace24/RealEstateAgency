package org.example;

import Entity.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                System.out.print("What real estate type you want to add (apartment,house,land plot): ");
                String type = scanner.next().toLowerCase();

                System.out.print("How much " + type + "s you want to add: ");
                int n = scanner.nextInt();

                if(type.equals("apartment")){
                    for (int i = 1; i <= n; i++) {
                        Apartment apartment = new Apartment();

                        System.out.print("Enter address for the " + i + ": ");
                        String address = scanner.next();
                        apartment.setAddress(address);

                        System.out.print("Enter reg. number for the " + i + ": ");
                        long regN = scanner.nextLong();
                        apartment.setRegNumber(regN);

                        System.out.print("Enter area for the " + i + ": ");
                        double area = scanner.nextDouble();
                        apartment.setArea(area);

                        System.out.print("Enter price per square meter for the " + i + ": ");
                        double price_per_square_meter = scanner.nextDouble();
                        apartment.setPrice_per_square_meter(price_per_square_meter);
                    }
                } else if (type.equals("house")){
                    for (int i = 1; i <= n; i++) {
                        House house = new House();

                        System.out.print("Enter address for the " + i + ": ");
                        String address = scanner.next();
                        house.setAddress(address);

                        System.out.print("Enter reg. number for the " + i + ": ");
                        long regN = scanner.nextLong();
                        house.setRegNumber(regN);

                        System.out.print("Enter area for the " + i + ": ");
                        double area = scanner.nextDouble();
                        house.setArea(area);

                        System.out.print("Enter price per square meter for the " + i + ": ");
                        double price_per_square_meter = scanner.nextDouble();
                        house.setPrice_per_square_meter(price_per_square_meter);
                    }

                }else if (type.equals("land plot")){
                    for (int i = 1; i <= n; i++) {
                        LAND_PLOT landPlot = new LAND_PLOT();

                        System.out.print("Enter address for the " + i + ": ");
                        String address = scanner.next();
                        landPlot.setAddress(address);

                        System.out.print("Enter reg. number for the " + i + ": ");
                        long regN = scanner.nextLong();
                        landPlot.setRegNumber(regN);

                        System.out.print("Enter area for the " + i + ": ");
                        double area = scanner.nextDouble();
                        landPlot.setArea(area);

                        System.out.print("Enter price per square meter for the " + i + ": ");
                        double price_per_square_meter = scanner.nextDouble();
                        landPlot.setPrice_per_square_meter(price_per_square_meter);
                    }
                }else
                    System.out.println("There is no such real estate type!");

            }else if (number == 0){
                flag = false;
                break;
            }

        }while (flag);
    }
}