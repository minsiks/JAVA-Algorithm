package frame;

public class Sql {
	public static String insertAnimal = "INSERT INTO ANIMAL VALUES(?,?,?)";
	public static String deleteAnimal = "DELETE FROM ANIMAL WHERE id = ?";
	public static String updateAnimal = "UPDATE ANIMAL SET species=?, age=? WHERE id = ?";
	public static String selectAnimal = "SELECT *FROM ANIMAL WHERE id =?";
	public static String selectAllAnimal = "SELECT * FROM ANIMAL";
}
