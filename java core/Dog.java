class Dog{
	
	String name;
	/**����**/
	//��ɫ
	String color;
	//����
	double weight;
	//���
	double height;
	
	/**��Ϊ**/
	
	public void  protectHome(){
		System.out.println(name + "���ڿ���");
	}
	
	public void sleep(){
		System.out.println(name + "����˯��");
	}
}

class TestDog{
	
	public static void main(String[] args){
			
		Dog dog = new Dog();  
		//new ���Dog ��ʱ�����Ȼ��ڶ��ڴ��п���һ���ռ䣬ͬʱ��������Dog���ص�JVM ,
		//���ص�JVM��֮�󣬻��Dog�ķ������ص�����������ȥ
		dog.name="����";
		dog.color = "��ɫ1";
		dog.weight =20.0;
		dog.height = 1.0;
		
		System.out.println("������ɫ" + dog.color);
		System.out.println("��������" +dog.weight);
		System.out.println("�����" +dog.height);
		
		Dog dog1 = new Dog();
		dog1.name="����";
		dog1.color = "��ɫ";
		dog1.weight =30.0;
		dog1.height = 2.0;
		System.out.println("-----------dog1��һ�δ�ӡ-------------");
		System.out.println("������ɫ" + dog1.color);
		System.out.println("��������" +dog1.weight);
		System.out.println("�����"+ dog1.height);
		
		Dog dog2 = dog1;
		dog1.name="����";
		dog2.color = "��ɫ";
		
		System.out.println("-----------dog2��һ�δ�ӡ-------------");
		System.out.println("������ɫ" + dog2.color);
		System.out.println("��������" +dog2.weight);
		System.out.println("�����"+ dog2.height);
		
		System.out.println("-----------dog1�ڶ��δ�ӡ-------------");
		System.out.println("������ɫ" + dog1.color);
		System.out.println("��������" +dog1.weight);
		System.out.println("�����"+ dog1.height);
		
		dog.protectHome();
		dog1.protectHome();
		dog2.protectHome();
		
		dog.sleep();
		dog1.sleep();
		dog2.sleep();
	}
	
}