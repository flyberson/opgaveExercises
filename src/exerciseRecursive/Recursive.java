/*
 * Martin Hilaire Apr 25, 2017
 * flyberson@gmail.com
 * Datamatiker studerende
 * Copyright (C) 2017 flyberson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exerciseRecursive;

/**
 *
 * @author flyberson
 */
public class Recursive {
    private static long factorial(int n){
       if(n==1){System.out.println(1);return 1;}
       long total =n*factorial (n-1);
        System.out.println(total);
        return total;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factorial(21);
                
    }
    
}
