package strategydesignpattern;

import java.util.Random;
/**
 * A class that represents the Lineman position in football
 * @author Seth Baugh
 */
public class Lineman extends Player {
    /**
     * Creates a new Lineman with the indicated name
     * @param _name name of the Lineman
     */
    Lineman(String _name)
    {
        super(_name);
        setDefenseBehavior();
        setOffenseBehavior();
    
    }
    
    @Override
    /**
     * Sets defensiveBehavior to a random behavior
     */
    public void setDefenseBehavior() {
        Random Random = new Random();
        int rand = Random.nextInt();
        rand = rand % 10;
		if(rand <= -4)
        defenseBehavior = new StripBehavior();
        if(rand <= 2 && rand > -4)
        defenseBehavior = new BlockBehavior();
        if(rand >= 3)
        defenseBehavior = new SackBehavior();

    }

    @Override
    /**
     * Sets offenseBehavior to OBlockBehavior
     */
    public void setOffenseBehavior() {
        offenseBehavior = new OBlockBehavior();

    }
}
