package btap.Service;
import java.util.List;
import btap.Model.Category;
public interface CategoryService {
	   void insert(Category c);
	    void update(Category c);
	    void delete(int id);
	    Category findById(int id);
	    List<Category> findAll();
}
