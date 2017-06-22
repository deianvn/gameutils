package net.rizov.gameutils.scene;

public interface CollisionStrategy {

    boolean isSupported(Class<? extends CollisionStrategy> type);

    boolean detectCollision(CollisionStrategy strategy);

    boolean detectCollisionType(CollisionStrategy strategy);

}
