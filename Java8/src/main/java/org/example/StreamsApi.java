package org.example;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsApi {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Ram", "Dev", 50000 );
        Employee e2 = new Employee("Sham", "Devops", 40000 );
        Employee e3 = new Employee("Ganesh", "Dev", 30000 );
        Employee e4 = new Employee("Ramesh", "Devops", 35000 );
        Employee e5 = new Employee("Suresh", "Tester", 26000 );
        Employee e6 = new Employee("Chirag", "Dev", 60000 );
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        String input = "ilovejavalanguage";

//        String apiData = getDataFromApi();
//        System.out.println(apiData);

        employees.stream().collect(Collectors.groupingBy(Employee::getDept));

        //frequency of each letter
       Map<String, Long> res = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                ;
        System.out.println(res);

        //Finding unique letters
        List<String> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        //Find first occurence of unique element
       String first =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println("Non repeat first : " + first);

        //2nd highest element
        int [] numArray = {7,2,5,8,10,9,32,43,1,14,18,12,11,19};
        Integer collect1 = Arrays.stream(numArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                        .get();
        System.out.println("Int : " + collect1);

        //Nth highest element
        int n=3;
        Integer i = Arrays.stream(numArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .get(n - 1);
        System.out.println("nth highest : " + i);

        //Find largest word
        String str = "Hello this is test string for testing";
        String string = Arrays.stream(str.split(" "))
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("Collect : " +string);

        //Find all elements that start with 1
        List<String> collect2 = Arrays.stream(numArray)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Start with 1 : " + collect2);

        //String.join()
        String join = String.join("-", Arrays.asList("1", "2", "3", "4"));
        System.out.println(join);

        //employees.stream().filter(salary -> salary.getSalary() < 40000).map(employee -> employee.getName()).forEach(System.out::println);
        //String string = employees.stream().filter(employee -> employee.getDept()=="Dev").collect(Collectors.maxBy((o1, o2) -> o2.getSalary() - o1.getSalary())).map(employee -> employee.getName()).get();
        //System.out.println(string);

//        Map<String, Double> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)))
//                ;
//        System.out.println(collect.toString());




//        Map<String, Optional<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
//        System.out.println(collect1.toString());


        //name of second highest salaried employee in a dev
//        Optional<String> s = employees.stream()
//                .filter(employee -> employee.getDept() == "Dev")
//                .sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
//                .skip(1)
//                .findFirst()
//                .map(Employee::getName);
//        System.out.println(s.get());

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Optional<Integer> first = myList.stream().sorted(Collections.reverseOrder()).findFirst();
//        System.out.println(first.get());

//        String input = "Java Articles are Awesome";
//
//        Optional<Character> firstRepeatedChar = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .findFirst();
//        ;
//        if (firstRepeatedChar.isPresent()) {
//            System.out.println("First repeated character: " + firstRepeatedChar.get());
//        } else {
//            System.out.println("No repeated character found.");
//        }



    }


}