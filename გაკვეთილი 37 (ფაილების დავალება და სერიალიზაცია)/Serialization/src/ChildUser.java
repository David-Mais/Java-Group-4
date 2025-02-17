import javax.swing.text.AsyncBoxView;

public class ChildUser extends User {
    boolean canViewEverything = false;

    public ChildUser(String name, String password, boolean canViewEverything) {
        super(name, password);
        this.canViewEverything = canViewEverything;
    }

    @Override
    public String toString() {
        return "ChildUser{" +
                "canViewEverything=" + canViewEverything +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
