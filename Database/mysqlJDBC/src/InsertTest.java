import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	Connection conn = null;
	PreparedStatement ps = null;

	public InsertTest() {
		// TODO Auto-generated constructor stub
	}
	public void empInsert() {
		// �����ȣ, �̸�, �޿�, �Ի����� ���ڵ� �߰��ϱ�
		try {
			// 1. ����̺� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "1234");
			
			// 3. prepareStatement ��ü ���� : ������ �̿��Ͽ�
			// �����ȣ : 5555, �̸� : kim, �޿� : 4500, �Ի��� : ���� ��¥�� �ð����� ����
			String sql = "insert into emp(empno, ename, sal, hiredate) values(?,?,?,now())";
			ps = conn.prepareStatement(sql);
			
			// ?�� �� ����
			ps.setInt(1, 1111);
			ps.setString(2, "lee");
			ps.setInt(3, 3500);
			
			// 4. ����
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("���ڵ尡 �߰� �Ǿ����ϴ�.");
			} else {
				System.out.println("���ڵ��߰� �����Ͽ����ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(conn != null) conn.close();
			} catch (Exception e2) { e2.printStackTrace(); }
			
		}
	}

	public static void main(String[] args) {
		new InsertTest().empInsert();
	}

}