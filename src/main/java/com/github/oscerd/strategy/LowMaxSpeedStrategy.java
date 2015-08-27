package com.github.oscerd.strategy;

import java.util.Collections;
import java.util.List;

public class LowMaxSpeedStrategy implements ISortStrategy{

	private List machineList;

	public LowMaxSpeedStrategy(List machineList) {
		super();
		this.machineList = machineList;
	}

	@Override
	public void order() {
		Collections.sort(machineList, new SortBySpeedLowMaxComparator());
	}
}
