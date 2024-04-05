class PhoneCamera implements Camera {
  @Override
  public int numberOfPhotographs() {
    return 13400;
  }

  @Override
  public String takePhotograph() {
    return "Photo taken with my digital camera!";
  }
}

