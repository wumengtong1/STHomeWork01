package wumengtong;

public class SMTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        StudentManager.addStudent(1,"吴孟桐","1999.7.18",true);
        StudentManager.seek("吴孟桐");
        StudentManager. change("吴孟桐");
        StudentManager.printAll();
        StudentManager.tuichu();
    }
}
