package exam;

import java.util.List;

import dao.EmpDao;
import dto.Emp;

public class Example {
	public static void main(String[] args) {
		
		// GUI �̺�Ʈ ������
		EmpDao dao = new EmpDao();
		List<Emp> list = dao.getList();
		
		// SMITH��� ����� �����ϴ��� Ȯ�� �� 
		// ���α׷����� ó��
		boolean exist = false;
		for( Emp e : list ) {
			System.out.println(e);
			
			if( "SMITH".equals(e.getEname())) {
				exist = true; 
			}
		}
		
		Emp emp = new Emp();
		emp.setEname("SMITH");
		
		// SMITH��� ����� �����ϴ��� Ȯ�� �� 
		// ������ ó�� 
//		boolean result = dao.existEmp(emp);
//		"select count(*) from emp where ename=" + emp.getEname();
		
		List<Emp> list1 = dao.getList();
		for( Emp e : list1 ) {
			System.out.println(e);
		}
	}
}
