package strategydesignpattern;
/**
 * Class that represents an OBlockBehavior that contains just one method play
 * @author Seth Baugh
 */
public class OBlockBehavior implements OffenseBehavior {

    @Override
    /**
     * Method that returns the string " blocks defenders "
     * @return A string representation of blocking a defender.
     */
    public String play() {
        
        return " blocks defenders ";
    }
    
}
