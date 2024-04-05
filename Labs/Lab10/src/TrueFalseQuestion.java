class TrueFalseQuestion extends ChoiceQuestion {

  TrueFalseQuestion(String prompt, boolean answer) {
    super(prompt);
    super.addChoice("true", answer);
    super.addChoice("false", !answer);
  }


  @Override
  void addChoice(String answer, boolean isCorrect) {
    // Note: do NOT "make it abstract." Once you define the
    // method in the superclass, this error goes away.
    throw new UnsupportedOperationException("TrueFalseQuestion: cannot add choice.");
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
