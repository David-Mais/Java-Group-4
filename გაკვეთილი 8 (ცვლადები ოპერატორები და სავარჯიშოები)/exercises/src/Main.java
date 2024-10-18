public class Main {
    public static void main(String[] args) {
        // celsius -> fahrenheit
        // celsius x 1.8 + 32
        int celsius = 28;
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);

        // გამითვალეთ წრეწირის ფართობი
        // ფართობი = პი გამრავლებული რადიუსის კვადრატზე
        int radius = 6;
        double area = Math.PI * radius * radius;
        System.out.println(area);

        // ორ ცვლადს გაუცვალეთ ადგილი მესამე ცვლადის დახმარებით
        // თავიდან a = 5 b = 17 შემდეგ a = 17 b = 5
        int a = 5;
        int b = 17;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // დაადგინეთ რიცხვი კენტია თუ ლუწი
        int number = 8;
        if (number % 2 == 0) {
            System.out.println("ლუწია");
        } else {
            System.out.println("კენტია");
        }

        // რიცხვი დადებითია, ნული თუ უარყოფითი
        int someNum = 0;
        if (someNum > 0) {
            System.out.println("დადებითია");
        } else if (someNum == 0) {
            System.out.println("ნულია");
        } else {
            System.out.println("უარყოფითია");
        }

        // გამოითვალეთ BMI
        // მასა კილოგრამებში, სიმაღლე მეტრებში
        // bmi = მასა გაყოფილი სიმაღლის კვადრატზე
        // ნაკლებია 18.5 ზედმეტად გამხდარი
        // ნაკლებია 25 ნორმალური წონა
        // ნაკლებია 30 ჭარბი წონა
        // ზედმეტად ჭარბი წონა
        double weight = 70;
        double height = 1.83;
        double bmi = weight / (height * height);

        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal weight");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }

        // სამკუთხედის უტოლობა?
        // სამკუთხედი იგება მაშინ თუ ყოველი გვერდი
        // დანარჩენი ორის ჯამზე ნაკლებია
        // გამოიყენეთ მხოლოდ 1 if
        int side1 = 5;
        int side2 = 7;
        int side3 = 30;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("სამკუთხედი აიგება");
        } else {
            System.out.println("სამკუთხედი არ აიგება");
        }

        // დაადგინეთ ადამიანს ეკუთვნის თუ არა ფასდაკლება
        // ან 60 წლის ან მეტის
        // ან შეძენილი აქვს 2000 ლარზე მეტი პროდუქტი
        // გამოიყენეთ მხოლოდ 1 if
        int age = 43;
        double total = 9998.56;

        if (age > 60 || total > 2000) {
            System.out.println("ეკუთვნის ფასდაკლება");
        } else {
            System.out.println("არ ეკუთვნის ფასდაკლება");
        }

        // გაქვთ ოპერაციის char (+, -, *, /, %)
        // გაქვთ 2 რიცხვი
        // შეასრულეთ ამ ორ რიცხვზე მოცემული ოპერაცია
        char operation = '+';
        double num1 = 9.4;
        double num2 = 8.7;

    }
}