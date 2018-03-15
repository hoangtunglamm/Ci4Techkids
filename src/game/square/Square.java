package game.square;

import base.GameObject;
import base.Vector2D;
import utils.Utils;

public class Square extends GameObject {

    public Vector2D velocity;

    public Square() {
        this.image = Utils.loadImage("resources/square/enemy_square_small.png");
        this.velocity = new Vector2D();
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
    }
}
