package strategydesignpattern;

import java.util.Random;
/**
 * Class that represents all receiver behavior
 * @author Seth Baugh
 */
public class ReceiveBehavior implements OffenseBehavior {

    @Override
    /**
     * Method that randomly selects a receiver play
     * @return A String representation of a receiver play
     */
    public String play() {
        Random Random = new Random();
        int rand = Random.nextInt();
        rand = rand % 10;
		if(rand <= -6)
        return "runs a hail mary";
        else if(rand >= -5 && rand <= -2)
        return "runs a screen pass";
        else if(rand >= -1 && rand <= 2)
        return "runs a seem route";
        else if(rand >= 3 && rand <= 6)
        return "runs a out route";
        else
        return "runs a slant route"; 
    }
    
}
