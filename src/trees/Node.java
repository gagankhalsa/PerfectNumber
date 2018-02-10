package trees;

import java.util.Scanner;

public class Node<T extends Comparable<T>> {
Node<T> left;
Node<T> right;
T data;



public Node(T data)
{
this.data=data;
this.left=null;
this.right=null;
}
public void insert(T value) {
	
	if (value.compareTo(data)<=0) {
		if (left==null) {
			left=new Node<T>(value);
		}
		else {
			left.insert(value);
		}
	}
	else {
		if (right==null) {
			right=new Node<T>(value);
		}
		else {
			right.insert(value);
		}
	}
	
}
/*public void printInorder() {
	if (left!=null) {
		left.printInorder();
	}
	System.out.println(data+" ");
	if (right!=null) {
		right.printInorder();
	}

}*/


public void preOrder() {
	System.out.println("Pre Order");
	System.out.println(data+" ");
	if (left!=null) {
		left.preOrder();
	}
	
	if (right!=null) {
		
		right.preOrder();
	}

}




public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Node<Integer> root=new Node<Integer>(scanner.nextInt());
	while(scanner.hasNextInt())
	{
		int value=scanner.nextInt();
		root.insert(value);
	}
	scanner.close();
	
	//root.printInorder();
	root.preOrder();
}


}
