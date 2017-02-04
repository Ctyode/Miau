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

    @Override
    public Vec2<Float> positionFromOrigin(Vec2<Float> origin) {
        return new Vec2<>(
                origin.x + position.x,
                origin.y + position.y);
    }

}
