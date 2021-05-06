public class Switch {
    public static void main(String[] args) {
        String grade = "B+";
        switch (grade) {
            case "A+":
                System.out.println("Great student");
                break;
            case "B-": case "B": case "B+":
                System.out.println("Geht so");
                break;
            default:
                System.out.println("Keine Ahnung");
        }
    }
}
