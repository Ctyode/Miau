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

//    public Vec2<Float> getPositionRelativeTo(Vec2<Float> point) {
//        return new Vec2<>(
//                point.x + position.x,
//                point.y + position.y);
//    }

}
