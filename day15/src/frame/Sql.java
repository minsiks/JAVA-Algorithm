package frame;

public class Sql {
	public static String insertAnimal = "INSERT INTO ANIMAL VALUES(?,?,?)";
	public static String deleteAnimal = "DELETE FROM ANIMAL WHERE id = ?";
	public static String updateAnimal = "UPDATE ANIMAL SET species=?, age=? WHERE id = ?";
	public static String selectAnimal = "SELECT *FROM ANIMAL WHERE id =?";
	public static String selectAllAnimal = "SELECT * FROM ANIMAL";
	
	public static String insertEmployee = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
	public static String deleteEmployee = "DELETE FROM EMPLOYEE WHERE id = ?";
	public static String updateEmployee = "UPDATE EMPLOYEE SET name= ?, caringanimal= ? WHERE id = ?";
	public static String selectEmployee = "SELECT *FROM EMPLOYEE WHERE id =?";
	public static String selectAllEmployee = "SELECT * FROM EMPLOYEE";
}
