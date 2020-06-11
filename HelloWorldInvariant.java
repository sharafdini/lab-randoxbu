import scg.ac.ni.pmf.newgraph.graphdata.GraphData;
import scg.ac.ni.pmf.newgraph.invariants.InvariantString;

public class HelloWorldInvariant implements InvariantString {

	public String getName() {
		return "Hello World";
	}

	public String getDescription() {
		return "The invariant displays some text.";
	}
	
	public String calculate(GraphData data) {
		return "Hello, World!";
	}

}
