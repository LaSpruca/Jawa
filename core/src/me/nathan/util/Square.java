package me.nathan.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Square implements Shape {
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

	@Override
	public void render(SpriteBatch batch) {
//		System.out.println("X: " + x + " | Y: " + y + " | Width: " + width + " Height: " + height);

		batch.end();

		renderer.begin(ShapeRenderer.ShapeType.Filled);
		renderer.setColor(color);
		renderer.rect(x, Gdx.app.getGraphics().getHeight() - y - height, width, height);
		renderer.end();

		batch.begin();
	}

	public void dispose() {
		renderer.end();
	}
}
