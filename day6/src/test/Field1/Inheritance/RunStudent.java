package test.Inheritance;

public class RunStudent {

	public static void main(String[] args) {

		Student stu1 = new Student();
		
		//Person
		stu1.name = "김윤서";
		stu1.weight = 50;
		stu1.height = 168;
		stu1.StuID = 1102;
		stu1.grade = 1;
		stu1.ban = 1;
		
		//Student
		stu1.sleep();
		stu1.wakeUP();
		stu1.walk();
		stu1.eat();
		stu1.study();
		stu1.play();
	}

}
