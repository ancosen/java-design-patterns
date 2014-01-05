package com.github.ancosen.extension;

import junit.framework.TestCase;

public class ExtensionTest extends TestCase{
	
	public void testWrite(){
		IExample p = new Example("Ciao");
		
		ExampleExtension e = new ExampleExtension("Pippo", p);
		
		e.write();
	}
}
