package Week11_Hashing_and_Bit_manipulation.Hashing;
//706. Design HashMap
/*
Design a HashMap without using any built-in hash table libraries.
Implement the MyHashMap class:
MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap.
If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped,
or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map
contains the mapping for the key.
 */
public class MyHashMap {
    static class ListNode{
        int key;
        int value;
        ListNode next;
//        ListNode(){}
        ListNode(int key, int value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }
    ListNode[] map = new ListNode[1000];
    public MyHashMap() {
        for(int i=0; i<1000; i++)
            map[i] = new ListNode(-1, -1);
    }

    public void put(int key, int value) {
        ListNode curr = map[key%1000];
        while(curr.next!= null){
            if(curr.next.key ==key){
                curr.next.value = value;
                return;
            }
            else curr = curr.next;
        }
        ListNode temp = map[key%1000].next;
        map[key%1000].next = new ListNode(key, value);
        map[key%1000].next.next = temp;
    }

    public int get(int key) {
        ListNode curr = map[key%1000];
        while(curr.next!= null){
            if(curr.next.key ==key)
                return curr.next.value;
            else curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        ListNode curr = map[key%1000];
        while(curr.next!= null){
            if(curr.next.key ==key){
                curr.next = curr.next.next;
                break;
            }
            else
                curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2,2);
        map.remove(2);
        System.out.println(map.get(2));
    }
}
