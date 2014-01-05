package com.github.ancosen.strategy;

public class Machine implements IMachine{

	private int horses;
	private int speed;
	private String name;
	private Boolean is4WD;
	private final MachineClass machineClass;

	public Machine(int horses, int speed, String name, Boolean is4wd,
			MachineClass machineClass) {
		super();
		this.horses = horses;
		this.speed = speed;
		this.name = name;
		is4WD = is4wd;
		this.machineClass = machineClass;
	}

	public int getHorses() {
		return horses;
	}

	public void setHorses(int horses) {
		this.horses = horses;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean is4WD() {
		return is4WD;
	}

	public void setIs4WD(Boolean is4wd) {
		is4WD = is4wd;
	}

	public MachineClass getMachineClass() {
		return machineClass;
	}
	
	 public String toString(){
		 StringBuilder strBuilder = new StringBuilder();
		 strBuilder.append("Machine: {\n");
		 strBuilder.append("\tClass: ")
		 .append(this.getMachineClass()).append("\n");
		 strBuilder.append("\tName: ")
		 .append(name).append("\n");
		 strBuilder.append("\tHorses: ")
		 .append(horses).append("\n");
		 strBuilder.append("\tSpeed: ")
		 .append(speed).append("\n");
		 strBuilder.append("\t4WD: ")
		 .append(is4WD).append("\n");
		 return strBuilder.toString();
		 }
}
