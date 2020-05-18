package wumengtong;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList = new ArrayList<>();//初始化
    public static void addStudent(int ID,String name,String birDate,boolean gender)
    {

        Student student = new Student();
        student.setBirDate(birDate);
        student.setID(ID);
        student.setName(name);
        student.setGender(gender);
        arrayList.add(student);

    }//插入

    public static void seek(String name1)
    {

        boolean isFind = false;

        for (Student student1 : arrayList)
        {
            if (student1.getName().equals(name1) )
            {
                isFind =true;
                System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));
            }
        }
        if (!isFind)
            System.out.println("未查到此人，请核对信息");
    }//查找
    	public static void delete(String name2)
        {
            boolean isFinddelete = false;

            for (int i = 0; i <arrayList.size();i++)
            {
                Student student1 = arrayList.get(i);
                if (student1.getName().equals(name2) )
                {
                    isFinddelete =true;
                    arrayList.remove(student1);
                }
            }
            if (!isFinddelete)
                System.out.println("未查到此人，请核对信息");
        }//删除
    public static void change(String name3)
    {

        boolean isFindchange = false;
        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name3) )
            {
                isFindchange =true;
                System.out.println("请输入修改人的出生日期");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("请输入修改人的性别");
                boolean sex = scanner.nextLine().equals("男")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindchange)
            System.out.println("未查到此人，请核对信息");
    }///修改
    public static  void xianshi(ArrayList<String> arrayList)
    {
        for (String string:arrayList)
        {
            if (string.equals("1"))
                System.out.print("插入" + " ");
            if (string.equals("2"))
                System.out.print("查找" + " ");
            if (string.equals("3"))
                System.out.print("删除" + " ");
            if (string.equals("4"))
                System.out.print("修改" + " ");
            if (string.equals("5"))
                System.out.print("输出" + " ");
            if (string.equals("6"))
                System.out.print("退出" + " ");
            if (string.equals("7"))
                System.out.print("回顾" + " ");
        }
    }
public static void printAll()
{
    for (Student student1 : arrayList)
        System.out.println("学号：" + student1.getID()  + "姓名：" + student1.getName() + "出生日期："+student1.getBirDate()+"性别"+(student1.isGender()?"男":"女"));

}
public  static  void tuichu()
{
    System.exit(0);
}
    public static void App()
    {
        boolean tuichu = true;
        ArrayList<String> arrayList = new ArrayList<>();
        while (tuichu)
        {
            System.out.println("请选择操作");
            System.out.println("*********************************************************");
            System.out.println("*                         1.插入                        *");
            System.out.println("*                         2.查找                        *");
            System.out.println("*                         3.删除                        *");
            System.out.println("*                         4.修改                        *");
            System.out.println("*                         5.输出                        *");
            System.out.println("*                         6.退出                        *");
            System.out.println("*********************************************************");
            String a = scanner.nextLine();
            arrayList.add(a);
            switch (a){
                case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("请输入姓名：");
                    String name = scanner.nextLine();
                    System.out.println("请输入出生日期：");
                    String birDate = scanner.nextLine();
                    System.out.println("请输入性别：");
                    boolean gender = (scanner.nextLine().equals("男"))?true:false;
                    addStudent(ID,name,birDate,gender);
                    break;
                case "2":
                    System.out.println("请输入查找人的姓名：");
                    String name1 = scanner.nextLine();
                    seek(name1);
                    break;
                case "3":
                    System.out.println("请输入被删除人的姓名：");
                    String name2 = scanner.nextLine();
                    delete(name2);
                    break;
                case "4":
                    System.out.println("请输入被修改人的姓名：");
                    String name3 = scanner.nextLine();
                    change(name3);
                    break;
                case "5":
                    printAll();
                    break;
                case "6":
                    tuichu();
                    break;
                case "7":
                    xianshi(arrayList);
                    break;
            }
        }
    }//界面
    public static void main(String[] args) {

    App();


  }
}
