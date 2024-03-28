package ch03_pjt_03;

public class CalSub implements ICalculator{
	@Override
	public int doOperation(int firstNum, int secondNum){
		
		int res = firstNum - secondNum;
		return res;
}
}
