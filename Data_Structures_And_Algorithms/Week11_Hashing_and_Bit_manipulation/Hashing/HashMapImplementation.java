package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        int n; //number of nodes
        int N; //number of buckets
        LinkedList<Node>[] buckets;
        @SuppressWarnings("unchecked") //to remove "unchecked" warning for the linked list
        HashMap(){
            this.N = 4;
            this.n = 0;
            this.buckets = new LinkedList[N];
            for(int i=0; i<N; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N; //make bi +ve and make it in range of buckets
        }
        private int searchInBucket(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key)
                    return i; //data index in bucket
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            buckets  = new LinkedList[N*2];
            N *=2;
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i <oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key); //bucket index
            int di = searchInBucket(key,bi); //data index in bucket
            if (di ==-1){ //key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++; //
            }else{ //key already exists
                Node data = buckets[bi].get(di); //fetching the existing key
                data.value = value; //updating the value of the node
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key); //bucket index
            int di = searchInBucket(key,bi); //data index in bucket
            if (di ==-1){ //key doesn't exist
                return null;
            }else{ //key already exists
                Node data = buckets[bi].get(di); //fetching the existing key
                return data.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key); //bucket index
            int di = searchInBucket(key,bi); //data index in bucket
            return di != -1;
        }

        public V remove(K key){
            int bi = hashFunction(key); //bucket index
            int di = searchInBucket(key,bi); //data index in bucket
            if (di ==-1){ //key doesn't exist
                return null;
            }else{ //key already exists
                Node data = buckets[bi].remove(di); //fetching the existing key
                n--;
                return data.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> bucket : buckets) {
                for (Node node : bucket) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jaipur",30);
        map.put("Lucknow",33);
        map.put("Delhi",28);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println(map.containsKey("Jaipur"));
        System.out.println(map.remove("Jaipur"));
        System.out.println(map.containsKey("Jaipur"));
    }
}
