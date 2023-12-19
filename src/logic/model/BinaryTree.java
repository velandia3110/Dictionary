package logic.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryTree {
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

	    public void addNode( Word info ){
	        if( isEmpty()){
	            root = new TreeNode<>(info);
	            System.out.println("Palabra añadida");
	        }else{
	            TreeNode<Word> aux = root;
	            TreeNode<Word> ant = null;
	            while ( aux != null ){
	                ant = aux;
	                aux = comparator.compare(info,aux.getWord()) < 0 ? aux.getLeft() : aux.getRight();
	            }
	            if( comparator.compare( info, ant.getWord() ) < 0 ){
	                ant.setLeft( new TreeNode<>( info ) );
	                System.out.println("Palabra añadida");
	            }else{
	                ant.setRight( new TreeNode<>( info ) );
	                System.out.println("Palabra añadida");
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

	    public TreeNode<Word> findNode(Word node){

	        return null;
	    }

	    public int heightTree(){

	        return 0;
	    }

	    public int heightNode( TreeNode<Word> node){

	        return 0;
	    }

	    private int height ( TreeNode<Word> node ){

	        return 0;
	    }

	    public int weightTree(){

	        return 0;
	    }

	    private int weight( TreeNode<Word> node){

	        return 0;
	    }
	    public int levelNode( TreeNode<Word> node){

	        return 0;
	    }

	    public boolean isLeaf( TreeNode<Word> node){

	        return false;
	    }

	    public int gradeNode( TreeNode<Word> node ){

	        return 0;
	    }

	    public TreeNode<Word> findFather( TreeNode<Word> node ){

	        return null;
	    }

	    public Word deleteNode( TreeNode<Word> node ){

	        return null;
	    }

	    private Word deleteLeaf( TreeNode<Word> node ){

	        return node.getWord();
	    }

	    private Word deleteWithSon(TreeNode<Word> node){

	        return node.getWord();
	    }

	    private Word deleteWithSons(TreeNode<Word> node){

	        return node.getWord();
	    }
}
