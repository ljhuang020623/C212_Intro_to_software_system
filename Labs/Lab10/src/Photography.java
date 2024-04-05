import java.util.*;

class Photography {
  static Optional<Integer> averagePhotos(List<Camera> cameras) {
    if (cameras.isEmpty()) {
      return Optional.empty();
    }
    int sum = cameras.stream().mapToInt(Camera::numberOfPhotographs).sum();
    return Optional.of(sum / cameras.size());
  }
  static void takePhotos(List<Camera> cameras) {
    cameras.forEach(camera -> System.out.println(camera.takePhotograph()));
  }
}
