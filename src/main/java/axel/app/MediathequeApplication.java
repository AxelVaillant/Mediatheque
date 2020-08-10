package axel.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import axel.app.service.ILivreService;
import axel.app.service.INotificationService;
import axel.app.service.IRoleService;
import axel.app.service.IUserService;

@SpringBootApplication
public class MediathequeApplication implements CommandLineRunner{
	
	@Autowired
	private IUserService userservice;
	@Autowired
	private IRoleService roleservice;
	@Autowired
	private ILivreService livreservice;
	@Autowired
	private INotificationService notificationservice;

	public static void main(String[] args) {
		SpringApplication.run(MediathequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
