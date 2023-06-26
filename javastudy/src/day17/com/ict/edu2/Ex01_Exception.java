package day17.com.ict.edu2;

//	예외처리	:	try ~ catch ~ catch2 ~ finally
//		목적	: 	비정상적인 종료를 정상적인 종료로 유도하고,
//				예외 발생 시 예외에 대한 처리를 해준다
//		형식	: 	try	{
//					예외 발생 가능한 문장들;				
//					예외 발생 가능한 문장들;
//					예외가 발생 되면 아래 문장들을 무시하고, catch 문으로 이동한다.
//					예외 발생 가능한 문장들;
//				} catch (발생한 예외객체 e) {
//					예외 발생 시 처리하는 문장;
//				}

public class Ex01_Exception {

		public static void main(String[] args) {
			try {
				int[] var = {10,20,30};
				for (int i = 0; i <= var.length; i++) {
					System.out.println(1);
					System.out.println(2);
					System.out.println("var["+i+"] = "+var[i]);
					System.out.println(3);
					System.out.println(4);
				}
				
			} catch (Exception e) {
				System.out.println("수고용");
//				break;
			} finally {
				System.out.println(3);
				System.out.println(4);
			}
			
			
			
			
			
//			int num = 1 ;
//			try {
//				System.out.println(num.length()+1);
//			}catch (Exception e){
//				System.out.println("Hello World");
//				break;
//			}
//			finally {
//				System.out.println("FINALY");
//			}
		}
}
