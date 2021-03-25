package com.ncu.TS;

public class TextEditor {
	private SpellChecker sc;
	public TextEditor(SpellChecker sc) {
	this.sc=sc;
	}
	public void spellchecker() {
	sc.display();
	}

}
