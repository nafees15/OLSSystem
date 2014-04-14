package com.ols.dao;

import java.util.List;

import com.ols.po.*;

public interface NotificationDAO {
	public void addNotification(Notification notification);
	public void updateAlert(Alert alert);
	public void deleteAlert(String AlertID);
	public List<Notification> getLatestNotification();

}
