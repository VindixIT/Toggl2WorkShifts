package com.vindixit.toggl.service;

import com.vindixit.toggl.model.TimeEntry;

public class WorkShifts {

	public int getStartFirstShift(TimeEntry[] timeEntries) {
		// Pretendemos um algoritmo de ordenação.
		// Um valor máximo para hora para iniciarmos
		// o algoritmo, pode ser o numero 25 (mesmo irreal).
		int least = 25;
		for (int i = 0; i < timeEntries.length; i++) {
			int start = timeEntries[i].getStart();
			if(start<least){
				least = start; 
			}
		}
		return least;
	}

	public int getEndFirstShift(TimeEntry[] timeEntries) {
		return 0;
	}

	public int getStartSecondShift(TimeEntry[] timeEntries) {
		return 0;
	}

	public int getEndSecondShift(TimeEntry[] timeEntries) {
		return 0;
	}

}
