package axel.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axel.app.models.Notification;
import axel.app.models.Notification;
import axel.app.repository.INotificationRepository;
@Service
public class INotificationService implements INotification{
	@Autowired
	INotificationRepository notificationrepository;
	
	@Override
	public List<Notification> getAllNotification() {
return notificationrepository.findAll();
	}

	@Override
	public Notification getNotificationById(long id) {
		Optional<Notification> Notification1 =notificationrepository.findById(id);
		Notification Notification = new Notification();
		if(Notification1.isPresent()) {
			Notification=Notification1.get()
;		}
		return Notification;
	}

	@Override
	public Notification createNotification(Notification Notification) {
		return notificationrepository.save(Notification);

}}
