package com.dell.iddfs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node vertex0=new Node("A");
		Node vertex1=new Node("B");
		Node vertex2=new Node("C");
		Node vertex3=new Node("D");
		Node vertex4=new Node("E");
		
		//ORDER THE ADJACENCIES
		vertex0.addNeighbour(vertex1);
		vertex0.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex3);
		vertex3.addNeighbour(vertex4);
		
		//instantiate the algo
		Algorithm algorithm=new Algorithm(vertex4);
		algorithm.runDeepeningsSearch(vertex0);
	}

}
