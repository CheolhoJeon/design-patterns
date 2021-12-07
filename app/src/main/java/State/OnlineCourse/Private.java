package State.OnlineCourse;

public class Private extends State {

    public Private(final OnlineCourse onlineCourse) {
        super(onlineCourse);
    }

    @Override
    public void addReview(final String review, final Student student) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        }
    }

    @Override
    public void addStudent(final Student student) {
        if (student.isEnabledForPrivateClass(this.onlineCourse)) {
            this.onlineCourse.getStudents().add(student);
        }
    }
}
