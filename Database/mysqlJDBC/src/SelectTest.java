import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public SelectTest() {
		
	}
	
	public static void start() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// JVM�� ��ġ�� jar������ Driver������ ��ġ�� �÷��ش�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB���� �������� �Է��� �ش�.
			String url = "jdbc:mysql://localhost:3306/demo"; // �� DB���
			String uid = "root";
			String upw = "1234";
			
			// ���� �������� �̿��Ͽ� DB�� �����Ѵ�.
			conn = DriverManager.getConnection(url, uid, upw);
			
			// ������ �ۼ�
			String sql = "select empno, ename, hiredate, sal from emp order by empno";
			
			// ������ ps������ ����
			ps = conn.prepareStatement(sql);
			
			// rs������ ������ �ش��ϴ� ���� ����
			rs = ps.executeQuery();
			
			System.out.printf("%5s%8s%16s%18s\n","empno","ename","hiredate","sal");
			while(rs.next()) { // �ʵ��� ù ��° ����� �����ϰ� ���� �࿡ ���� ������� ����
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				
				System.out.printf("%5d%8s%22s%12.2f\n",empno,ename,hiredate,sal);
			} 
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ���� �߻�");
		} finally { // DB ����
			try {
				if(rs!=null) {rs.close();}
				if(ps!=null) {ps.close();}
				if(conn!=null) {conn.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		start();
	}
}