package study;

public class study_instance_class { 
	long a, b; //�ν��Ͻ� ���� a, b���� �̿��� �۾��ϹǷ� �Ű������� �ʿ� ���� 
	long add() { return a+b; } //a, b�� �ν��Ͻ� ����
	//�ν��Ͻ� ������ ���� ���� �Ű����������� �۾��� �����ϴ� 
	static long add(long a, long b) { return a+b; } 
	//a, b�� ���� ���� 
}

class  MyMath{
	public static void main(String[] args) { 
		//Ŭ���� �޼��� ȣ��

		System.out.println(study_instance_class.add(200L, 100L)); 
		//300 
		
		//�ν��Ͻ� �޼���� ��ü ���� �Ŀ��� ȣ�� ���� 
		study_instance_class mm = new study_instance_class();
		mm.a = 200L; 
		mm.b = 100L; 
		System.out.println(mm.add()); 
		} 
}

