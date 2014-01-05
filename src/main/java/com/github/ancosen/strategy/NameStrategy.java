package com.github.ancosen.strategy;

import java.util.Collections;
import java.util.List;

public class NameStrategy implements ISortStrategy{

	private List machineList;

	public NameStrategy(List machineList) {
		super();
		this.machineList = machineList;
	}

	@Override
	public void order() {
		Collections.sort(machineList, new SortByName());
	}
}
