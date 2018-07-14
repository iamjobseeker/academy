package dto;

import java.util.Date;

// Table의 컬럼명과 Class의 변수명을 통일시킨다
// 변수에 대한 getter, setter만 작성
// 추가 메소드는 작성하지 않는다 
// ( 테스트용 toString()만 포함 )
public class Emp {
	// 데이터 정의
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno; 
	// getter, setter 정의 
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String toString() {
		return "Emp (empno=" +empno
				+ ", ename=" + ename
				+ ", job=" + job
				+ ", mgr=" + mgr
				+ ", hiredate=" + hiredate
				+ ", sal=" + sal
				+", comm=" + comm
				+", deptno=" + deptno+")"; 
	}
	
}
