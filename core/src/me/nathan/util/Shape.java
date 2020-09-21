package me.nathan.util;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Shape {
	void create();
	void render(SpriteBatch batch);
	void dispose();
}
