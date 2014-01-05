package com.github.ancosen.visitor;

import java.util.ArrayList;
import java.util.List;

public class Visitor implements IVisitor{

	@Override
	public void visit(ElementA e) {
		System.err.println(e.getP());
	}

	@Override
	public void visit(ElementB p) {
		System.err.println(p.getS());		
	}
}
