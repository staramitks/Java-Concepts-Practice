package home.amit.designpattern.creational.builder;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 4:58 PM
Year :- 2023
*/

public class ComputerBuilderRunner {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }

}