package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:05 AM
Year :- 2023
*/

// Concrete Implementation 2
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
