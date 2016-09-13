package com.vindixit.toggl.service;

import org.junit.Test;

import com.vindixit.toggl.model.TimeEntry;

import static org.junit.Assert.assertEquals;

public class WorkShiftsTest {

	@Test
	public void testGetStartFirstShift() {
		WorkShifts shifts = new WorkShifts();
		TimeEntry timeEntry1 = new TimeEntry(8, 12);
		TimeEntry timeEntry2 = new TimeEntry(14, 18);
		int startFirstShift = shifts.getStartFirstShift(new TimeEntry[]{timeEntry1, timeEntry2});
		assertEquals(8, startFirstShift);
	}

}
