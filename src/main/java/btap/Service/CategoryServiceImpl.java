package btap.Service;
import java.util.List;
import btap.DAO.CategoryDao;
import btap.Model.Category;
public class CategoryServiceImpl implements CategoryService {
	private CategoryDao dao = new CategoryDao();

    @Override
    public void insert(Category c) { dao.insert(c); }

    @Override
    public void update(Category c) { dao.update(c); }

    @Override
    public void delete(int id) { dao.delete(id); }

    @Override
    public Category findById(int id) { return dao.findById(id); }

    @Override
    public List<Category> findAll() { return dao.findAll(); }
}
