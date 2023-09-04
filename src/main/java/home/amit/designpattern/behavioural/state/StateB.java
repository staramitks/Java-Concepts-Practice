package home.amit.designpattern.behavioural.state;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:10 AM
Year :- 2023
*/

class StateB implements State {
    @Override
    public void doAction(StateContext context) {
        System.out.println("State B: Performing action and changing state to A.");
        context.setState(new StateA());
    }
}
