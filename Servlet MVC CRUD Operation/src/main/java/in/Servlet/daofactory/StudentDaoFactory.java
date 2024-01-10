package in.Servlet.daofactory;

import in.Servlet.dao.IStudentDao;
import in.Servlet.dao.StudentDaoImpl;
public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
