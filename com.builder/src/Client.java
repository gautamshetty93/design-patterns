
package com.builder.src;
public class Client {
        public static void main(String[] args) {

            Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                    .setGraphicsCard(true)
                    .setBluetooth(true)
                    .setWifi(true)
                    .build();

            System.out.println(gamingPC);

            Computer officePC = new Computer.Builder("Intel i5", "16GB", "512GB SSD")
                    .setWifi(true)
                    .build();

            System.out.println(officePC);
        }
    }
