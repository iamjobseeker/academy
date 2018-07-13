package exam;

import java.util.List;

import dao.EmpDao;
import dto.Emp;

public class Example {
	public static void main(String[] args) {
		
		// GUI 이벤트 리스너
		EmpDao dao = new EmpDao();
		List<Emp> list = dao.getList();
		
		// SMITH라는 사람이 존재하는지 확인 중 
		// 프로그램으로 처리
		boolean exist = false;
		for( Emp e : list ) {
			System.out.println(e);
			
			if( "SMITH".equals(e.getEname())) {
				exist = true; 
			}
		}
		
		Emp emp = new Emp();
		emp.setEname("SMITH");
		
		// SMITH라는 사람이 존재하는지 확인 중 
		// 쿼리로 처리 
//		boolean result = dao.existEmp(emp);
//		"select count(*) from emp where ename=" + emp.getEname();
		
		List<Emp> list1 = dao.getList();
		for( Emp e : list1 ) {
			System.out.println(e);
		}
	}
}
