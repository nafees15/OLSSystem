package com.ols.dao;

import java.util.List;

import com.ols.po.*;

public interface AlertDAO {

	public void addAlert(Alert alert);
	public void updateAlert(Alert alert);
	public void deleteAlert(String AlertID);
	public List<Alert> getLatestAlert();
	
}
