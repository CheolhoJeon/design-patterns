package State.OnlineCourse;

public class Draft extends State {

    public Draft(final OnlineCourse onlineCourse) {
        super(onlineCourse);
    }

    @Override
    public void addReview(final String review, final Student student) {
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }

    @Override
    public void addStudent(final Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
