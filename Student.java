package homework;

public class Student implements Comparable<Object>{
	private int ID=100000000;
	private String name;
	private String birDay;
	private Boolean gender;

//	public Student(int ID,String name,String birDay,Boolean gender) {
//		this.ID=ID;
//		this.name = name;
//		this.birDay = birDay;
//		this.gender=gender;
//	}
	
	public void setID(int id) {
		ID=id;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBirDay(String birday) {
		this.birDay=birday;
	}
	
	public String getBirDay() {
		return birDay;
	}
	
	public void setGender(Boolean gender) {
		this.gender=gender;
	}
	
	public Boolean getGender() {
		return gender;
	}
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			if (this.ID > s.ID) {
				return 1;
			} else if (this.ID == s.ID) {
				return 0;
			} else {
				return -1;
			}
		}
		return 0;

	}
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name +",birDay="+ birDay + ",gender=" + gender + "]";
	}
}
