package com.github.ancosen.strategy;

import java.util.Comparator;

public class SortByHorsesMaxLow implements Comparator{

	@Override
	public int compare(Object f, Object s) {
        Machine o1 = (Machine) f;
        Machine o2 = (Machine) s;
        if (o1.getHorses() < o2.getHorses())    return 1;
        if (o1.getHorses() == o2.getHorses())    return 0;
        return -1;
	}

}
