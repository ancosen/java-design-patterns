package com.github.ancosen.visitor;

import java.util.List;

public class ElementA implements IElement{

	private List p;
	
	public ElementA(List p) {
		super();
		this.p = p;
	}

	@Override
	public void accept(IVisitor v) {
		v.visit(this);		
	}

	public List getP() {
		return p;
	}

	public void setP(List p) {
		this.p = p;
	}
}
