import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setpId(001);
		b1.setpName("Harry Potter");
		b1.setpAuthor("syed");
		b1.setPrice(799);
		
		Book b2=new Book();
		b2.setpId(002);
		b2.setpName("SQL");
		b2.setpAuthor("sagar sir");
		b2.setPrice(599);
		
		Book b3=new Book();
		b3.setpId(003);
		b3.setpName("java programming");
		b3.setpAuthor("raghu sir");
		b3.setPrice(999);
		
		Book b4=new Book();
		b4.setpId(004);
		b4.setpName("core java");
		b4.setpAuthor("vivek sir");
		b4.setPrice(899);
		
		Student s1=new Student();
		s1.setUsn(032);
		s1.setName("syed");
		s1.setCourse("AI");
		
		Student s2=new Student();
		s2.setUsn(033);
		s2.setName("priyanshu");
		s2.setCourse("DS");
		
		Student s3=new Student();
		s3.setUsn(034);
		s3.setName("neha");
		s3.setCourse("CS");
		
		Student s4=new Student();
		s4.setUsn(035);
		s4.setName("kousar");
		s4.setCourse("EC");
		
		Student s5=new Student();
		s5.setUsn(036);
		s5.setName("maryam");
		s5.setCourse("CE");
		
		ArrayList<Book> bk=new ArrayList<Book>();
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		bk.add(b4);
		
		for(Book b:bk)
		{
			b.dispBook();
		}
		System.out.println();
		ArrayList<Student> st=new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		for(Student s:st)
		{
			s.dispStudent();
		}
		
	}

}
