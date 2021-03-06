package interfaceAbstract;

public class ConiferousTree extends Tree {
	private boolean isChristmasTree;
	

	public ConiferousTree(int age, double height, boolean isChristmasTree) {
		super(age, height);
		this.isChristmasTree = isChristmasTree;
	}
	/**
	 * Determines if tree is Christmas tree
	 * @return
	 */
	public boolean isChristmasTree() {
		return isChristmasTree;
	}

	@Override
	public void scatterSeeds() {
		System.out.println("scatters seeds through cones");
	}
	
	@Override
	public String toString() {
		return super.toString() + (isChristmasTree ? " Christmas Tree" : "");
	}
	
}
