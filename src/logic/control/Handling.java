package logic.control;

import java.util.ArrayList;
import java.util.List;

import logic.model.BinaryTree;
import logic.model.TreeNode;
import logic.model.Word;

public class Handling {
	private List<Word> listTree;
	private BinaryTree<Word> bt;
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
	private BinaryTree<Word> ñ;
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

	public Handling() {
		bt = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
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
		ñ = new BinaryTree<>((word1, word2) -> word1.getWord().compareTo(word2.getWord()));
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
		if (word.getWord().charAt(0) == 'ñ' || word.getWord().charAt(0) == 'Ñ') {
			this.ñ.addNode(word);
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

	public String searchMeaning(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return a.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'b' || word.charAt(0) == 'B') {
			return b.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'c' || word.charAt(0) == 'C') {
			return c.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'd' || word.charAt(0) == 'D') {
			return d.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
			return e.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'f' || word.charAt(0) == 'F') {
			return f.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'g' || word.charAt(0) == 'G') {
			return g.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
			return h.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
			return i.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'j' || word.charAt(0) == 'J') {
			return j.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'k' || word.charAt(0) == 'K') {
			return k.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'l' || word.charAt(0) == 'L') {
			return l.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'm' || word.charAt(0) == 'M') {
			return m.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'n' || word.charAt(0) == 'N') {
			return n.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'ñ' || word.charAt(0) == 'Ñ') {
			return ñ.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
			return o.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'p' || word.charAt(0) == 'P') {
			return p.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'q' || word.charAt(0) == 'Q') {
			return q.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'r' || word.charAt(0) == 'R') {
			return r.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 's' || word.charAt(0) == 'S') {
			return s.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
			return t.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
			return u.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'v' || word.charAt(0) == 'V') {
			return v.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'w' || word.charAt(0) == 'W') {
			return w.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
			return x.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return y.findFather(word).getWord().getDescription();
		}
		if (word.charAt(0) == 'z' || word.charAt(0) == 'Z') {
			return z.findFather(word).getWord().getDescription();
		}
		return null;
	}

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
		if (word.charAt(0) == 'ñ' || word.charAt(0) == 'Ñ') {
			return ñ.findFather(word).getWord().getTranslate();
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
		if (word.charAt(0) == 'ñ' || word.charAt(0) == 'Ñ') {
			return listTree = ñ.listPresort();
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
		if (word.charAt(0) == 'ñ' || word.charAt(0) == 'Ñ') {
			return ñ.updateWord(ñ.findNode(word), wordUpdate);
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

	public boolean deleteWord(String word) {
		if (bt.deleteNode(bt.findFather(word)).getWord().equals(word)) {
			return true;
		}
		return false;
	}

}
