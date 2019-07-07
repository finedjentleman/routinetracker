package com.finedjentleman.routinetracker.services;

import com.finedjentleman.routinetracker.models.Activity;

public interface ActivityService {

	void addActivity(Activity activity, Long userId);

	void deleteActivity(Long userId, Long activityId);

	void updateActivity(Long userId, Long activityId, Activity activity);

}