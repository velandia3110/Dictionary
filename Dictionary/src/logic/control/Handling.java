package logic.control;

import java.util.ArrayList;

import logic.model.BinaryTree;
import logic.model.TreeNode;
import logic.model.Word;

public class Handling {
	private ArrayList<BinaryTree> listTree;
	private BinaryTree t;
	public Handling() {
		listTree = new ArrayList<BinaryTree>();
		BinaryTree t = new BinaryTree();
	}
	
	public void addWord(Word word) {
		t.addNode(word);
	}
	
	public Word findWord(TreeNode node,String word) {
		return t.findWord(node, word);
	}
	
	
}
