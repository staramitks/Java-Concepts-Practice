package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:04 AM
Year :- 2023
*/

// Concrete Implementation 1
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

