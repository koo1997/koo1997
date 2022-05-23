package tj4;

public class Dog extends An{
	int age;
	Dog(String kind,String color,int age){
		this.kind=kind;
		this.color=color;
		this.age=age;
	}
	void showAge() {
		System.out.println("강아지 나이:"+age);
	}

}
