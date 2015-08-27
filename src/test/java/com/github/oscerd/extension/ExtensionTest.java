package com.github.oscerd.extension;

import org.junit.Test;

public class ExtensionTest{
	
	@Test
	public void testWrite(){
		IExample p = new Example("Ciao");
		
		ExampleExtension e = new ExampleExtension("Pippo", p);
		
		e.write();
	}
}
