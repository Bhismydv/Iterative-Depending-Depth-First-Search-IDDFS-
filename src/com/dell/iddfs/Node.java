package com.dell.iddfs;

import java.util.ArrayList;
import java.util.List;

class Node {
	
	//node
	private String name;

	//depth level for every single node
	private int depthLevel=0;
	//adjacencies
	private List<Node> adjacenciesList;
	
	
	//node constructor
	public Node(String name){
		this.name=name;
		this.adjacenciesList=new ArrayList<>();
	}
	
	public void addNeighbour(Node node){
		this.adjacenciesList.add(node);
	}
	
	public String toString(){
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public List<Node> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Node> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
}
