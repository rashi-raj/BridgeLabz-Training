package com.day5.eventmanagementplatform;

public interface ISchedulable {
	void schedule();
    void reschedule(String newDate);
    void cancel();
}
