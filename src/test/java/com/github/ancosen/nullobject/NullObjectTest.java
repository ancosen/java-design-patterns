package com.github.ancosen.nullobject;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class NullObjectTest extends TestCase{
	
	public void testNull(){
		new Application(new NullPrintStream()).go();	
	}
	
	public void testNormale(){
		new Application(new PrintStream(new NormalOutputStream())).go();	
	}

}
