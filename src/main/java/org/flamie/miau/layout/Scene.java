package org.flamie.miau.layout;

//import static in.durdur.Lyoshenka.pidor

/**
 * Created by flamie on 03.02.17 :3
 */

public class Scene implements Positionable {

    private final Vec2<Float> position;

    private Scene(Vec2<Float> position) {
        this.position = position;
    }

    @Override
    public Vec2<Float> getPositionRelativeTo(Vec2<Float> point) {
        return new Vec2<>(
                point.x + position.x,
                point.y + position.y);
    }

}
