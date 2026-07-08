package Test_3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Map<String, Integer> map = new TreeMap<>();
		 try {
	            BufferedReader b = new BufferedReader(new FileReader("D:\\words.txt"));
	            String line;
	            while ((line = b.readLine())!=null) {
	                String[] words = line.split(" ");
	                for(String w:words) {
	                    w = w.toLowerCase();
	                    if (map.containsKey(w)) {
	                        map.put(w,map.get(w) + 1);
	                    } else {
	                        map.put(w,1);
	                    }
	                }
	            }
	            b.close();
	            for (Map.Entry<String,Integer>entry:map.entrySet()) {
	                System.out.println(entry.getKey()+ " : "+entry.getValue());
	            }
	            System.out.println("Unique words are: " + map.size());
	        } 
		 catch (FileNotFoundException e) {
	            System.err.println("the words.txt not found");
	        } 
		 catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
