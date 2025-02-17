import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Savarjisho1 {
    public static void main(String[] args) {
        String[] lines = {
                "შიგან ასრე გავერივე, გნოლის ჯორსა ვითა ქორი,",
                "კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;",
                "კაცი ჩემგან განატყორცი, ბრუნავს ვითა ტანაჯორი,",
                "ერთობ სულად ამოვწყვიდე წინა კერძო რაზმი ორი."
        };

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("src/files/vefxi.txt")
                )
        ) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("ფაილში ჩაწერა წარმატებით შესრულდა!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}