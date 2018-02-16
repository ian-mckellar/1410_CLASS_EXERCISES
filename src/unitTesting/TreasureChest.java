package unitTesting;

/**
 * Represents a treasure chest that
 * stores a given amount of gold coins
 *
 * @author ian
 */
public class TreasureChest {
    private int gold; // amount of gold coins

    /**
     * Initializes the treasure chest with an amount of gold
     * @param gold
     */
    public TreasureChest(int gold) {
        this.gold = gold;
    }

    /**
     * Returns the amount of gold in the box
     * @return
     */
    public int getGold() {
        return gold;
    }

    /**
     * adds a specified amount of gold coins
     * to the treasure chest
     * @param gold
     */
    public void add(int gold) {
        this.gold += gold;
    }

    /**
     * Removes the amount of gold coins specified
     * provided the treasure chest included enough
     * gold and returns true if there is enough gold.
     *
     * If the amount of gold coins specified is greater
     * than the amount of gold in the treasure chest no
     * gold is removed and the method returns false.
     * @param gold
     * @return
     */
    public boolean remove(int gold) {

        return false; //TODO
    }

    /**
     * returns a string with the amount
     * of gold in the treasure chest
     * with the following format
     * [ {number of gold coins} ]
     * @return
     */
    @Override
    public String toString() {
        return "[ "+ gold + " ]";
    }
}
