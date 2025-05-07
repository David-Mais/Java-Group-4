import java.util.List;

public interface UserDao {
    User createUser(User user);
    List<User> findAll();
    User findById(int id);
    User update(User user);
    void deleteById(int id);
}
