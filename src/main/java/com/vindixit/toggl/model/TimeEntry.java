package com.vindixit.toggl.model;

public class TimeEntry {

	private int end;
	private int start;

	public TimeEntry ( int start, int end ) {
		this.start = start;
		this.end = end;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int inicio) {
		this.end = inicio;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int termino) {
		this.start = termino;
	}

}
