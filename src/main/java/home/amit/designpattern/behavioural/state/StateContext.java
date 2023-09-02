package home.amit.designpattern.behavioural.state;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:10 AM
Year :- 2023
*/


// Context Class
class StateContext {
    private State state;

    public StateContext() {
        // Set an initial state (State A)
        this.state = new StateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
