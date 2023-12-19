package logic.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryTree<T> {
	private Comparator<Word> comparator;

	private List<Word> list;

	private TreeNode<Word> root;

	 public BinaryTree(Comparator<Word> comparator) {
	        this.comparator = comparator;
	        root = null;
	    }

	 public boolean isEmpty(){

	        return root == null;
	    }

	 public TreeNode<Word> findFather(String word) {
	        return findFatherRecursive(root, word, null);
	    }

	    private TreeNode<Word> findFatherRecursive(TreeNode<Word> currently, String word, TreeNode<Word> nodeFather) {
	        if (currently == null) {
	        	return null;
	        }
	        
	        if (currently.getWord().getWord().equals(word)) {
	            return nodeFather;
	        }

	        TreeNode<Word> nodeFound = findFatherRecursive(currently.getLeft(), word, currently);

	        if (nodeFound != null) {
	            return nodeFound;
	        }

	        return findFatherRecursive(currently.getRight(), word, currently);
	    }
	    
	    
	    public TreeNode<Word> findNode(String word) {
	        return findNodeRecursive(root, word, null);
	    }

	    private TreeNode<Word> findNodeRecursive(TreeNode<Word> currently, String word, TreeNode<Word> nodeFather) {
	        if (currently == null) {
	        	System.out.println("aaaaa");
	        	return null;
	        }

	        if (currently.getWord().getWord().equals(word)) {
	            return currently;
	        }

	        TreeNode<Word> nodeFound = findNodeRecursive(currently.getLeft(), word, currently);

	        if (nodeFound != null) {
	            return nodeFound;
	        }

	        return findNodeRecursive(currently.getRight(), word, currently);
	    }
	    
	    
	    public void addNode( Word info ){
	        if( isEmpty()){
	            root = new TreeNode<>(info);
	            System.out.println("Palabra a�adida");
	        }else{
	            TreeNode<Word> aux = root;
	            TreeNode<Word> ant = null;
	            while ( aux != null ){
	                ant = aux;
	                aux = comparator.compare(info,aux.getWord()) < 0 ? aux.getLeft() : aux.getRight();
	            }
	            if( comparator.compare( info, ant.getWord() ) < 0 ){
	                ant.setLeft( new TreeNode<>( info ) );
	                System.out.println("Palabra a�adida");
	            }else{
	                ant.setRight( new TreeNode<>( info ) );
	                System.out.println("Palabra a�adida");
	            }
	        }
	    }

	    public List<Word> listPresort(){
	        list = new ArrayList<>();

	        presort(root);

	        return list;
	    }

	    private void presort(TreeNode<Word> node) {
	        if( node != null ){
	            list.add( node.getWord( ) );
	            presort( node.getLeft());
	            presort( node.getRight());
	        }
	    }

	    public List<Word> lisAmplitudeDown( ){
	        list = new ArrayList<>();
	        ArrayDeque<TreeNode<Word>> tail = new ArrayDeque<>();
	        tail.add( root );
	        while( !tail.isEmpty( ) ){
	            TreeNode<Word> aux = tail.poll();
	            if( aux.getLeft() != null ){
	                tail.add( aux.getLeft( ) );
	            }
	            if( aux.getRight() != null ){
	                tail.add( aux.getRight());
	            }

	            list.add( aux.getWord( ) );
	        }

	        return list;
	    }

	    private boolean isLeaf(TreeNode<Word> node) {
	    	return node.getLeft() == null && node.getRight() == null;
	    }
	    public Word deleteNode( TreeNode<Word> node ){
	    	if(isLeaf(node)) {
	    		deleteLeaf(node);
	    	}else {
	    		if(node.getLeft() != null && node.getRight() != null ) {
	    			deleteWithSons(node);
	    		}else {
	    			deleteWithSon(node);
	    		}
	    		
	    	}
	        return null;
	    }

	    private Word deleteLeaf( TreeNode<Word> node ){
	    	TreeNode<Word> newNode = findNode(node.getWord().getWord());
	    	if(newNode.getLeft().getWord().equals(node.getWord())) {
	    		newNode.setLeft(null);
	    		return node.getWord();
	    	}
	    	if(newNode.getRight().equals(node)) {
	    		newNode.setRight(null);
	    		return node.getWord();
	    	}
	        return null;
	    }

	    private Word deleteWithSon(TreeNode<Word> node){

	        return node.getWord();
	    }

	    private Word deleteWithSons(TreeNode<Word> node){

	        return node.getWord();
	    }

		public boolean updateWord(TreeNode<Word> wordNode,Word word) {
			TreeNode<Word> newNode = new TreeNode<Word>(word);
			if(findFather(wordNode.getWord().getWord()).getWord().getWord().equals(null)){
				System.out.println("Nodo no hallado");
			}else if(findNode(wordNode.getWord().getWord()).getWord().getWord().compareTo(word.getWord()) < 0) {
				if(wordNode.getLeft() != null) {
					newNode.setLeft(wordNode.getLeft());
				}
				if(wordNode.getRight() != null) {
					newNode.setRight(wordNode.getRight());
				}
				deleteLeaf(wordNode);
				findFather(wordNode.getWord().getWord()).setLeft(newNode);
				return true;
			}else {
				if(wordNode.getLeft() != null) {
					newNode.setLeft(wordNode.getLeft());
				}
				if(wordNode.getRight() != null) {
					newNode.setRight(wordNode.getRight());
				}
				findFather(wordNode.getWord().getWord()).setRight(newNode);
				return true;
			}
			return false;
		}
}
