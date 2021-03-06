package sneps.network;

import sneps.network.nodes.Node;

public class NodeTracePair {
	
	private Node node;
	private PathTrace pathTrace;
	
	public NodeTracePair(Node node, PathTrace pathTrace){
		this.node = node;
		this.pathTrace = pathTrace;
	}
	
	public Node getNode(){
		return this.node;
	}
	
	public PathTrace getPathTrace(){
		return this.pathTrace;
	}

}
