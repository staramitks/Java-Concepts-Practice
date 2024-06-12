package home.amit.java.basic.generics.hierarchy;
/*
User :- AmitSingh
Date :- 5/5/2024
Time :- 10:06 AM
Year :- 2024
*/

public class GenericAbstract {
}

interface ReconTuple {
    // Interface methods
}

class AnotherConcreteTuple implements ReconTuple {
    // AnotherConcreteTuple implementation
}
class ConcreteTuple implements ReconTuple {
    // ConcreteTuple implementation
}


abstract class AbstractProcessor<T extends ReconTuple> {
    public abstract void process(T tuple);

}

class ConcreteProcessor extends AbstractProcessor<ConcreteTuple> {
    @Override
    public void process(ConcreteTuple tuple) {
        // Process ConcreteTuple
    }
}


class AnotherConcreteProcessor extends AbstractProcessor<AnotherConcreteTuple> {
    @Override
    public void process(AnotherConcreteTuple tuple) {
        // Process AnotherConcreteTuple
    }
}


