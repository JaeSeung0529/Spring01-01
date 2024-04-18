package ch04_pjt_01.ems.member;

public class Student {

	
		private String sNum; //학번
		   private String sId; //아이디
		   private String sPw; //비밀번호
		   private String sName; //학생이름
		   private int sAge; //학생나이
		   private char sGender; //학생성별
		   private String sMajor; 
		   
		   
		   
		   public Student() {}

		   public Student(String sNum, String sId, String sPw, 
		         String sName, int sAge, 
		         char sGender, String sMajor) {
		      this.sNum = sNum;
		      this.sId = sId;
		      this.sPw = sPw;
		      this.sName = sName;
		      this.sAge = sAge;
		      this.sGender = sGender;
		      this.sMajor = sMajor;
		   

		   }

		public String getsNum() {
			return sNum;
		}

		public void setsNum(String sNum) {
			this.sNum = sNum;
		}

		public String getsId() {
			return sId;
		}

		public void setsId(String sId) {
			this.sId = sId;
		}

		public String getsPw() {
			return sPw;
		}

		public void setsPw(String sPw) {
			this.sPw = sPw;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public int getsAge() {
			return sAge;
		}

		public void setsAge(int sAge) {
			this.sAge = sAge;
		}

		public char getsGender() {
			return sGender;
		}

		public void setsGender(char sGender) {
			this.sGender = sGender;
		}

		public String getsMajor() {
			return sMajor;
		}

		public void setsMajor(String sMajor) {
			this.sMajor = sMajor;
		}
	
		   
		   
}
