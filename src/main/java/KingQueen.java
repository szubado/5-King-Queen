import java.util.*;
//http://www.codeabbey.com/index/task_view/king-and-queen
public class KingQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> legenda = new HashMap<>();
        legenda.put('a', 1);
        legenda.put('b', 2);
        legenda.put('c', 3);
        legenda.put('d', 4);
        legenda.put('e', 5);
        legenda.put('f', 6);
        legenda.put('g', 7);
        legenda.put('h', 8);
        int liczbaWierszy = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < liczbaWierszy; i++) {
            String[] ruchy = scanner.nextLine().split(" ");
            char literaKrola = ruchy[0].charAt(0);
            char literaKrolowej = ruchy[1].charAt(0);
            int liczbaKrola = ruchy[0].charAt(1) - '0';
            int liczbaKrolowej = ruchy[1].charAt(1) - '0';
            if (literaKrola == literaKrolowej || liczbaKrolowej == liczbaKrola
                    || Math.abs(liczbaKrola - liczbaKrolowej) ==
                    Math.abs(legenda.get(literaKrolowej) - legenda.get(literaKrola))) {
                System.out.print("Y ");
            }
            else {
                System.out.print("N ");
            }
        }
    }
}
