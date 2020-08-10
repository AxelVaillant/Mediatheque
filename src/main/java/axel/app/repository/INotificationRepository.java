package axel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import axel.app.models.Notification;

public interface INotificationRepository extends JpaRepository<Notification, Long>{

}
