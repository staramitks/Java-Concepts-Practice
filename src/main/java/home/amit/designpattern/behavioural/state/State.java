package home.amit.designpattern.behavioural.state;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:08 AM
Year :- 2023
*/

import javax.naming.Context;

// State Interface
interface State {
    void doAction(StateContext context);
}
