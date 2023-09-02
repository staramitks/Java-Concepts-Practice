package home.amit.designpattern.behavioural.state;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:12 AM
Year :- 2023
*/

import javax.naming.Context;

public class StateRunner {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.doAction(); // Output: State A: Performing action and changing state to B.
        context.doAction(); // Output: State B: Performing action and changing state to A.
        context.doAction(); // Output: State A: Performing action and changing state to B.
    }
}
