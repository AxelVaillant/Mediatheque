package axel.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import axel.app.models.Notification;
import axel.app.service.INotification;

@RestController
@RequestMapping("notification")
@CrossOrigin("http://localhost:4200")
public class NotificationController {
@Autowired
	INotification notificationservice;

@GetMapping("/all")
public List<Notification> getAllNotification(){
	return notificationservice.getAllNotification();
}

@GetMapping("/byid/{id}")
public Notification getNotificationbyid(@PathVariable long id) {
	return notificationservice.getNotificationById(id);
}

@PostMapping("/save")
public Notification createNotification(@RequestBody Notification Notification) {
	return notificationservice.createNotification(Notification);
}
}


