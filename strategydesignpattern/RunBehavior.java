package strategydesignpattern;

import java.util.Random;
/**
 * RunBehavior class that implements OffenseBehavior
 * @author Seth Baugh
 */
public class RunBehavior implements OffenseBehavior {

    @Override
    /**
     * Method that randomly selects a run play
     * @return Returns a String representation of a running play
     */
    public String play() {
        Random Random = new Random();
        int rand = Random.nextInt();
        rand = rand % 10;
		if(rand <= -5)
        return "runs a drive up the gut";
        else if(rand >= -4 && rand <= 0)
        return "runs a draw";
        else if(rand >= 1 && rand <= 5)
        return "runs a pitch";
        else 
        return "runs a reverse";
    }
    
}
