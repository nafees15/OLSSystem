package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */

public class Notification implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String NotificationID;
	private String NotificationTime;
	private String NotificationType;
	
	public String getNotificationID() {
		return NotificationID;
	}
	public void setNotificationID(String notificationID) {
		NotificationID = notificationID;
	}
	public String getNotificationTime() {
		return NotificationTime;
	}
	public void setNotificationTime(String notificationTime) {
		NotificationTime = notificationTime;
	}
	public String getNotificationType() {
		return NotificationType;
	}
	public void setNotificationType(String notificationType) {
		NotificationType = notificationType;
	}
	
	
	
}
