interface Camera {
  int numberOfPhotographs();

  default String takePhotograph() {
    return "Taking a photograph!";
  }
}
