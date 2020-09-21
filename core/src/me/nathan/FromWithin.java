package me.nathan;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import me.nathan.util.Square;


public class FromWithin extends ApplicationAdapter {
	SpriteBatch batch;
	Square square = new Square(10, 10, 50, 50, new Color(10, 0, 0, 1));

	@Override
	public void create () {
		batch = new SpriteBatch();
		square.create();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(127,127, 127, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		square.render(batch);

		batch.end();
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		square.dispose();
	}
}
