import java.util.LinkedHashMap;
import java.util.Map;

class ChoiceQuestion extends Question {

  private Map<String, Boolean> choices = new LinkedHashMap<>();

  ChoiceQuestion(String prompt) {
    super(prompt);
  }

  /**
   * TODO.
   * @param answer
   * @param isCorrect
   */
  void addChoice(String answer, boolean isCorrect) {
    choices.put(choice, isCorrect);
    if (isCorrect) {
      super.setAnswer(choice);
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(super.toString());
    choices.keySet().forEach(choice -> sb.append("\n").append(choice));
    return sb.toString();
  }
}