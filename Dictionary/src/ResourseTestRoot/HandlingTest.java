package ResourseTestRoot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.control.Handling;
import logic.model.TreeNode;
import logic.model.Word;

class HandlingTest {
	private Handling h = new Handling();
	void setup() {
		h.addWord(new Word("Azul"));
		h.addWord(new Word("Amarillo"));
		h.addWord(new Word("Arroz"));
		h.addWord(new Word("Ario"));
		
	}
	
	@Test
	void test() {
		setup();
		h.findWord(new TreeNode(), null)
	}

}
