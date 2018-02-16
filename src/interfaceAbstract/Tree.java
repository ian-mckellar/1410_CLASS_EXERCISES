package interfaceAbstract;

/**
 * 
 * Represents a tree with a given height and age.
 * @author ian
 * 
 */
public abstract class Tree {
	private int age;
	private double height; //in feet
	
	/**
	 * initializes the tree with the age and height provided by the user.
	 * 
	 * @param age
	 * @param height
	 */
	public Tree(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
	/**
	 * Increases tree height by half a foot.
	 */
	public void grow() {
		height += 0.5;
	}
	
	/**
	 * Scatters the seeds of the tree.
	 */
	public abstract void scatterSeeds();
	
	/**
	 * Returns a string with the age and height of the tree in the following format.
	 * Tree [age={age} height={height}]
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + age + " years " + height + " feet.";
	}
	
	
	
}
