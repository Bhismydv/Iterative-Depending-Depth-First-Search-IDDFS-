package com.dell.iddfs;

import java.util.Stack;

class Algorithm {

	
	//for given node or vertex
	private Node targetVertex;
	private volatile boolean isTargetFound;
	
	public Algorithm(Node targetVertex){
		this.targetVertex=targetVertex;
		  
	}
	
	public void runDeepeningsSearch(Node rootVertex){
		//start at 0
		int depth=0;
		
		while(!isTargetFound){
			//print the result of iteration
			System.out.println();
			dfs(rootVertex,depth);
			depth++;
		}
	}

	private void dfs(Node sourceVertex, int depthLevel) {
		// TODO Auto-generated method stub
		
		Stack<Node> stack=new Stack<>();
		
		//at the beginning
		sourceVertex.setDepthLevel(0);
		
		stack.push(sourceVertex);
		
		while(!stack.isEmpty()){
			Node actualNode=stack.pop();
			System.out.print(actualNode+" ");
			
			//found the item
			if(actualNode.getName().equals(this.targetVertex.getName())){
				
				System.out.println("Node has been found...");
				
				this.isTargetFound=true;
				return;
			}
			
			if(actualNode.getDepthLevel() >= depthLevel){
				continue;
			}
			
			//visit every single node
			for(Node node: actualNode.getAdjacenciesList()){
				
				//increment the depth level layer basis
				node.setDepthLevel(actualNode.getDepthLevel()+1);
				stack.push(node);
			}
			
		}
	}
}
