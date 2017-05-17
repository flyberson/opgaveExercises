/*
 * Martin Hilaire Apr 26, 2017
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
package exerciseQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author flyberson
 */
public class queue {
Queue queue2;
    public queue() {
        queue2 = new PriorityQueue();
        
      
    }
    
    
    public void add(Object o){
        queue2.add(o);
    }
    
    public void remove(int i){
        queue2.remove(i);
    }
    
    /*public Object get(int i){
        return queue2.iterator(get(2));
    }*/
    
}
