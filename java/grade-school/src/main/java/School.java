import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class School {
    private HashMap<Integer, List<String>> classRoom = new HashMap<>();

    public HashMap<Integer, List<String>> db() {
        return classRoom;
    }

    public void add(String student, int grade) {
        if (classRoom.containsKey(grade)) {
            classRoom.get(grade).add(student);
        } else {
            List<String> studentList = new ArrayList<String>();
            studentList.add(student);
            classRoom.put(grade, studentList);
        }
    }

    public List<String> grade(int grade) {
        if (classRoom.containsKey(grade)) {
            return classRoom.get(grade);
        } else {
            return Collections.emptyList();
        }
    }

    public HashMap<Integer, List<String>> sort() {
        HashMap<Integer, List<String>> sortedClassroom = new HashMap<>();
        classRoom.forEach((k, v) -> sortedClassroom.put(k, sortedNames(v)));
        return sortedClassroom;
    }

    private List<String> sortedNames(List<String> v) {
        v.sort((name1, name2) -> name1.compareTo(name2));
        return v;
    }
}
