July 12


Session 6 continued:


1. Heap

Q2 Top K frequency words in an Dictionary(jjiowncioqnvoq)

	S1: Hashmap + Heap + Element 

	<key = word, value = frequency>

	Element(word, frequency)

	heap PriorityQueue<Element>
	class Element{
		String word;
		int frequency;
	}

	new comparator, return ele1.frequency - ele2.frequency
	return cell2.counter - cell1.counter.MaxHeap

	@Override
	int compare(Element ele1, Element ele2){

	}

	for(Key key: map.keySet()) --> for(int num: nums) array, list, set, collection
	for(Entry entry:map.entrySet())


	S2:  TreeMap<Element>
	
	S3: Distributed System Memory / Partition Input 

	S4: Big data, MapReduce

	Memory    100 GB      10GB/S

	SSD       500 GB      500MB/S -> 3000MB/S

	HardDisk  5 TB        50MB/S

	Internet              1 Gbit/s -> 125MB/S

	S5: Trie

2. HashMap / HashTable / HashSet

   HashTable 线程安全
   HashMap 线程不安全，手写mutex 

   why hashmap is more common?
   不用加锁  高效

   HashSet add(key) return boolean, if addable return true, if not addable return false


   JAVA 中  Set / Map 是 interface

   Set: HashSet <key> -> de duplicate -> set.contains(key), set.add(key), set.remove(key)


   Map: HashMap<key,value> -> de duplicate +1 :1 counter

   		map.containsKey(key)
   		map.get(key)
   		map.put(key,value)
   		map.remove(key)

   							  ----> O(1)


   HashMap -->  <key,Value>

   用Array实现的：

   	1. why you can get(Key) by O(1)
   	2. hash function hashcode
   		a b c % k   a b c / k ---> consistent hashing --> rehashing
   		0 1 2 3 4 5 6 7 8 9

   		O(1) 通过key得到一个稳定固定不会变的，无规律的unique， 介于 buckets - capacity -1 的映射

   		MD5 SHA-1 SH1-2

   	3. avoid collision -> load factor -> seperate chaining / open addressing

   	4. new array/buckets size n/0.75

   	String hashing
   	Abcde 

   	int hash(String key){
   		int sum = 0;
   		for (int i = 0l i < key.length(); i++){
   			sum = sum * 32 + (int)(key,charAt(i));
   			sum = sum % Hash_Map_Capacity
   		}
   		return sum;
   	}


   	Q1: same as Heap 
   	Q1.2: Top K frequency words in an Dictionary(shashibiyade zhu zuo)


   	Q2: L268 Missing Number

   	Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
   	find the one that is missing from the array.

	Example 1:

	Input: [3,0,1]
	Output: 2
	Example 2:

	Input: [9,6,4,2,3,5,7,0,1]
	Output: 8

	S1: Sort -> one pass -> check array[fast]-array[fast-1]==2, return fast/array[fast]-1

	S2: Sort -> one pass -> check value with index, 
							index can be implemented with counter initialize with 0 ;

	S3: Sort -> binary search, check index and value.

	S4: HashMap<key = value of element, value = count>
			two pass O(n)
			build hashmap + check with counter++

	S5: HashSet<key = value of element>

	unsorted 
		two pass O(n)
		2 pass, build hashset + check with counter++

	S6: Math

		res + sum = (0+n)*(n+1)/2


	S7: XOR



   	Q2.1 每个出现两次，有且只有一个出现一次
   	Q2.2 每个出现m次，有n个出现K次


	Q3: Given two array array1[n], array2[m], find the common elements.


	S1: Sort the array1 and array2

		1  3  5  8  8  8  10  11
					i
		2  4  7  8  8  9  11
					j

	Time O(nlogn + mlogm + m + n)
	Space O(1)


	S2: HashSet

	Step1: adda the whole array into hashset O(n)
	Step2: loop all elements from the other array, check duplicate O(m)

	Time O(m+n)
	Space O(n)


	S3:

	sorted -> binary search mlogn vs m+n -> m(1+n/m)



3. Graph:

	1. nodes edges
	2. connected / non-connected
	3. directed non-directed
	4. cycle
	5. weight
	6. degree


	class pair -> {
		GraphNode, Weight
	}

	class GraphNode{
		int value;
		ArrayList<Pair> neighbours;
		HashMap <GraphNode, Weght>;

		GraphNode(int x){
			value = x;
			neighbours = new ArrayList<GraphNode>();
		}
	}

	3 ways to represent graph:

	1. Matrix -> sparse Matrix / dense? Matrix

		1 2 3 4 5 6
	  1 0 1     1
	  2 1   1
	  3
	  4
	  5 1
	  6

	2. Adjacent list

	head

	1 -> 2 -> 5
	2 -> 1 -> 5 -> 3
	3
	4
	5
	6


	3. Modify node‘s data structure

	
