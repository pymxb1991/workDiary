class Dog{
	
	String name;
	/**属性**/
	//颜色
	String color;
	//体重
	double weight;
	//身高
	double height;
	
	/**行为**/
	
	public void  protectHome(){
		System.out.println(name + "正在看家");
	}
	
	public void sleep(){
		System.out.println(name + "正在睡觉");
	}
}

class TestDog{
	
	public static void main(String[] args){
			
		Dog dog = new Dog();  
		//new 这个Dog 的时候首先会在堆内存中开辟一个空间，同时还会把这个Dog加载到JVM ,
		//加载到JVM中之后，会把Dog的方法加载到方法区当中去
		dog.name="阿黄";
		dog.color = "黄色1";
		dog.weight =20.0;
		dog.height = 1.0;
		
		System.out.println("狗的颜色" + dog.color);
		System.out.println("狗的体重" +dog.weight);
		System.out.println("狗身高" +dog.height);
		
		Dog dog1 = new Dog();
		dog1.name="阿红";
		dog1.color = "红色";
		dog1.weight =30.0;
		dog1.height = 2.0;
		System.out.println("-----------dog1第一次打印-------------");
		System.out.println("狗的颜色" + dog1.color);
		System.out.println("狗的体重" +dog1.weight);
		System.out.println("狗身高"+ dog1.height);
		
		Dog dog2 = dog1;
		dog1.name="阿白";
		dog2.color = "白色";
		
		System.out.println("-----------dog2第一次打印-------------");
		System.out.println("狗的颜色" + dog2.color);
		System.out.println("狗的体重" +dog2.weight);
		System.out.println("狗身高"+ dog2.height);
		
		System.out.println("-----------dog1第二次打印-------------");
		System.out.println("狗的颜色" + dog1.color);
		System.out.println("狗的体重" +dog1.weight);
		System.out.println("狗身高"+ dog1.height);
		
		dog.protectHome();
		dog1.protectHome();
		dog2.protectHome();
		
		dog.sleep();
		dog1.sleep();
		dog2.sleep();
	}
	
}