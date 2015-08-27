package com.github.oscerd.visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class VisitorTest{
	
	@Test
	public void testVisitor(){
		
	      Visitor up = new Visitor();
	      
	      List p = new ArrayList();
	      p.add(1);
	      p.add(2);
	      
	      Map l = new HashMap();
	      l.put("1", "ciao");
	      l.put("2", "pippo");
	      
	      ElementA e = new ElementA(p);
	      
	      e.accept(up);
	      
	      ElementB o = new ElementB(l);
	      
	      o.accept(up);
	}
}
