

import java.util.List;

public class Questions {

	int questionId;
	String question;
	List<String> answers;
	
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	
	public void output()
	{
		System.out.println("Question ID is :"+this.getQuestionId());
		System.out.println("Question is :"+this.getQuestion());
		System.out.println("Answers are :");
		answers.forEach(System.out::println);
	}
	
}
