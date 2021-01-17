package strategydesignpattern;
import java.util.Random;
/**
 * Class that shows all possible ways to block on defense
 * @author Seth Baugh
 */
public class BlockBehavior implements DefenseBehavior {

    /**
     * Randomly selects a blocking play for the lineman
     * @return String representation of a blocking play
     */

    public String play() {
         Random Random = new Random();
        int rand = Random.nextInt();
        rand = rand % 10;
		if(rand <= -5)
        return "blocks a punt.";
        else if(rand >= -4 && rand <= 0)
        return "blocks a kick.";
        else if(rand >= 1 && rand <= 5)
        return "blocks a pass";
        else 
        return "blocks a catch";
        


        
    
    }
    
}
