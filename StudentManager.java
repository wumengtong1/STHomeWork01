package homework;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
//	private Boolean ready=true;
	
	//数组序号
	private int i=0;

	//定义数组
	Student stList[]=new Student[20];
	
//	public void setReady(Boolean ready) {
//		this.ready=ready;
//	}
	//初始化数组
	public void init() {
		for(int l=0;l<20;l++) {
			stList[l]=new Student();
		}
	}
	
	//显示界面
	@SuppressWarnings("resource")
	public void app() {
//		ready=false;
		Scanner x=new Scanner(System.in);
		System.out.println("请选择操作：");
		System.out.println("*********************************************************");
		System.out.println("*                         1.插入                        *");
		System.out.println("*                         2.查找                        *");
		System.out.println("*                         3.删除                        *");
		System.out.println("*                         4.修改                        *");
		System.out.println("*                         5.输出                        *");
		System.out.println("*                         6.退出                        *");
		System.out.println("*********************************************************");
		//选择操作
		switch(x.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				seek();
				break;
			case 3:
				delete();
				break;
			case 4:
				change();
				break;
			case 5:
				printAll();
				break;
			case 6:
				leave();
				break;
		}
	}
	//插入
	@SuppressWarnings("resource")
	public void insert() {
//		ready=true;
		if(i<20) {
			Student st = new Student();
			Scanner id=new Scanner(System.in);
			System.out.println("请输入学生学号：");
			st.setID(id.nextInt());
			Scanner name=new Scanner(System.in);
			System.out.println("请输入学生姓名：");
			st.setName(name.next());
			Scanner birDay=new Scanner(System.in);
			System.out.println("请输入学生生日：");
			st.setBirDay(birDay.next());
			Scanner gender=new Scanner(System.in);
			System.out.println("请输入学生性别：");
			st.setGender(gender.nextBoolean());
			stList[i]=st;
			i++;
			//数组排序（按ID大小）
			Arrays.sort(stList);
		}
		else {
			System.out.println("已经存满了！");
		}
		app();
	}
	//查找
	public void seek() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("请输入该学生学号：");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean have=true;
		for(int k=0;k<j;k++) {
			if(stList[k].getID()==st.getID()) {
				have=false;
				System.out.println("Student [ID=" + stList[k].getID() + ", name=" + stList[k].getName() +",=birDay"+ stList[k].getBirDay() + ",gender" + stList[k].getGender() + "]");
			}
		}
		if(have) {
			System.out.println("没有该学生信息");
		}
		Arrays.sort(stList);
		app();
	}
	//删除
	public void delete() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("请输入该学生学号：");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean have=true;
		for(int k=0;k<j;k++) {
			if(stList[k].getID()==st.getID()) {
				have=false;
				stList[k].setID(100000000);
				stList[k].setName(null);
				stList[k].setBirDay(null);
				stList[k].setGender(null);	
			}
		}
		if(have) {
			System.out.println("没有该学生信息");
		}
		Arrays.sort(stList);
		app();
	}
	//修改
	public void change() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("请输入该学生学号：");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean have=true;
		for(int k=0;k<j;k++) {
			if(stList[k].getID()==st.getID()) {
				have=false;
				Scanner id1=new Scanner(System.in);
				System.out.println("请输入学生学号：");
				stList[k].setID(id1.nextInt());
				Scanner name=new Scanner(System.in);
				System.out.println("请输入学生姓名：");
				stList[k].setName(name.next());
				Scanner birDay=new Scanner(System.in);
				System.out.println("请输入学生生日：");
				stList[k].setBirDay(birDay.next());
				Scanner gender=new Scanner(System.in);
				System.out.println("请输入学生性别：");
				stList[k].setGender(gender.nextBoolean());
			}
		}
		if(have) {
			System.out.println("没有该学生信息");
		}
		Arrays.sort(stList);
		app();
	}
	//输出所有学生信息
	public void printAll() {
//		ready=true;
		System.out.println(Arrays.toString(stList));
		app();
	}
	//退出
	public void leave() {
	}
}
