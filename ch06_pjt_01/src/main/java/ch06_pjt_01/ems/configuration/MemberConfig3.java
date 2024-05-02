package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.member.service.EMSInformationService;

@Configuration
public class MemberConfig3 {
//	<bean  id="eMSInformationService" 
//	class="ch06_pjt_01.ems.member.service.EMSInformationService">
//		<!-- 
//		<property name="info">
//			<value>"Education Management System program was developed in 2022." 
//			</value>
//		</property>
//		 -->
//		 <property name="info"
//			value="Education Management System program was developed in 2022." />
//		
//		 <property name="copyRight"
//			value="COPYRIGHT(C) 2022 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION." />
//		<property name="ver" value="The version is 1.0" />
//		<property name="sYear" value="2022" />
//		<property name="sMonth" value="3" />
//		<property name="sDay" value="1" />
//		<property name="eYear" value="2022" />
//		<property name="eMonth" value="4" />
//		<property name="eDay" value="30" />
	@Autowired
	DBConnectionInfo dev_DBConnectionInfoDev;
	@Autowired
	DBConnectionInfo real_DBConnectionInfo;
	
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

//<property name="developers" >
//<list>
//	<value>Cheney.</value>
//	<value>Eloy.</value>
//	<value>Jasper.</value>
//	<value>Dillon.</value>
//	<value>Kian.</value>
//</list>
// </property>

		List<String> developers = new ArrayList<>();
//List<String> developers = new ArrayList<String>();

		developers.add("Cheney.");
		developers.add("Eloy.");
		developers.add("Jasper.");
		developers.add("Dillon.");
		developers.add("Kian.");

		obems.setDevelopers(developers);

//<property name="administrators">
//<map>
//	<entry>
//		<key>
//			<value>Cheney</value>
//		</key>
//		<value>cheney@springPjt.org</value>
//	</entry>
//	<entry>
//		<key>
//			<value>Jasper</value>
//		</key>
//		<value>jasper@springPjt.org</value>
//	</entry>
//</map>
//</property>

		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("Cheney", "cheney@springPjt.org");
		administrators.put("Jasper", "jasper@springPjt.org");

		obems.setAdministrators(administrators);

//<property name="dbInfos">
//<map>
//	<entry>
//		<key>
//			<value>dev</value>
//		</key>
//		<ref bean="dev_DBConnectionInfoDev" />	<!-- 개발용 데이터베이스 지정 -->
//	</entry>
//	<entry>
//		<key>
//			<value>real</value>
//		</key>
//		<ref bean="real_DBConnectionInfo" />	<!--실제 서비스 데이터베이스 지정-->
//	</entry>
//</map>
// </property>

		Map<String, DBConnectionInfo> dbInfos = new HashMap<String, DBConnectionInfo>();
		dbInfos.put("dev", dev_DBConnectionInfoDev);
		dbInfos.put("real",real_DBConnectionInfo);

		obems.setDbInfos(dbInfos);

		return obems;
	}
}
