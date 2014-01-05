package com.github.ancosen.extension;

public class Example implements IExample{

	private String prova;

	public Example(String prova) {
		super();
		this.prova = prova;
	}


	@Override
	public void write() {
		System.err.println("Example: " + prova);		
	}
}
