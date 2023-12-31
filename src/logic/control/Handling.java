package logic.control;

import java.util.ArrayList;
import java.util.List;

import logic.model.BinaryTree;
import logic.model.TreeNode;
import logic.model.Word;
import java.util.HashMap;


public class Handling {
	
	private List<Word> listTree;
	private BinaryTree<Word> a;
	private BinaryTree<Word> b;
	private BinaryTree<Word> c;
	private BinaryTree<Word> d;
	private BinaryTree<Word> e;
	private BinaryTree<Word> f;
	private BinaryTree<Word> g;
	private BinaryTree<Word> h;
	private BinaryTree<Word> i;
	private BinaryTree<Word> j;
	private BinaryTree<Word> k;
	private BinaryTree<Word> l;
	private BinaryTree<Word> m;
	private BinaryTree<Word> n;
	private BinaryTree<Word> o;
	private BinaryTree<Word> p;
	private BinaryTree<Word> q;
	private BinaryTree<Word> r;
	private BinaryTree<Word> s;
	private BinaryTree<Word> t;
	private BinaryTree<Word> u;
	private BinaryTree<Word> v;
	private BinaryTree<Word> w;
	private BinaryTree<Word> x;
	private BinaryTree<Word> y;
	private BinaryTree<Word> z;

	/**
	 * Se inicializan los arboles necesarios para el diccionario
	 */
	public Handling() {
		a = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		b = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		c = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		d = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		e = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		f = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		g = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		h = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		i = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		j = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		k = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		l = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		m = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		n = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		o = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		p = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		q = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		r = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		s = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		t = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		u = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		v = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		w = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		x = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		y = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
		z = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
	}

	/**
	 * Metodo que a�ade las palabras al diccionario
	 * @param word Objeto Word que lleva la informaci�n necesaria
	 * al diccionario
	 */
	public void addWord(Word word) {
		if (word.getWord().charAt(0) == 'a' || word.getWord().charAt(0) == 'A') {
			this.a.addNode(word);
		}
		if (word.getWord().charAt(0) == 'b' || word.getWord().charAt(0) == 'B') {
			this.b.addNode(word);
		}
		if (word.getWord().charAt(0) == 'c' || word.getWord().charAt(0) == 'C') {
			this.c.addNode(word);
		}
		if (word.getWord().charAt(0) == 'd' || word.getWord().charAt(0) == 'D') {
			this.d.addNode(word);
		}
		if (word.getWord().charAt(0) == 'e' || word.getWord().charAt(0) == 'E') {
			this.e.addNode(word);
		}
		if (word.getWord().charAt(0) == 'f' || word.getWord().charAt(0) == 'F') {
			this.f.addNode(word);
		}
		if (word.getWord().charAt(0) == 'g' || word.getWord().charAt(0) == 'G') {
			this.g.addNode(word);
		}
		if (word.getWord().charAt(0) == 'h' || word.getWord().charAt(0) == 'H') {
			this.h.addNode(word);
		}
		if (word.getWord().charAt(0) == 'i' || word.getWord().charAt(0) == 'I') {
			this.i.addNode(word);
		}
		if (word.getWord().charAt(0) == 'j' || word.getWord().charAt(0) == 'J') {
			this.j.addNode(word);
		}
		if (word.getWord().charAt(0) == 'k' || word.getWord().charAt(0) == 'K') {
			this.k.addNode(word);
		}
		if (word.getWord().charAt(0) == 'l' || word.getWord().charAt(0) == 'L') {
			this.l.addNode(word);
		}
		if (word.getWord().charAt(0) == 'm' || word.getWord().charAt(0) == 'M') {
			this.m.addNode(word);
		}
		if (word.getWord().charAt(0) == 'n' || word.getWord().charAt(0) == 'N') {
			this.n.addNode(word);
		}
		
		if (word.getWord().charAt(0) == 'o' || word.getWord().charAt(0) == 'O') {
			this.o.addNode(word);
		}
		if (word.getWord().charAt(0) == 'p' || word.getWord().charAt(0) == 'P') {
			this.p.addNode(word);
		}
		if (word.getWord().charAt(0) == 'q' || word.getWord().charAt(0) == 'Q') {
			this.q.addNode(word);
		}
		if (word.getWord().charAt(0) == 'r' || word.getWord().charAt(0) == 'R') {
			this.r.addNode(word);
		}
		if (word.getWord().charAt(0) == 's' || word.getWord().charAt(0) == 'S') {
			this.s.addNode(word);
		}
		if (word.getWord().charAt(0) == 't' || word.getWord().charAt(0) == 'T') {
			this.t.addNode(word);
		}
		if (word.getWord().charAt(0) == 'u' || word.getWord().charAt(0) == 'U') {
			this.u.addNode(word);
		}
		if (word.getWord().charAt(0) == 'v' || word.getWord().charAt(0) == 'V') {
			this.v.addNode(word);
		}
		if (word.getWord().charAt(0) == 'w' || word.getWord().charAt(0) == 'W') {
			this.w.addNode(word);
		}
		if (word.getWord().charAt(0) == 'x' || word.getWord().charAt(0) == 'X') {
			this.x.addNode(word);
		}
		if (word.getWord().charAt(0) == 'y' || word.getWord().charAt(0) == 'Y') {
			this.y.addNode(word);
		}
		if (word.getWord().charAt(0) == 'z' || word.getWord().charAt(0) == 'Z') {
			this.z.addNode(word);
		}

	}
	/**
	 * Metodo que devuelve una cadena de car�cteres que es la descripci�n
	 * de cada palabra
	 * @param word Cadena de car�cteres
	 * @return retorna una cadena de caracteres
	 */
	public String searchMeaning(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return a.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'b' || word.charAt(0) == 'B') {
			return b.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'c' || word.charAt(0) == 'C') {
			return c.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'd' || word.charAt(0) == 'D') {
			return d.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
			return e.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'f' || word.charAt(0) == 'F') {
			return f.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'g' || word.charAt(0) == 'G') {
			return g.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
			return h.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
			return i.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'j' || word.charAt(0) == 'J') {
			return j.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'k' || word.charAt(0) == 'K') {
			return k.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'l' || word.charAt(0) == 'L') {
			return l.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'm' || word.charAt(0) == 'M') {
			return m.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'n' || word.charAt(0) == 'N') {
			return n.findNode(word).getWord().getDescription();
		}
		
		if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
			return o.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'p' || word.charAt(0) == 'P') {
			return p.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'q' || word.charAt(0) == 'Q') {
			return q.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'r' || word.charAt(0) == 'R') {
			return r.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 's' || word.charAt(0) == 'S') {
			return s.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
			return t.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
			return u.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'v' || word.charAt(0) == 'V') {
			return v.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'w' || word.charAt(0) == 'W') {
			return w.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			return x.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return y.findNode(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'z' || word.charAt(0) == 'Z') {
			return z.findNode(word).getWord().getDescription();
		}
		return null;
	}
	/**
	 * Crea un listado de objetos Word seg�n la primera letra
	 * @param word Cadena de car�cteres
	 * @return retorna un objeto de tipo Word
	 */
	public Word takeWord(String word) {
		List<Word> list = listWords(word);
		for(Word w:list) {
			if(w.getWord().equals(word)){
				return w;
			}
		}
		return null;
	}
	/**
	 * Busca y retorna la traducci�n de una palabra en espec�fico
	 * @param word Cadena de car�cteres
	 * @return retorna una cadena de texto que contiene la
	 * traducci�n de la palabra a buscar
	 */
	public String searchTranslate(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return a.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'b' || word.charAt(0) == 'B') {
			return b.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'c' || word.charAt(0) == 'C') {
			return c.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'd' || word.charAt(0) == 'D') {
			return d.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
			return e.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'f' || word.charAt(0) == 'F') {
			return f.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'g' || word.charAt(0) == 'G') {
			return g.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
			return h.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
			return i.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'j' || word.charAt(0) == 'J') {
			return j.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'k' || word.charAt(0) == 'K') {
			return k.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'l' || word.charAt(0) == 'L') {
			return l.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'm' || word.charAt(0) == 'M') {
			return m.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'n' || word.charAt(0) == 'N') {
			return n.findFather(word).getWord().getTranslate();
		}
		
		if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
			return o.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'p' || word.charAt(0) == 'P') {
			return p.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'q' || word.charAt(0) == 'Q') {
			return q.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'r' || word.charAt(0) == 'R') {
			return r.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 's' || word.charAt(0) == 'S') {
			return s.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
			return t.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
			return u.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'v' || word.charAt(0) == 'V') {
			return v.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'w' || word.charAt(0) == 'W') {
			return w.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			return x.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return y.findFather(word).getWord().getTranslate();
		}
		if (word.charAt(0) == 'z' || word.charAt(0) == 'Z') {
			return z.findFather(word).getWord().getTranslate();
		}
		return null;
	}
	
	/**
	 * Crea un hasmap con todas las listas de letr
	 * @return Un hashMap que cintiene las listas de palabras por letraas
	 */
	public HashMap<String,List<Word>> getOrderList(){
		
		HashMap<String,List<Word>>  fullList = new HashMap<String,List<Word>> ();
		fullList.put("a", listWords("a"));
		fullList.put("b", listWords("b"));
		fullList.put("c", listWords("c"));
		fullList.put("d", listWords("d"));
		fullList.put("e", listWords("e"));
		fullList.put("f", listWords("f"));
		fullList.put("g", listWords("g"));
		fullList.put("h", listWords("h"));
		fullList.put("i", listWords("i"));
		fullList.put("j", listWords("j"));
		fullList.put("k", listWords("k"));
		fullList.put("l", listWords("l"));
		fullList.put("m", listWords("m"));
		fullList.put("n", listWords("n"));
		fullList.put("o", listWords("o"));
		fullList.put("p", listWords("p"));
		fullList.put("q", listWords("q"));
		fullList.put("r", listWords("r"));
		fullList.put("s", listWords("s"));
		fullList.put("t", listWords("t"));
		fullList.put("u", listWords("u"));
		fullList.put("v", listWords("v"));
		fullList.put("w", listWords("w"));
		fullList.put("x", listWords("x"));
		fullList.put("y", listWords("y"));
		fullList.put("z", listWords("z"));
		
		return fullList;
		
	}
	
	/**
	 * Agrega objetos de tipo Word seg�n la letra que se pasa por parametro
	 * @param word Cadena de car�cteres
	 * @return retorna una lista de objetos Word
	 */
	public List<Word> listWords(String word) {
		
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return listTree = a.listPresort();
		}
		if (word.charAt(0) == 'b' || word.charAt(0) == 'B') {
			return listTree = b.listPresort();
		}
		if (word.charAt(0) == 'c' || word.charAt(0) == 'C') {
			return listTree = c.listPresort();
		}
		if (word.charAt(0) == 'd' || word.charAt(0) == 'D') {
			return listTree = d.listPresort();
		}
		if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
			return listTree = e.listPresort();
		}
		if (word.charAt(0) == 'f' || word.charAt(0) == 'F') {
			return listTree = f.listPresort();
		}
		if (word.charAt(0) == 'g' || word.charAt(0) == 'G') {
			return listTree = g.listPresort();
		}
		if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
			return listTree = h.listPresort();
		}
		if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
			return listTree = i.listPresort();
		}
		if (word.charAt(0) == 'j' || word.charAt(0) == 'J') {
			return listTree = j.listPresort();
		}
		if (word.charAt(0) == 'k' || word.charAt(0) == 'K') {
			return listTree = k.listPresort();
		}
		if (word.charAt(0) == 'l' || word.charAt(0) == 'L') {
			return listTree = l.listPresort();
		}
		if (word.charAt(0) == 'm' || word.charAt(0) == 'M') {
			return listTree = m.listPresort();
		}
		if (word.charAt(0) == 'n' || word.charAt(0) == 'N') {
			return listTree = n.listPresort();
		}
		
		if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
			return listTree = o.listPresort();
		}
		if (word.charAt(0) == 'p' || word.charAt(0) == 'P') {
			return listTree = p.listPresort();
		}
		if (word.charAt(0) == 'q' || word.charAt(0) == 'Q') {
			return listTree = q.listPresort();
		}
		if (word.charAt(0) == 'r' || word.charAt(0) == 'R') {
			return listTree = r.listPresort();
		}
		if (word.charAt(0) == 's' || word.charAt(0) == 'S') {
			return listTree = s.listPresort();
		}
		if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
			return listTree = t.listPresort();
		}
		if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
			return listTree = u.listPresort();
		}
		if (word.charAt(0) == 'v' || word.charAt(0) == 'V') {
			return listTree = v.listPresort();
		}
		if (word.charAt(0) == 'w' || word.charAt(0) == 'W') {
			return listTree = w.listPresort();
		}
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			return listTree = x.listPresort();
		}
		if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return listTree = y.listPresort();
		}
		if (word.charAt(0) == 'z' || word.charAt(0) == 'Z') {
			return listTree = z.listPresort();
		}
		return null;
	}
	/**
	 * Modifica los objetos ya guardados
	 * @param word Cadena de car�cteres
	 * @param wordUpdate Objeto Word que lleva la informaci�n necesaria
	 * @return retorna un booleano seg�n si se realiz� la modificaci�n
	 */
	public boolean modifyWord(String word, Word wordUpdate) {
		
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return a.updateWord(a.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'b' || word.charAt(0) == 'B') {
			return b.updateWord(b.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'c' || word.charAt(0) == 'C') {
			return c.updateWord(c.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'd' || word.charAt(0) == 'D') {
			return d.updateWord(d.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
			return e.updateWord(e.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'f' || word.charAt(0) == 'F') {
			return f.updateWord(f.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'g' || word.charAt(0) == 'G') {
			return g.updateWord(g.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
			return h.updateWord(h.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
			return i.updateWord(i.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'j' || word.charAt(0) == 'J') {
			return j.updateWord(j.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'k' || word.charAt(0) == 'K') {
			return k.updateWord(k.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'l' || word.charAt(0) == 'L') {
			return l.updateWord(l.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'm' || word.charAt(0) == 'M') {
			return m.updateWord(m.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'n' || word.charAt(0) == 'N') {
			return n.updateWord(n.findNode(word), wordUpdate);
		}
		
		if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
			return o.updateWord(o.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'p' || word.charAt(0) == 'P') {
			return p.updateWord(p.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'q' || word.charAt(0) == 'Q') {
			return q.updateWord(q.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'r' || word.charAt(0) == 'R') {
			return r.updateWord(r.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 's' || word.charAt(0) == 'S') {
			return s.updateWord(s.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
			return t.updateWord(t.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
			return u.updateWord(u.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'v' || word.charAt(0) == 'V') {
			return v.updateWord(v.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'w' || word.charAt(0) == 'W') {
			return w.updateWord(w.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			return x.updateWord(x.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return y.updateWord(y.findNode(word), wordUpdate);
		}
		if (word.charAt(0) == 'z' || word.charAt(0) == 'Z') {
			return z.updateWord(z.findNode(word), wordUpdate);
		}
		return false;
	}
	/**
	 * Busca en un listado de palbras especifica la existencia de un
	 * objeto de tipo Word
	 * @param word Cadena de car�cteres
	 * @return retorna un booleano seg�n si existe o no el objeto Word
	 */
	public boolean repeteadWord(String word) {
		List<Word> letterList = listWords(word);
		for(Word w : letterList) {
			if(w.getWord().equals(word)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * Borra un nodo espec�fico seg�n si es una hoja, tiene un hijo o dos
	 * @param word Cadena de car�cteres
	 * @return retorna un booleano seg�n si es satisfactoria la eliminaci�n del nodo
	 */
	public boolean deleteWord(String word) {
		if (a.deleteNode(a.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (b.deleteNode(b.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (c.deleteNode(c.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (d.deleteNode(d.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (e.deleteNode(e.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (f.deleteNode(f.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (g.deleteNode(g.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (h.deleteNode(h.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (i.deleteNode(i.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (j.deleteNode(j.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (k.deleteNode(k.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (l.deleteNode(l.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (m.deleteNode(m.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (n.deleteNode(n.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (o.deleteNode(o.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (p.deleteNode(p.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (q.deleteNode(q.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (r.deleteNode(r.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (s.deleteNode(s.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (t.deleteNode(t.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (u.deleteNode(u.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (v.deleteNode(v.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (w.deleteNode(w.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (x.deleteNode(x.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (y.deleteNode(y.findFather(word)).getWord().equals(word)) {
			return true;
		}
		if (z.deleteNode(z.findFather(word)).getWord().equals(word)) {
			return true;
		}
		
		return false;
	}

}
