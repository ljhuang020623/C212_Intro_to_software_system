class DigitalCamera implements Camera {
  @Override
  public int numberOfPhotographs() {
    return 3600;
  }

  @Override
  public String takePhotograph() {
    return "Photo taken with my digital camera!";
  }
}
