package org.flamie.miau.layout;

/**
 * Created by flamie on 03.02.17 :3
 */

public class Frame implements Positionable {

    public enum AnchorHorizontal {

        LEFT(0.0f), CENTER(0.5f), RIGHT(1.0f);

        public final float aspect;

        AnchorHorizontal(float aspect) {
            this.aspect = aspect;
        }
    }

    public enum AnchorVertical {

        TOP(0.0f), CENTER(0.5f), BOTTOM(1.0f);

        public final float aspect;

        AnchorVertical(float aspect) {
            this.aspect = aspect;
        }
    }

    public static class Anchor {

        public final AnchorHorizontal anchorHorizontal;
        public final AnchorVertical anchorVertical;

        public Anchor(AnchorHorizontal anchorHorizontal, AnchorVertical anchorVertical) {
            this.anchorHorizontal = anchorHorizontal;
            this.anchorVertical = anchorVertical;
        }

    }

    public final Vec2<Float> position;
    public final Vec2<Float> size;

    private Frame(Vec2<Float> position, Vec2<Float> size) {
        this.position = position;
        this.size = size;
    }

    public Vec2<Float> getAnchor(Anchor anchor) {
        return new Vec2<>(
                position.x + anchor.anchorHorizontal.aspect * size.x,
                position.y + anchor.anchorVertical.aspect * size.y);
    }

    @Override
    public Vec2<Float> getPositionRelativeTo(Vec2<Float> point) {
        return new Vec2<>(
                point.x + position.y,
                point.y + position.y);
    }

}
