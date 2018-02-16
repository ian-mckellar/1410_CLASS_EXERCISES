package inheritancePolymorphism;

import java.util.ArrayList;
import java.util.List;

public class TreeApp {
	
	
	public static void main(String[] args) {
		Tree tree = new Tree(1000, 100);
		System.out.println("my tree: " + tree);
		System.out.println("Growing the tree...");
		tree.grow();
		tree.scatterSeeds();
		System.out.println("tree: " + tree);
		
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
		
		System.out.println();
		
		// list of trees
		List<Tree> trees = new ArrayList<>();
		trees.add(tree);
		trees.add(aspen);
		trees.add(fir);
		
		System.out.println("List of trees");
		for (Tree t : trees) {
			System.out.println(t);
		}
	}
}
