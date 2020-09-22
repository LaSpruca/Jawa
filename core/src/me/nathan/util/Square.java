package me.nathan.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Shape;
import me.nathan.Constants;

public class Square {
	ShapeRenderer renderer;

	int x;
	int y;
	int width;
	int height;
	Color color;

	public Square(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void create() {
		renderer = new ShapeRenderer();
	}

	public void render(SpriteBatch batch) {
//		System.out.println("X: " + x + " | Y: " + y + " | Width: " + width + " Height: " + height);

		batch.end();

		renderer.begin(ShapeRenderer.ShapeType.Filled);
		renderer.setColor(color);
		renderer.rect(x, Constants.HEIGHT - y - height, width, height);
		renderer.end();

		batch.begin();
	}

	public void dispose() {
		renderer.end();
	}
}
