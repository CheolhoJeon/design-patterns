package State.OnlineCourse;

public abstract class State {

    protected OnlineCourse onlineCourse;

    public State(final OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public abstract void addReview(String review, Student student);
    public abstract void addStudent(Student student);

}
