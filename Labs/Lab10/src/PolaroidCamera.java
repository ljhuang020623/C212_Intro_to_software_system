class PolaroidCamera implements Camera {
  @Override
  public int numberOfPhotographs() {
    return 12;
  }

  @Override
  public String takePhotograph() {
    return "Taking a picture on my polaroid camera!";
  }
}
