package com.github.oscerd.strategy;

import java.util.Comparator;

public class SortBySpeedLowMaxComparator implements Comparator{

	@Override
	public int compare(Object f, Object s) {
        Machine o1 = (Machine) f;
        Machine o2 = (Machine) s;
        if (o1.getSpeed() < o2.getSpeed())    return -1;
        if (o1.getSpeed() == o2.getSpeed())    return 0;
        return 1;
	}

}
