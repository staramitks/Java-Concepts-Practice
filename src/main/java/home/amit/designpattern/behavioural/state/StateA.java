package home.amit.designpattern.behavioural.state;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:10 AM
Year :- 2023
*/

import javax.naming.Context;

class StateA implements State {
    @Override
    public void doAction(StateContext context) {
        System.out.println("State A: Performing action and changing state to B.");
        context.setState(new StateB());
    }
}