package com.solvd.touragency.eurasiatour;

public class China extends Asia {

	private String place;
	private int time;

	public China() {
	}

	public China(String place, int time) {
		this.place = place;
		this.time = time;
	}

	public void setVoice(String place) {
		this.place = place;
	}
	public String getVoice() {
		return place;
	}
	public void setSize(int time) {
		this.time = time;
	}


	public int getSize() {
		return time;
	}
	public void greetings(){
		super.greetings();
		System.out.println("Hello from China");
	}

	@Override
	public String toString() {
		return "China{" +
				"place='" + place + '\'' +
				", time=" + time +
				'}';
	}
}