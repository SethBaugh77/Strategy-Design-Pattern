package strategydesignpattern;
/**
 * Class that holds the sackbehaviors and implements from DefenseBehavior
 * @author Seth Baugh
 */
public class SackBehavior implements DefenseBehavior{

    /**
     * Play method that just holds one string representation
     * @return Returns a string representation of a sack behavior
     */
    public String play() {
        
        return "sacks the quarterback";
    }
    
}

