package login;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users;

    public UserStorage() {
        users = new HashMap<>();

        users.put("admin", new User("admin", "admin"));
        users.put("john", new User("john", "doe"));
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.getOrDefault(username, null);
    }

    public void printUsers() {
        users.values()
                .forEach(System.out::println);
        System.out.println();
    }
}
