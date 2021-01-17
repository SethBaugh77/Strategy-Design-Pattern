package strategydesignpattern;
/**
 * Receiver class that represents a position in football
 * @author Seth Baugh
 */
public class Receiver extends Player {
/**
 * Creates a receiver class with the intended name
 * @param _name name of the Receiver
 */
    public Receiver(String _name) {
        super(_name);
        setDefenseBehavior();
        setOffenseBehavior();
        
    }

    @Override
    /**
     * Sets DefenseBehavior to null because Receivers don't play defense
     */
    public void setDefenseBehavior() {
        

    }

    @Override
    /**
     * Sets OffenseBehavior to ReceiveBehavior
     */
    public void setOffenseBehavior() {
        offenseBehavior = new ReceiveBehavior();

    }
    
}
