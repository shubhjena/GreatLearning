package Week16_Greedy;

import java.util.Arrays;

//2126. Destroying Asteroids
/*
You are given an integer mass, which represents the original mass of a planet.
You are further given an integer array asteroids, where asteroids[i] is the mass of the ith asteroid.
You can arrange for the planet to collide with the asteroids in any arbitrary order. If the mass of
the planet is greater than or equal to the mass of the asteroid, the asteroid is destroyed and the
planet gains the mass of the asteroid. Otherwise, the planet is destroyed.
Return true if all asteroids can be destroyed. Otherwise, return false.
 */
public class DestroyingAsteroids {
    public static boolean asteroidsDestroyed(long mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int asteroid : asteroids) {
            if(mass < asteroid)
                return false;
            mass+= asteroid;
        }
        return true;
    }

    public static void main(String[] args) {
        int mass= 10;
        int[] asteroids = new int[]{3,9,19,5,21};
        System.out.println("Is the planet safe? "+ asteroidsDestroyed(mass, asteroids));
    }
}
