package day02.com.ict.edu;
class Ex03 {
  public static void main(String[] args){
    //����: �Ҽ����� ���� ����
    //�Ǽ�: �Ҽ����� �ִ� ����    �Ǽ� > ����. float > int. always

    //������ �ڷ� int data types

    long su4 = 125L;
    System.out.println(su4);

    // ���� �ڷ����� ū �ڷ����� ����ϸ� ����� ū �ڷ������� ����ȴ�.
    // ���� �ڷ����� ū �ڷ����� ������ �� �ִ�.

    char c1 = 'A' ;
    int su6 = c1 ;
    System.out.println(su6);

    int su8 = 97;
    char su7 = (char) c1;
    System.out.println(su7);

    String str = "ABCDEFG";
    int num = 5;
    System.out.println(str.indexOf("C"));

    float su9 = 12.2F ; 
    System.out.println(su9);


    char char01 = 'a';
    double double01 = 5D;
    int int01 = 1;

    System.out.println("character is '" +char01+"'");
    System.out.println("float is "+ double01);
    System.out.println("integer is "+int01);

    double01 = char01;
    System.out.println(double01);
    double01 = int01;

    System.out.println(double01);





  }
}
