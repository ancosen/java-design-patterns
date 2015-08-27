package com.github.oscerd.nullobject;

import java.io.PrintStream;

import org.junit.Test;

public class NullObjectTest{
	
	@Test
	public void testNull(){
		new Application(new NullPrintStream()).go();	
	}
	
	@Test
	public void testNormale(){
		new Application(new PrintStream(new NormalOutputStream())).go();	
	}
	
	@Test
	public void testNormale1(){
		new Application(new PrintStream(new NullOutputStream())).go();	
	}

}
