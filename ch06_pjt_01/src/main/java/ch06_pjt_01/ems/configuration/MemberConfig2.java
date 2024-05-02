package ch06_pjt_01.ems.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.DBConnectionInfo;
@Configuration
public class MemberConfig2 {
//	<bean id="dev_DBConnectionInfoDev"
//	class="ch06_pjt_01.ems.member.DBConnectionInfo">
//	<property name="url" value="000.000.000.000" />
//	<property name="userId" value="admin" />
//	<property name="userPw" value="0000" />
//</bean>
// 

	@Bean
	public static DBConnectionInfo dev_DBConnectionInfoDev() {
		
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
	public static DBConnectionInfo real_DBConnectionInfo() {
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("111.111.111.111");
		dbConnectionInfo.setUserId("master");
		dbConnectionInfo.setUserPw("1111");
		return dbConnectionInfo;
	}
}
