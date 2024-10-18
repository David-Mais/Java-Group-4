public class Main {
    public static void main(String[] args) {
        int celsius = 14;

        if (celsius >= 30) {
            System.out.println("ცხელააა");
        } else if (celsius >= 20) {
            System.out.println("ნორმალური ტემპერატურაა");
        } else {
            System.out.println("ცივა");
        }


        // switch
        int dayOfTheWeek = 90;
        switch (dayOfTheWeek) {
            default:
                System.out.println("ასეთი კვირის დღე არ არსებობს");
                break;
            case 1:
                System.out.println("ორშაბათი");
                break;
            case 2:
                System.out.println("სამშაბათი");
                break;
            case 3:
                System.out.println("ოთხშაბათი");
                break;
            case 4:
                System.out.println("ხუთშაბათი");
                break;
            case 5:
                System.out.println("პარასკევი");
                break;
            case 6:
                System.out.println("შაბათი");
                break;
            case 7:
                System.out.println("კვირა");
                break;
        }

        switch (dayOfTheWeek) {
            default:
                System.out.println("ასეთი კვირის დღე არ არსებობს");
            case 1:
                System.out.println("ორშაბათი");
            case 2:
                System.out.println("სამშაბათი");
            case 3:
                System.out.println("ოთხშაბათი");
            case 4:
                System.out.println("ხუთშაბათი");
            case 5:
                System.out.println("პარასკევი");
            case 6:
                System.out.println("შაბათი");
            case 7:
                System.out.println("კვირა");
        }

        System.out.println("დამთავრდა ყვველა switch");

        // ternary if
        int a = 10;
        int b = 10;

        String text = (a > b) ? "ა მეტია ბ-ზე" : (a == b) ? "ა უდრის ბ-ს" : "ბ მეტია ა-ზე";
        String someText = (a > b) ? "ა მეტია ბ-ზე" : "ბ მეტია ა-ზე";
        System.out.println(text);
    }
}