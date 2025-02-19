import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateManyPeople {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader("src/people.txt")
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                Human human = new Human(
                        info[0],
                        info[1],
                        Integer.parseInt(info[2])
                );
                humanList.add(human);
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        humanList
                .forEach(System.out::println);
        System.out.println(humanList.size());
    }
}
