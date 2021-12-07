package State.OnlineCourse;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<OnlineCourse> privateCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
