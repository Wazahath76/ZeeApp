package com.zee.zee5app.service;


import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.SubscriptionRepo;

public class SubscriptionService {
	
	private SubscriptionRepo repository = SubscriptionRepo.getInstance();
	
	private SubscriptionService() {
		
		//TODO auto generated stub
	}
	
	// if we want to create that single object then we have to create it
	// inside the same class
	// and we have to share ref with others
	// to do the same we have to declare a method
	private static SubscriptionService service=null;
	
	// this would be a static
	// only one copy
	
	public static SubscriptionService getInstance() {
		
		// it becomes object independant?
		// static will make it independant on the object for execution
		if(service==null)
			service = new SubscriptionService();
		return service;
	}
	
	public String addSubscriber(Subscription register) {
		return this.repository.addSubscriber(register);
	}
	
	public Subscription getUserById(String id) {
		return this.repository.getUserById(id);
	}
	
	public Subscription[] getUsers() {
		return repository.getUsers();
	}


}
