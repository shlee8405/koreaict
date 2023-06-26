package day02.com.ict.edu;
class Ex05 {
	public static void main(String[] args){
		
		/*scores*/
		int kor = 90 ;
		int eng = 80 ;
		int math = 80 ;
		
		/*����*/
		double sum;
		sum = kor + eng + math ;
		/*���*/
		
		double avg = sum / 3.0 ;
		avg *= 100.0;
		double intAvg = (int) avg;
		intAvg= intAvg / 100;
		
		double intAvg2 = ((int)avg / 100.0);

		System.out.println(intAvg2); 
		
		double avg5 = sum/3.0;
		double avg6 = (int)(avg5 *100) / 100.0;

		System.out.println(avg6);


		int num = 1472;
		int newNum = num;
		newNum = newNum/10;
		newNum = newNum*10;

		System.out.println("input is "+ num);
		System.out.println("output is "+newNum);
		
	}
}