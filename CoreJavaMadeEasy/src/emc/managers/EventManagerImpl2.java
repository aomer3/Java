package z.usecase.com.emc.managers;

import z.usecase.com.emc.entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, "Mac Book Launch", "New Generation of MacBooks Launch");
	}

}
