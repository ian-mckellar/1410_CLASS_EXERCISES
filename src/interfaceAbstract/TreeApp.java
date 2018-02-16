package interfaceAbstract;


public class TreeApp {
	
	
	public static void main(String[] args) {
		DiciduousTree coconut = new DiciduousTree(1000, 100, "pointy", true);
		System.out.println("coconut tree: " + coconut);
		System.out.println("Growing the tree...");
		coconut.grow();
		coconut.scatterSeeds();
		System.out.println("coconut tree: " + coconut);
		
		System.out.println();
		
		// deciduous tree
		DiciduousTree aspen = new DiciduousTree(20, 75, "round", false);
		System.out.println("aspen: " + aspen);
		System.out.println("growing three times..");
		aspen.grow();
		aspen.grow();
		aspen.grow();
		aspen.shedLeafs();
		aspen.scatterSeeds();
		System.out.println("aspen: " + aspen);
		
		System.out.println();
		
		// coniferous tree
		ConiferousTree fir = new ConiferousTree(3, 10.5, true);
		System.out.println("fir: " + fir);
		fir.grow();
		fir.grow();
		fir.scatterSeeds();
		System.out.println("fir: " + fir);
	}
}
