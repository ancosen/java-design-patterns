package com.github.oscerd.extension;

public class ExampleExtension implements IExample{
	
	private String prova;
	private IExample example;
	
	public ExampleExtension(String prova, IExample example) {
		super();
		this.prova = prova;
		this.example = example;
	}

	@Override
	public void write() {
		example.write();
		System.err.println("ExampleExtension: " + prova);	
	}
}
