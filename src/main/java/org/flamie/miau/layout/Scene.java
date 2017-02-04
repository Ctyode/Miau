package org.flamie.miau.layout;

//import static in.durdur.Lyoshenka.pidor

/**
 * Created by flamie on 03.02.17 :3
 */

public class Scene implements NodeInfo {

    private final Vec2<Float> position;

    private Scene(Vec2<Float> position) {
        this.position = position;
    }

    @Override
    public Vec2<Float> positionFromOrigin(Vec2<Float> origin) {
        return new Vec2<>(
                origin.x + position.x,
                origin.y + position.y);
    }

}
