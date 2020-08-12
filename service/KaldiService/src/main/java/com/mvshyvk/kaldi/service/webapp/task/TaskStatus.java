package com.mvshyvk.kaldi.service.webapp.task;

/**
 * Possible task statuses
 */
public enum TaskStatus {
	
	/* Task is unknown */
	enUnknown,
	
	/* Task is in queue */
	enInQueue,
	
	/* Task is in a progress */
	enInProgress,
	
	/* Task is completed */
	enCompleted	
}