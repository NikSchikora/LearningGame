package dhbw.lernplattform.tasks;

public class Task {

    private String message;
    private double answer;


    public Task(String message, double answer) {
        this.message = message;
        this.answer = answer;
    }

    public Task() {
        this.message = "";
        this.answer = 0.0;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
