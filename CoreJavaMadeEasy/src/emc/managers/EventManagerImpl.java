package z.usecase.com.emc.managers;

import z.usecase.com.emc.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, null, null);
	}

}
