package net.rizov.gameutils.scene;

public interface StatusChangeListener<S> {
	
	public void statusChanged(StatusChangedEvent<S> event);
	
}
