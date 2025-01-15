import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childList;

    public Santa(String name, String nickname, int age) {
        super(name, nickname, age);
        childList = new ArrayList<>();
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public void spreadJoy() {
        System.out.println("Santa spreads joy");
    }

    @Override
    public void singCarols() {
        System.out.println("Santa is sing carols");
    }

    @Override
    public void decorateTree() {
        System.out.println("Santa decorates tree");
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();
        for (Child child : childList) {
            if (child.getBehaviourScore() > 5) {
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }

    public void deliverGifts() {
        for (Child child : checkNaughtyOrNiceList()) {
            System.out.println("Santa delivers gifts to: " + child.getName());
        }
    }

    @Override
    public String toString() {
        return "Santa{" +
                "childList=" + childList +
                '}';
    }
}
