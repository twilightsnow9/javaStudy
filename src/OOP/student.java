package OOP;

public class student {
    public static void main(String[] args) {
//    创建一个数组用来存储学生
        studentInfo[] arr = new studentInfo[3];

        // 创建学生对象
        studentInfo std1 = new studentInfo(1,"张三",22);
        studentInfo std2 = new studentInfo(2,"李四",22);
        studentInfo std3 = new studentInfo(3,"王五",23);

//        把对象添加到数组中
        arr[0] = std1;
        arr[1] = std2;
        arr[2] = std3;
//        新增一个学生对象
        studentInfo std4 = new studentInfo(4,"赵六",24);
    }
}
class studentInfo {
    private int StudentId;
    private String StudentName;
    private int StudentAge;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public studentInfo(int studentId, String studentName, int studentAge) {
        StudentId = studentId;
        StudentName = studentName;
        StudentAge = studentAge;
    }

    public studentInfo() {
    }

    //    封装studentInfo方法
    public void StudentInfo() {

    }
}