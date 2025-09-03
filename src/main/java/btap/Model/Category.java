package btap.Model;
import java.sql.Date;
public class Category {
	private int id;
    private String name;
    private int userId;
    private Date createdDate;

    public Category() {}

    public Category(int id, String name, int userId, Date createdDate) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.createdDate = createdDate;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public Date getCreatedDate() { return createdDate; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }
}
