package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/halloween-sale/forum">problem</a>
 * @since 2018-12-26
 */

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int games=0;
        while(s>=0){
            s -= p;
            games++;
            if(p != m)
                p = ((p-d) <= m) ? m : (p-d);
        }
        return games - 1;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 85));
    }

}
