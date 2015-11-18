package com.github.gawkat.game.util;

import com.badlogic.gdx.Gdx;

/**
 * @author Gawkat
 *
 */
public class Settings {

	public void loadWindowSettings() {
		Gdx.graphics.setTitle(Local.get("game.title"));
	}

}
