package strategydesignpattern;
/**
 * Class that holds StripBehavior
 * @author Seth Baugh
 */
public class StripBehavior implements DefenseBehavior{

    /**
     * Play method only contains one string representation
     * @return Returns a string representation of a strip defense Behavior
     */
    public String play() {
        
        return "strips the ball from the runner's hands ";
    }
    
}
