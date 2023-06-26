package mybatis.com.ict.edu;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBService {
//	MyBatis 를 사용하기 위해서 SQLSession 클래스가 필요하고
//	SqlSessionFactory클래스ㅜ를 가지고 SqlSession 클래스를 만든다
	
	private static SqlSessionFactory factory;	
//	config.xml 파일 위치
	static String resource = "mybatis/com/ict/edu/config.xml";

//	static 초기화
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
		}
	}

	public static SqlSessionFactory getFactory() {
		return factory;
	}

	public static void setFactory(SqlSessionFactory factory) {
		DBService.factory = factory;
	}

	public static String getResource() {
		return resource;
	}

	public static void setResource(String resource) {
		DBService.resource = resource;
	}
	
	
}
