package logic.control;

import java.util.ArrayList;
import java.util.List;

import logic.model.BinaryTree;
import logic.model.TreeNode;
import logic.model.Word;

public class Handling {
	private List<Word> listTree;
	private BinaryTree<Word> bt;
	
	public Handling() {
		bt = new BinaryTree<>((word1,word2)->word1.getWord().compareTo(word2.getWord()));
	}
	
	public void addWord(Word word) {
		this.bt.addNode(word);
	}
	
	public String searchMeaning(String word) {
		return bt.findFather(word).getWord().getDescription();
	}
	
	public String searchTranslate(String word) {
		return bt.findFather(word).getWord().getTranslate();
	}
	
	public List<Word> listWords(){
		return listTree = bt.listPresort();
	}
	
	public boolean modifyWord(String wordModify, Word word) {
		return bt.updateWord(bt.findFather(wordModify), word);
	}
	
	public boolean deleteWord(String word) {
		if(bt.deleteNode(bt.findFather(word)).getWord().equals(word)) {
			return true;
		}
		return false;
	}
	
	
}
