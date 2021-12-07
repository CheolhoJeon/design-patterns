package State.OnlineCourse;

public class Published extends State {

    public Published(final OnlineCourse onlineCourse) {
        super(onlineCourse);
    }

    @Override
    public void addReview(final String review, final Student student) {
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(final Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
