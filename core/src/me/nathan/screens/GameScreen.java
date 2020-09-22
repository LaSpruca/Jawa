package me.nathan.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import me.nathan.Constants;
import me.nathan.util.Square;

public class GameScreen implements Screen {
    private SpriteBatch batch;
    private Square square = new Square(10, 10, 50, 50, new Color(10, 0, 0, 1));
    private World world;
    private OrthographicCamera camera;
    private Viewport viewport;

    public GameScreen() {
        batch = new SpriteBatch();
        square.create();
        world = new World(Vector2.Zero, true);
        camera = new OrthographicCamera(Constants.WIDTH, Constants.HEIGHT);
        camera.setToOrtho(true, Constants.WIDTH, Constants.HEIGHT);
        viewport = new FitViewport(Constants.WIDTH, Constants.HEIGHT, camera);
    }

    @Override
    public void show() {

    }

    public void update() {
        camera.update();

    }

    @Override
    public void render(float delta) {
        update();
        batch.setProjectionMatrix(camera.combined);
        Gdx.gl.glClearColor(127, 127, 127, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        square.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        square.dispose();
    }
}
