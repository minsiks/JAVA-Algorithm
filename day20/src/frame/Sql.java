package frame;

public class Sql {
	public static String insertCust = "INSERT INTO CUST VALUES(?,?,?,?,?,?)";
	public static String deleteCust = "DELETE FROM CUST WHERE custid = ?";
	public static String updateCust = "UPDATE CUST SET regdate= ?, pwd= ?, age= ?, favno= ?, tlistno= ? WHERE custid = ?";
	public static String selectCust = "SELECT *FROM CUST WHERE custid =?";
	public static String selectAllCust = "SELECT * FROM CUST";
	
}
