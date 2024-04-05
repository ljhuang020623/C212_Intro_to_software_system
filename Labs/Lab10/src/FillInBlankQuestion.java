import java.util.Map;
import java.util.LinkedHashMap;

class FillInBlankQuestion extends ChoiceQuestion {

  private final Map<String, Boolean> correctAnswers = new LinkedHashMap<>();

  FillInBlankQuestion(String prompt) {
    super(prompt);
  }

  void addChoice(String choice) {
    correctAnswers.put(choice, true);
    super.addChoice(choice, true);
  }

  @Override
  void setAnswer(String ans) {
    throw new UnsupportedOperationException("FillInBlankQuestion: cannot directly set answer.");
  }

  @Override
  String getAnswer() {
    throw new UnsupportedOperationException("FillInBlankQuestion: cannot directly get answer.");
  }

  @Override
  public String toString() {
    return super.toString() + " _________ (Fill in the blank)";
  }

  @Override
  boolean isCorrect(String ans) {
    return correctAnswers.containsKey(ans);
  }
}
