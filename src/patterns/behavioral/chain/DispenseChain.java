package patterns.behavioral.chain;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain); // will assign the next inline of responsibility
    void dispense(Currency cur); // will dispense money in currency
}



/*
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
*/