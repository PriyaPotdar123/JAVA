package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapp {

	public static void main(String[] args) {

        List<String> list1 = Arrays.asList("book","pen","notebook");
        List<String> list2 = Arrays.asList("book1","pen1","notebook1");
        List<String> list3 = Arrays.asList("book2","pen2","notebook1");
        List<String> list4 = Arrays.asList("book3","pen3","notebook1");
        
        List<List<String>> lists = new ArrayList<List<String>>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        
        lists.stream().flatMap(l -> l.stream()).map(l -> l.toUpperCase())
        .collect(Collectors.toList()).forEach(System.out::println);
	}

}

//op
/*
 * BOOK
PEN
NOTEBOOK
BOOK1
PEN1
NOTEBOOK1
BOOK2
PEN2
NOTEBOOK1
BOOK3
PEN3
NOTEBOOK1*/
