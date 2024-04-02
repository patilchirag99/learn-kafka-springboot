package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi2 {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        //List<Student> collect = studentList.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        studentList.stream().filter(s-> s.getFirstName().length()>4);
        //1. Find students ranked between 50 and 100
//        studentList.stream().filter(s -> s.getRank() > 50 && s.getRank() < 100)
//                .forEach(System.out::println);

        //2. Student staying in karnataka and sort by names
//        studentList.stream()
//                .filter(s -> "Karnataka".equals(s.getCity()))
//                .map(s -> s.getFirstName())
//                .sorted(Comparator.comparing(Student::getFirstName))
//                .forEach(System.out::println);

        //3. Find all department names
//        studentList.stream().map(s -> s.getDept())
//                .distinct()
//                .forEach(System.out::println);

        //4. Find all contact numbers
//        studentList.stream()
//                .flatMap(student -> student.getContacts()
//                        .stream())
//                .distinct()
//                .forEach(System.out::println);
        
        //5. Group students by dept
//        Map<String, List<Student>> collect = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept));
//        System.out.println(collect);

        //6. Count the number of student in each dept
//        Map<String, Long> count = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
//        System.out.println(count);

//        Map.Entry<String, Long> stringLongEntry1 = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue()))
//                .get();
//        System.out.println(stringLongEntry1);

        //7. Find average age of male and female students
//        Map<String, Double> averageAge = studentList.stream()
//                .collect(Collectors.
//                        groupingBy(Student::getGender,
//                                Collectors.averagingInt(Student::getAge)));
//        System.out.println("Age average " + averageAge);

        //8. Find the highest rank in each department
//        Map<String, Optional<Student>> collect = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparingInt(Student::getRank))));
//
//        System.out.println(collect);

        //9. Find student who has 2nd rank
//        Student student = studentList.stream()
//                .sorted(Comparator.comparingInt(Student::getRank))
//                .skip(1)
//                .findFirst()
//                .get();
//        System.out.println(student);


//        List<String> stringStream = studentList.stream()
//                // .map(Student::getCity)
//                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(s -> s.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(stringStream);

        int [] numArray = {7,2,5,8,10,9,32,43,1,14,18,12,11,19};
        Integer reduce = Arrays.stream(numArray)
                .boxed()
//                .reduce(0, (a, b) -> a + b);  //using reducer
        .collect(Collectors.summingInt(Integer::intValue)); //using collectors
//        .collect(Collectors.averagingInt(Integer::intValue)); //average
        System.out.println(reduce);
    }




}
