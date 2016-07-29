import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<Integer, List<String>> classRoom = new HashMap<>();

    public Map<Integer, List<String>> db() {
        return classRoom;
    }

    public void add(String student, int score) {
        List<String> studentList = grade(score);
        studentList.add(0,student);
        classRoom.put(score, studentList);
    }

    public List<String> grade(int grade) {
        return classRoom.getOrDefault(grade,new ArrayList<>());
    }

    public Map<Integer, List<String>> sort() {
        return classRoom;
    }
}
