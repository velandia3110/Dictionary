package logic.model;



public class TreeNode<Word> {
	private Word word;
	private TreeNode<Word> left;
	private TreeNode<Word> right;
	
	public TreeNode(Word info) {
		this.word = info;
		left = right = null;
	}

	public Word getWord() {
		return word;
	}

	public void setWord(Word word) {
		this.word = word;
	}

	public TreeNode<Word> getLeft() {
		return left;
	}


	public TreeNode<Word> getRight() {
		return right;
	}

	public void setLeft(TreeNode<Word> left) {
		this.left = left;
	}

	public void setRight(TreeNode<Word> right) {
		this.right = right;
	}

	

	
}
