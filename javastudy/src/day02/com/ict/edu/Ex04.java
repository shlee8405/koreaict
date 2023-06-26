package day02.com.ict.edu;
class Ex04 {
	public static void main(String[] args){
	// �ڷ��� ��ȯ : ���θ�ǰ� ����
	// ���θ��: ���� �ڷ����� ū �ڷ������� ��ȯ(����)�ɶ� ���� ���� �ڵ����� ��ȯ(����)��
	// ����: ū �ڷ����� ���� �ڷ������� ��ȯ(����)�ɶ� ������ �߻���
	// 	������ �߻� �Ǿ��� �� ������ �ڷ����� �����ؼ� ������ ����������
	// 	���� �սǰ� �߻��� ���� �ִ�.

	byte b1 = 120 ;
	int su1 = b1 ;       	//<���θ�� Widening Casting
	System.out.println(su1) ;

	int su2 = 129 ;
	byte b2 = (byte) su2 ;	//<���� Narrowing Casting
	System.out.println(b2);

	char c1 = 'K';
	int su3 = c1;
	System.out.println(su3);

	int su4 = 75;
	char c2 = (char) su4;
	System.out.println(c2);
	}
}