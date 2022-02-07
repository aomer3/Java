package z.usecase.com.emc.test;

import z.usecase.com.emc.entities.Event;
import z.usecase.com.emc.entities.Organizer;
import z.usecase.com.emc.managers.EventManager;
import z.usecase.com.emc.managers.EventManagerImpl;
import z.usecase.com.emc.managers.EventManagerImpl2;

public class Test {
	
	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.setId(123L);
		organizer.setName("Apple Inc"); 
		System.out.println(organizer.getName());
		
		Event event = new Event(456L, "Iphone 100 Launch", "Grand Launch");
		System.out.println(event.getDescription());
		
		EventManager em = new EventManagerImpl2();
		Event newEvent = em.create(456L);
		System.out.println(newEvent.getDescription());
		
	}

}
