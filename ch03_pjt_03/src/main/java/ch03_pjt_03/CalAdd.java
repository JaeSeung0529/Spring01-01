package ch03_pjt_03;

public class CalAdd implements ICalculator{
	public CalAdd() {
		System.out.println("CalAdd기본 생성자 호출됨");
	}//Default Constructor
	
	@Override
	public int doOperation(int firstNum, int secondNum){
		
		int sum = firstNum + secondNum;
		return sum;
	}
}
