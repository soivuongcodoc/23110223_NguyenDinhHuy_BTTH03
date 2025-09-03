package btap.DAO;
import java.sql.*;
import java.util.*;
import btap.Model.Category;
import btap.connection.DBconnection;

public class CategoryDao {
	   public List<Category> findAll() {
	        List<Category> list = new ArrayList<>();
	        String sql = "SELECT * FROM Category";
	        try (Connection conn = new DBconnection().getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql);
	             ResultSet rs = ps.executeQuery()) {
	            while (rs.next()) {
	                Category c = new Category(
	                    rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getInt("user_id"),
	                    rs.getDate("createdDate")
	                );
	                list.add(c);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return list;
	    }

	    public void insert(Category c) {
	        String sql = "INSERT INTO Category(name, user_id) VALUES(?, ?)";
	        try (Connection conn = new DBconnection().getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setString(1, c.getName());
	            ps.setInt(2, c.getUserId());
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void update(Category c) {
	        String sql = "UPDATE Category SET name=? WHERE id=?";
	        try (Connection conn = new DBconnection().getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setString(1, c.getName());
	            ps.setInt(2, c.getId());
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void delete(int id) {
	        String sql = "DELETE FROM Category WHERE id=?";
	        try (Connection conn = new DBconnection().getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setInt(1, id);
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public Category findById(int id) {
	        String sql = "SELECT * FROM Category WHERE id=?";
	        try (Connection conn = new DBconnection().getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setInt(1, id);
	            try (ResultSet rs = ps.executeQuery()) {
	                if (rs.next()) {
	                    return new Category(
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getInt("user_id"),
	                        rs.getDate("createdDate")
	                    );
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
