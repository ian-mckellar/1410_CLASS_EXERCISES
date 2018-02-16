package interfaceAbstract;
/**
 * Represents a deciduous tree
 * Deciduous trees have leaves and their seeds are in vessels
 * @author ian
 *
 */
public class DiciduousTree extends Tree{
	private final String leafShape;
	private final boolean fruit; //eatable fruit
	
	/**
	 * Initiliazes a new DisiduousTree object 
	 * @param age
	 * @param height
	 * @param leafShape
	 * @param fruit
	 */
	public DiciduousTree(int age, double height, String leafShape, boolean fruit) {
		super(age, height);
		this.leafShape = leafShape;
		this.fruit = fruit;
	}

	/**
	 * returns the shape of the leaf
	 * @return
	 */
	public String getLeafShape() {
		return leafShape;
	}
	
	/**
	 * returns the fruit the tree produces
	 * @return
	 */
	public boolean isFruit() {
		return fruit;
	}

	/**
	 * Prints "Shedding the leafs ..." to represent the tree is shedding its leafs
	 */
	public void shedLeafs() {
		System.out.println("Shedding leafs ...");
	}
	
	/**
	 * returns a string with the following format.
	 * DicidousTree
	 */
	@Override
	public String toString() {
		return super.toString() + " " + leafShape + " leafs" + 
					(fruit ? " edible fruits" : " no edible fruits");
	}

	@Override
	public void scatterSeeds() {
		System.out.println("Scatters seeds in fruit ...");
	}
	
	
}
