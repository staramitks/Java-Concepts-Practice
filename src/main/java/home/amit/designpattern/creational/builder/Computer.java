package home.amit.designpattern.creational.builder;
/*
User :- AmitSingh
Date :- 6/25/2023
Time :- 4:56 PM
Year :- 2023
Explanation :-
1- First, you need to create a static nested class and then copy all the arguments from the outer class to the Builder class.
2- We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
3- Java Builder class should have a public constructor with all the required attributes as parameters.
4- Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
5- The final step is to provide a build() method in the builder class that will return the Object needed by client program.
6- For this we need to have a private constructor in the Class with Builder class as argument.

*/


public class Computer {

    //required parameters
    private final String HDD;
    private final String RAM;

    //optional parameters
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    //Builder Class
    public static class ComputerBuilder {

        // required parameters
        private final String HDD;
        private final String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}