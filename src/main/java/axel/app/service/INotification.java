package axel.app.service;

import java.util.List;

import axel.app.models.Notification;

public interface INotification {

	public List<Notification> getAllNotification();
	public Notification getNotificationById(long id);
	public Notification createNotification(Notification Notification);

}
