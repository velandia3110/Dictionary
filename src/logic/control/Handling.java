package logic.control;

import java.util.ArrayList;

import logic.model.BinaryTree;
import logic.model.TreeNode;
import logic.model.Word;

public class Handling {
	private ArrayList<BinaryTree<Word>> listTree;
	private BinaryTree<Word> bt;
	
	public Handling() {
		listTree = new ArrayList<BinaryTree<Word>>();
		bt = new BinaryTree<>((word1,word2)->word1.getWord().compareTo(word2.getWord()));
	}
	
	public void addWord(Word word) {
		this.bt.addNode(word);
	}
	
	public TreeNode<Word> searchMeaning(String word) {
		return bt.findFather(word);
	}
	
	
}
