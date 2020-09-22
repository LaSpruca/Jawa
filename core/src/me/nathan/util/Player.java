package me.nathan.util;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.physics.box2d.World;

public class Player {
    private World world;
    private int x, y;
    private Square square ;

    public Player(int x, int y, World world) {
        this.world = world;
        this.x = x;
        this.y = y;
        square = new Square(x, y, 10, 10, new Color());
    }

    public void render() {

    }

    public void dispose() {

    }
}
