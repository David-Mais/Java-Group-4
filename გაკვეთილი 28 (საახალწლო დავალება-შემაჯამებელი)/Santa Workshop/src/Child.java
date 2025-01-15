import java.util.ArrayList;
import java.util.List;

public class Child {
    private String name;
    private int behaviourScore;
    private List<String> wishList;

    public Child(String name, int behaviourScore) {
        this.name = name;
        this.behaviourScore = behaviourScore;
        this.wishList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBehaviourScore() {
        return behaviourScore;
    }

    public void setBehaviourScore(int behaviourScore) {
        this.behaviourScore = behaviourScore;
    }

    public void addWish(String wish) {
        if (wishList.contains(wish)) {
            return;
        }
        wishList.add(wish);
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", behaviourScore=" + behaviourScore +
                ", wishList=" + wishList +
                '}';
    }
}
