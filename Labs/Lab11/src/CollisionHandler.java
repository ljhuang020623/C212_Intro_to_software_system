class CollisionHandler {

  static boolean collidesWith(GameObject entity1, GameObject entity2) {
    return entity1.getX() < entity2.getX() + entity2.getWidth() &&
            entity1.getX() + entity1.getWidth() > entity2.getX() &&
            entity1.getY() < entity2.getY() + entity2.getHeight() &&
            entity1.getY() + entity1.getHeight() > entity2.getY();
  }
}
