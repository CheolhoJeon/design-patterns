package State.OnlineCourse;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private String name;
    private State state = new Draft(this);
    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public OnlineCourse(final String name) {
        this.name = name;
    }

    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public void addStudent(Student student) {
        state.addStudent(student);
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
            "name='" + name + '\'' +
            ", state=" + state +
            ", reviews=" + reviews +
            ", students=" + students +
            '}';
    }
}
