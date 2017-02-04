package org.flamie.miau.layout;

/**
 * Created by flamie on 03.02.17 :3
 */

public class Frame implements NodeInfo {

    public final Vec2<Float> position;
    public final Vec2<Float> size;

    private Frame(Vec2<Float> position, Vec2<Float> size) {
        this.position = position;
        this.size = size;
    }

    public Vec2<Float> getAnchor(Vec2<Float> anchor) {
        return new Vec2<>(
                position.x + anchor.x * size.x,
                position.y + anchor.y * size.y);
    }

//    public Vec2<Float> getPositionRelativeTo(Vec2<Float> point) {
//        return new Vec2<>(
//                point.x + position.x,
//                point.y + position.y);
//    }

}
