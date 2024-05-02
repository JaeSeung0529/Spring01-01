package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.member.dao.StudentDao;
import ch06_pjt_01.ems.member.service.EMSInformationService;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

@Configuration
public class MemberConfig {
	
//	<bean id="initSampleData"
//			class="ch06_pjt_01.ems.utils.InitSampleData">
//			
//			<property name="sNums">
//				<array>
//					<value>hbs001</value>
//					<value>hbs002</value>
//					<value>hbs003</value>
//					<value>hbs004</value>
//					<value>hbs005</value>
//				</array>
//			</property>
//			<property name="sIds">
//				<array>
//					<value>rabbit</value>
//					<value>hippo</value>
//					<value>raccoon</value>
//					<value>elephant</value>
//					<value>lion</value>
//				</array>
//			</property>
//			<property name="sPws">
//				<array>
//					<value>p0001</value>
//					<value>p0002</value>
//					<value>p0003</value>
//					<value>p0004</value>
//					<value>p0005</value>
//				</array>
//			</property>
//			<property name="sNames">
//				<array>
//					<value>agatha</value>
//					<value>barbara</value>
//					<value>chris</value>
//					<value>doris</value>
//					<value>elva</value>
//				</array>
//			</property>
//			<property name="sAges">
//				<array>
//					<value>19</value>
//					<value>22</value>
//					<value>20</value>
//					<value>27</value>
//					<value>19</value>
//				</array>
//			</property>
//			<property name="sGenders">
//				<array>
//					<value>M</value>
//					<value>W</value>
//					<value>W</value>
//					<value>M</value>
//					<value>M</value>
//				</array>
//			</property>
//			<property name="sMajors">
//				<array>
//					<value>English</value>
//					<value>Korean</value>
//					<value>French</value>
//					<value>Philosophy</value>
//					<value>History</value>
//				</array>
//			</property>
//		</bean>
	
	@Bean
	   public InitSampleData initSampleData() {
	      
	      InitSampleData initSampleData = new InitSampleData();
	      
	      String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
	      initSampleData.setsNums(sNums);
	      
	      String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
	      initSampleData.setsIds(sIds);
	      
	      String[] sPws = {"p0001", "p0002", "p0003", "p0004", "p0005"};
	      initSampleData.setsPws(sPws);
	      
	      String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
	      initSampleData.setsNames(sNames);
	      
	      int[] sAges = {19, 22, 20, 27, 19};
	      initSampleData.setsAges(sAges);
	      
	      char[] sGenders = {'M', 'W', 'W', 'M', 'M'};
	      initSampleData.setsGenders(sGenders);
	      
	      String[] sMajors = {"English", "Korean", "French", "Philosophy", "History"};
	      initSampleData.setsMajors(sMajors);
	      
	      return initSampleData;
	      
	   }

//	<bean  id = "studentDao" 
//			class= "ch06_pjt_01.ems.member.dao.StudentDao" >
//		</bean>

	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}

//	<bean id="studentRegisterService"
//			class="ch06_pjt_01.ems.member.service.StudentRegisterService">
//			<constructor-arg ref="studentDao" />
//		</bean>

	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDao());
	}

//	<bean id="studentModifyService"
//			class="ch06_pjt_01.ems.member.service.StudentModifyService">
//			<constructor-arg ref="studentDao" />
//		</bean>

	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService(studentDao());
	}

//	<bean id="studentDeleteService"
//			class="ch06_pjt_01.ems.member.service.StudentDeleteService">
//			<constructor-arg ref="studentDao" />
//		</bean>

	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService(studentDao());
	}

//		<bean id="studentAllSelectService"
//		class="ch06_pjt_01.ems.member.service.StudentAllSelectService">
//		<constructor-arg ref="studentDao" />
//	</bean>

	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService(studentDao());
	}

//	<bean id="studentSelectService"
//	class="ch06_pjt_01.ems.member.service.StudentSelectService">
//	<constructor-arg ref="studentDao" />
//</bean>

	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDao());
	}

//<bean id="printStudentInformationService"
//class="ch06_pjt_01.ems.member.service.PrintStudentInformationService">
//<constructor-arg ref="studentAllSelectService" />
//</bean>

	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService(studentAllSelectService());

	}

//	<bean id="dev_DBConnectionInfoDev"
//	class="ch06_pjt_01.ems.member.DBConnectionInfo">
//	<property name="url" value="000.000.000.000" />
//	<property name="userId" value="admin" />
//	<property name="userPw" value="0000" />
//</bean>
//
	@Bean
	public DBConnectionInfo dev_DBConnectionInfo() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("000.000.000.000.000");
		dbConnectionInfo.setUserId("admin");
		dbConnectionInfo.setUserPw("0000");
		return dbConnectionInfo;
	}

//	<bean id="real_DBConnectionInfo"
//			class="ch06_pjt_01.ems.member.DBConnectionInfo">
//			<property name="url" value="111.111.111.111" />
//			<property name="userId" value="master" />
//			<property name="userPw" value="1111" />
//		</bean>
	@Bean
	public DBConnectionInfo real_DBConnectionInfo() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("111.111.111.111");
		dbConnectionInfo.setUserId("master");
		dbConnectionInfo.setUserPw("1111");
		return dbConnectionInfo;
	}

//	<bean  id="eMSInformationService" 
//			class="ch06_pjt_01.ems.member.service.EMSInformationService">
//				<!-- 
//				<property name="info">
//					<value>"Education Management System program was developed in 2022." 
//					</value>
//				</property>
//				 -->
//				 <property name="info"
//					value="Education Management System program was developed in 2022." />
//				
//				 <property name="copyRight"
//					value="COPYRIGHT(C) 2022 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION." />
//				<property name="ver" value="The version is 1.0" />
//				<property name="sYear" value="2022" />
//				<property name="sMonth" value="3" />
//				<property name="sDay" value="1" />
//				<property name="eYear" value="2022" />
//				<property name="eMonth" value="4" />
//				<property name="eDay" value="30" />
	@Bean
	public EMSInformationService eMSInformationService() {
		EMSInformationService obems = new EMSInformationService();
		obems.setInfo("Education Management System program was developed in 2022.");
		obems.setCopyRight("COPYRIGHT(C) 2022 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		obems.setVer("The version is 1.0");
		obems.setsYear(2022);
		obems.setsMonth(3);
		obems.setsDay(1);
		obems.seteYear(2022);
		obems.seteMonth(4);
		obems.seteDay(30);

//		<property name="developers" >
//		<list>
//			<value>Cheney.</value>
//			<value>Eloy.</value>
//			<value>Jasper.</value>
//			<value>Dillon.</value>
//			<value>Kian.</value>
//		</list>
		// </property>

		List<String> developers = new ArrayList<>();
//		List<String> developers = new ArrayList<String>();

		developers.add("Cheney.");
		developers.add("Eloy.");
		developers.add("Jasper.");
		developers.add("Dillon.");
		developers.add("Kian.");

		obems.setDevelopers(developers);

//		<property name="administrators">
//		<map>
//			<entry>
//				<key>
//					<value>Cheney</value>
//				</key>
//				<value>cheney@springPjt.org</value>
//			</entry>
//			<entry>
//				<key>
//					<value>Jasper</value>
//				</key>
//				<value>jasper@springPjt.org</value>
//			</entry>
//		</map>
//	</property>

		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("Cheney", "cheney@springPjt.org");
		administrators.put("Jasper", "jasper@springPjt.org");

		obems.setAdministrators(administrators);

//		<property name="dbInfos">
//		<map>
//			<entry>
//				<key>
//					<value>dev</value>
//				</key>
//				<ref bean="dev_DBConnectionInfoDev" />	<!-- 개발용 데이터베이스 지정 -->
//			</entry>
//			<entry>
//				<key>
//					<value>real</value>
//				</key>
//				<ref bean="real_DBConnectionInfo" />	<!--실제 서비스 데이터베이스 지정-->
//			</entry>
//		</map>
		// </property>

		Map<String, DBConnectionInfo> dbInfos = new HashMap<String, DBConnectionInfo>();
		dbInfos.put("dev", dev_DBConnectionInfo());
		dbInfos.put("real", real_DBConnectionInfo());

		obems.setDbInfos(dbInfos);

		return obems;
	}

}
