package com.hadley;

/*
2020.08.02
705、Design HashSet
 */
public class _705 {
    class MyHashSet {
        boolean temp[] = new boolean[1000001];
        /** Initialize your data structure here. */
        public MyHashSet() {
            for(int i = 0; i < 1000001; i++){
                temp[i] = false;
            }
        }

        public void add(int key) {
            temp[key] = true;
        }

        public void remove(int key) {
            temp[key] = false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return temp[key];
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
