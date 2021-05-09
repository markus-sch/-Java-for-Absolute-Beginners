public class ForEachLoop {
    public static void main(String[] args) {
        String[] celebrities = {"Bruno Mars", "Taylor Swift", "Max Smith", "Eminem"};
        for (String name:celebrities){
            System.out.print(name);        // print statt println bewirkt, dass kein Zeilenvorschub nach dem Pribt gemacht wird.
            System.out.print(", ");
        }
        System.out.print("\n");            // Erzeugen einer Leerzeile nach dem letzten Element des ersten Arrays

        int[] age = {20, 22, 24, 43};
        for (int x:age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
