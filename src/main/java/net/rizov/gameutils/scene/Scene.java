package net.rizov.gameutils.scene;

import com.badlogic.gdx.utils.Array;

public class Scene implements Updatable {
	
	private Array<Action> actions;
	
	@Override
	public void update(float deltaTime) {
		
	}
	
	public void addAction(Action action) {
		actions.add(action);
	}

}
