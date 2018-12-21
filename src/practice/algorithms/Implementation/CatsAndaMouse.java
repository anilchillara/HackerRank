package practice.algorithms.Implementation;

/**
 * @author Anil Kumar C
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/cats-and-a-mouse/problem">problem</a>
 * @since 2018-12-19
 */

public class CatsAndaMouse {
    static String catAndMouse(int x, int y, int z){
        if(Math.abs(z-y)<Math.abs(z-x)){
            return "Cat B";
        }else if(Math.abs(z-y)==Math.abs(z-x)){
            return "Mouse C";
        }else{
            return "Cat A";
        }
    }
    public static void main(String[] args) {
        System.out.println("Winner :: " + catAndMouse(1,2,3));
        System.out.println("Winner :: " + catAndMouse(1,3,2));
    }
}
