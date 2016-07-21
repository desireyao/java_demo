package main;

import java.util.HashMap;

/**
 * HashMap: 一般情况下，我们用的最多的是HashMap,在Map 中插入、删除和定位元素，HashMap 是最好的选择。
 * TreeMap: 但如果您要按自然顺序或自定义顺序遍历键，那么TreeMap会更好。
 * LinkedHashMap: 如果需要输出的顺序和输入的相同,那么用LinkedHashMap 可以实现,它还可以按读取顺序来排列.

   HashMap 是一个最常用的Map，它根据键的hashCode值存储数据，根据键可以直接获取它的值，具有很快的访问速度。
   HashMap 最多只允许一条记录的键为NULL，允许多条记录的值为NULL。
   HashMap 不支持线程同步，即任一时刻可以有多个线程同时写HashMap，可能会导致数据的不一致性。如果需要同步，
       可以用Collections的synchronizedMap 方法使 HashMap具有同步的能力。

   Hashtable与HashMap类似，不同的是：它不允许记录的键或者值为空；它支持线程的同步，
       即任一时刻只有一个线程能写Hashtable，因此也导致了Hashtable在写入时会比较慢。

   LinkedHashMap 保存了记录的插入顺序，在用 Iterator遍历 LinkedHashMap时，先得到的记录肯定是先插入的。

      在遍历的时候会比 HashMap慢 TreeMap能够把它保存的记录根据键排序，默认是按升序排序，也可以指定排序的比较器。
      当用 Iterator遍历 TreeMap时，得到的记录是排过序的。
 */


public class f {
	
	public static void main(String[] args) {
		
		HashMap<String, String> maps = new HashMap<String, String>();
		System.out.println(maps.get("kk"));
		
	}

}
