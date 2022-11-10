package Lab_seasons;
import java.io.*;
import java.util.*;

// Q.1 WAJP to store text file content line by line into an array
public class StoreTextinArray {
	 // exceptions handle 
    public static void main(String[] args) throws IOException {
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new FileReader("D:test1.txt"));   // using bufferreader
        // use string
        String line = bf.readLine();
        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        bf.close();
        // storing the data in arraylist to array
        String[] array  = listOfStrings.toArray(new String[0]);
        // stored in array
        for (String str : array) {
            System.out.println(str);
        }}}
    