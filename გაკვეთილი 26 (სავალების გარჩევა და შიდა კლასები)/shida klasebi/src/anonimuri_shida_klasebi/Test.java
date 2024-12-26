package anonimuri_shida_klasebi;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Animal cat = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Meow meow");
            }
        };
        cat.makeNoise();

        Tasty tasty = new Tasty(){
            @Override
            public void eat() {
                System.out.println("kljashdflkjsadhflksa");
            }
        };
        tasty.eat();
    }
}
