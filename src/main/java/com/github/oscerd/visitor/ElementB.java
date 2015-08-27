package com.github.oscerd.visitor;

import java.util.Map;

public class ElementB implements IElement{

	private Map s;
	
	public ElementB(Map s) {
		super();
		this.s = s;
	}

	@Override
	public void accept(IVisitor v) {
		v.visit(this);	
	}

	public Map getS() {
		return s;
	}

	public void setS(Map s) {
		this.s = s;
	}
}
