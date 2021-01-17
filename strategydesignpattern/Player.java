package strategydesignpattern;

/**
 * Abstract class that represents a football player
 * @author Seth Baugh
 */
public abstract class Player {
    protected String name;
    private boolean defense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;
    /**
     * Constructor for the abstract player class. Cant be used on its own but is called by child classes
     * @param _name Creates player with intended name
     */
    public Player(String _name)
    {
        name = _name;
        defense = false;
    }
    /**
     * Abstract method that sets DefenseBehavior
     */
    public abstract void setDefenseBehavior();
    /**
    * Abstract method that sets OffenseBehavior
    */
    public abstract void setOffenseBehavior();
    /**
     * Play method that returns a String
     * @return A string representation for offenseBehavior or defenseBehavior
     */
    public String play()
    {
        
        if(defense == false)
        return offenseBehavior.play();

        else if(defenseBehavior == null)
        return " is on the sideline ";

        else
            return defenseBehavior.play();
        
        
        

    }
/**
 * Method that changes players from offense to defense or defense to offense
 */
    public void turnover()
    {
        if(defense == false)
        defense = true;

        else
        defense = false;

    }






}
