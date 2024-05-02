package ch06_pjt_01.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.dao.StudentDao;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;
@Configuration
public class MemberConfig1 {
//	<bean id="initSampleData"
//	class="ch06_pjt_01.ems.utils.InitSampleData">
//	
//	<property name="sNums">
//		<array>
//			<value>hbs001</value>
//			<value>hbs002</value>
//			<value>hbs003</value>
//			<value>hbs004</value>
//			<value>hbs005</value>
//		</array>
//	</property>
//	<property name="sIds">
//		<array>
//			<value>rabbit</value>
//			<value>hippo</value>
//			<value>raccoon</value>
//			<value>elephant</value>
//			<value>lion</value>
//		</array>
//	</property>
//	<property name="sPws">
//		<array>
//			<value>p0001</value>
//			<value>p0002</value>
//			<value>p0003</value>
//			<value>p0004</value>
//			<value>p0005</value>
//		</array>
//	</property>
//	<property name="sNames">
//		<array>
//			<value>agatha</value>
//			<value>barbara</value>
//			<value>chris</value>
//			<value>doris</value>
//			<value>elva</value>
//		</array>
//	</property>
//	<property name="sAges">
//		<array>
//			<value>19</value>
//			<value>22</value>
//			<value>20</value>
//			<value>27</value>
//			<value>19</value>
//		</array>
//	</property>
//	<property name="sGenders">
//		<array>
//			<value>M</value>
//			<value>W</value>
//			<value>W</value>
//			<value>M</value>
//			<value>M</value>
//		</array>
//	</property>
//	<property name="sMajors">
//		<array>
//			<value>English</value>
//			<value>Korean</value>
//			<value>French</value>
//			<value>Philosophy</value>
//			<value>History</value>
//		</array>
//	</property>
//</bean>

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

//<bean  id = "studentDao" 
//	class= "ch06_pjt_01.ems.member.dao.StudentDao" >
//</bean>

@Bean
public StudentDao studentDao() {
return new StudentDao();
}

//<bean id="studentRegisterService"
//	class="ch06_pjt_01.ems.member.service.StudentRegisterService">
//	<constructor-arg ref="studentDao" />
//</bean>

@Bean
public StudentRegisterService studentRegisterService() {
return new StudentRegisterService(studentDao());
}

//<bean id="studentModifyService"
//	class="ch06_pjt_01.ems.member.service.StudentModifyService">
//	<constructor-arg ref="studentDao" />
//</bean>

@Bean
public StudentModifyService studentModifyService() {
return new StudentModifyService(studentDao());
}

//<bean id="studentDeleteService"
//	class="ch06_pjt_01.ems.member.service.StudentDeleteService">
//	<constructor-arg ref="studentDao" />
//</bean>

@Bean
public StudentDeleteService studentDeleteService() {
return new StudentDeleteService(studentDao());
}

//<bean id="studentAllSelectService"
//class="ch06_pjt_01.ems.member.service.StudentAllSelectService">
//<constructor-arg ref="studentDao" />
//</bean>

@Bean
public StudentAllSelectService studentAllSelectService() {
return new StudentAllSelectService(studentDao());
}

//<bean id="studentSelectService"
//class="ch06_pjt_01.ems.member.service.StudentSelectService">
//<constructor-arg ref="studentDao" />
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

}
