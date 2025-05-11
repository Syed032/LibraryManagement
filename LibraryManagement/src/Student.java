
public class Student {
	
	private int usn;
	private String name;
	private String course;
	
	
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void dispStudent() 
	{
		System.out.println("Student-USN"+usn+" "+"Student-Name"+name+" "+"Student-Course"+course);
		
	}
	
	

}
