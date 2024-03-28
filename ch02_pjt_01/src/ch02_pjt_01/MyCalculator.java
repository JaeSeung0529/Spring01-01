package ch02_pjt_01;

public class MyCalculator {
	public MyCalculator() {}
	
	
	public void calAdd(int fNum, int sNum)
	
	{
		ICalculator cal = new CalAdd();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result=" + value);
	}
	

	public void calSub(int fNum, int sNum)
	
	{
		ICalculator cal = new CalSub();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result=" + value);
	}
	
	public void calMul(int fNum, int sNum) {
        ICalculator calculator = new CalMul();          // CalMul 객체 생성
        int value = calculator.doOperation(fNum, sNum); // 곱셈 실행
        System.out.println("result : " + value);
    }
    
    public void calDiv(int fNum, int sNum) {
        ICalculator calculator = new CalDiv();          // CalDiv 객체 생성
        int value = calculator.doOperation(fNum, sNum); // 나눗셈 실행
        System.out.println("result : " + value);
    }
	
}
