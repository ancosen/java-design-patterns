package com.github.oscerd.strategy;

import java.util.Comparator;

public class SortByName implements Comparator{

	@Override
	public int compare(Object f, Object s) {
        Machine o1 = (Machine) f;
        Machine o2 = (Machine) s;
        int res = o1.getName().compareTo(o2.getName());
        return res;
	}

}
