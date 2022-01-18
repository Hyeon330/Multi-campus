import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	
	private Connection conn = null;
	private PreparedStatement ps = null;

	public BookDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/book";
			String uid = "root";
			String upw = "1234";
			
			this.conn = DriverManager.getConnection(url, uid, upw);
			System.out.println("DB접속 성공.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB접속 실패.");
		}
	}

	public void insertBook(BookDTO bookDTO) {
		String sql = "insert into book (bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) "
					+ "values (?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, bookDTO.getBookNo());
			ps.setString(2, bookDTO.getBookTitle());
			ps.setString(3, bookDTO.getBookAuthor());
			ps.setInt(4, bookDTO.getBookYear());
			ps.setInt(5, bookDTO.getBookPrice());
			ps.setString(6, bookDTO.getBookPublisher());
			
			int result = ps.executeUpdate();
			if(result>0) {
				System.out.println("레코드가 추가되었습니다.");
			} else {
				System.out.println("실패하였습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectBook() {
		ResultSet rs = null;
		String sql = "select * from book";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			System.out.println();
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n","bookNo","bookTitle","bookAuthor","bookYear","bookPrice","bookPublisher");
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				String bookYear = rs.getString(4);
				int bookPrice = rs.getInt(5);
				String bookPublisher = rs.getString(6);
				System.out.printf("%s\t%s\t%s\t\t%s\t\t%s\t\t%s\n",bookNo,bookTitle,bookAuthor,bookYear,bookPrice,bookPublisher);
			}
		} catch (SQLException e) {
		} finally {
			if(rs!=null) {
				try { rs.close(); } catch (Exception e2) {}
			}
		}
	}
	
	// insert, select 메서드안쪽에 finally로 close()를 넣으면 쿼리를 작성할 때 마다
	// dao객체를 새로 생성해야 하기 때문에 close()메서드를 따로 만들어 줘서
	// 모든 과정이 끝나면 메인에서 close()메서드를 실행하는 방식으로 만들었습니다.
	public void close() {
        try {
        	if(ps != null) { ps.close(); }
        	if(conn != null) { conn.close(); }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
