import java.util.List;

public interface UserDao {
    void createUser(User user);
    List<User> findAll();
    User findById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
