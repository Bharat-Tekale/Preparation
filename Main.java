import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 70, 03, 10, 20, 30, 05, 90, 05);

//        print stream using peek method
//        list.stream().peek(a-> System.out.println(a)).count();

//        print stream using for each method
//        list.stream().forEach(a-> System.out.println(a));

//        print stream using for each with static method
//        list.stream().forEach(System.out::println);

//        find arrays 1st element from stream
//        list.stream().findFirst().ifPresent(System.out::println);
//        list.stream().findFirst().ifPresent(a -> System.out.println(a));

//        find the total number present in the list
//        System.out.println(list.stream().count());

//        find even and odd numbers in the stream
//        list.stream().filter(a-> a%2==0).forEach(System.out::println); //even numbers
//        list.stream().filter(a-> a%2!=0).forEach(System.out::println); //odd numbers

//        List<Integer> evenNumber =  list.stream().filter(a-> a%2==0).collect(Collectors.toList());
//        List<Integer> oddNumber =  list.stream().filter(a-> a%2!=0).collect(Collectors.toList());
//        System.out.println("Even Number list " + evenNumber);
//        System.out.println("Odd Number list " + oddNumber);

//        finding even odd numbers using partitioningBy
//        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(a -> a%2==0));
//        System.out.println("Even Num " + map.get(true));
//        System.out.println("Odd Num " + map.get(false));

//        finding even odd numbers using groupBy
//        Map<String, List<Integer>> map = list.stream().collect(Collectors.groupingBy(a-> a%2==0 ? "Even" : "Odd"));
//        System.out.println("Even Number" + map.get("Even"));
//        System.out.println("Odd Number" + map.get("Odd"));

//        print a number which starts with 3
//        list.stream().filter(a->a.toString().startsWith("3")).forEach(System.out::println);

//        find duplicate element in list
//        Set<Integer> temp = new HashSet<>();
//        System.out.println(list.stream().filter(a-> !temp.add(a)).count()); //forEach(System.out::println);
//        list.stream().filter(a-> !temp.add(a)).forEach(System.out::println);

//        find min and max value in a stream
//        System.out.println("Min in a list " + list.stream().min(Integer::compareTo).get());
//        System.out.println("Max in a list " + list.stream().max(Integer::compareTo).get());

//        System.out.println("Min in a list " + list.stream().min(Comparator.naturalOrder()).get());
//        System.out.println("Max in a list " + list.stream().max(Comparator.naturalOrder()).get());

//        System.out.println("Min in a list " + list.stream().min((a,b) -> a-b).get());
//        System.out.println("Max in a list " + list.stream().min((a,b) -> b-a).get());

//        sort a list in ascending order
//        list.stream().sorted().forEach(System.out::println);

//        sort a list in descending order
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        sort a list in ascending order and print distinct number
//        list.stream().sorted().distinct().forEach(System.out::println);

//        sort a list in descending order and print distinct number
//        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

//        check array contains duplicate number or not
//        int arr[] = {2, 2, 4, 3, 5, 4, 7, 7, 8, 9};
//        System.out.println(Arrays.stream(arr).distinct().count() != arr.length ? "Yes" : "No");

//        print a number if it's value is greater than 50
//        list.stream().filter(a-> a > 50).forEach(System.out::println);

//        do a square of a number and print if it is greater than 200
//        list.stream().map(a -> a*a).filter(a-> a>200).forEach(System.out::println);

//        sort a array and then convert it into stream
//        int arr[] = {10, 2, 2, 4, 3, 5, 4, 7, 7, 8, 9};
//        Arrays.sort(arr);
//        Arrays.stream(arr).forEach(System.out::println);

//        convert list of words in upper case
//        List <String> names = Arrays.asList("abc", "pqr", "Xyz");
//        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
//        names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

//        write a block to find the max element in an array
//        int[] arr = {10, 40, 20, 70, 90};
//        Arrays.stream(arr).max().ifPresent(System.out::println);

//        concat two streams and sort then with unique numbers
//        Stream<Integer> s1 = Stream.of(1, 2, 4, 3);
//        Stream<Integer> s2 = Stream.of(6, 5, 3, 4);
//        Stream.concat(s1, s2).sorted().distinct().forEach(System.out::println);

//        write a program to print 10 random numbers
//        Random random = new Random();
//        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
//        Stream.generate(()-> random.nextInt()).limit(10).forEach(System.out::println);

//        print data and time using java 8 and convert it into dd-mm-yyyy
//        System.out.println(LocalDateTime.now());
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
//        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

//        convert a list into optional and print data if present
//        Optional<List<Integer>> optionalIntegers = Optional.ofNullable(list);
//        optionalIntegers.ifPresent(System.out::println);

//        check the given number occurrences in a list
//        System.out.println(list.stream().filter(a-> a==05).count());

//        find the duplicate values in the list with their count and then print
//        List<String> names = Arrays.asList("abc", "pqr", "abc", "xyz", "xyz");
//        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
//        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));

//        return a sum of all employees salary
//        class Employee {
//            private String name;
//            private int salary;
//
//            Employee(String name, int salary) {
//                this.name = name;
//                this.salary = salary;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//
//            public int getSalary() {
//                return salary;
//            }
//
//            public void setSalary(int salary) {
//                this.salary = salary;
//            }
//        }
//        Employee employee1 = new Employee("avi", 1000);
//        Employee employee2 = new Employee("avi", 1000);
//        Employee employee3 = new Employee("avi", 1000);
//        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
//        System.out.println(employees.stream().mapToInt(employee -> employee.getSalary()).sum());

//        count the occurrence of each character in the string
//        String temp = "abcabcpqrs";
//        Map<Object, Long> map = temp.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c-> c, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(map);
//        map.entrySet().stream().forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));

//        find first non-repeated char in a given string
//        String str = "dhgsycxbc";
//        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())); //LinkedHashMap::new is imp to preserve order
//        System.out.println(map);
//        map.entrySet().stream().filter(m -> m.getValue() == 1).findFirst().ifPresent(m -> System.out.println(m.getKey() + " " + m.getValue()));

//        find non-repeated char in a given string
//        String str = "dhgsycxbc";
//        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())); //LinkedHashMap::new is imp to preserve order
//        System.out.println(map);
//        map.entrySet().stream().filter(m -> m.getValue() == 1).forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));

//        frequency of each element in array
//        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(c-> c, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(map);

//        sort the list in reverse order
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        sort the list in ascending order
//        list.stream().sorted().forEach(System.out::println);

//        join the list in a single string with delimiter prefix and suffix
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
//        System.out.println(fruits.stream().collect(Collectors.joining(",", "[", "]")));

//        print the number which are multiple of 5
//        list.stream().filter(a -> a % 5 == 0).forEach(System.out::println);

//        merge to unsorted array into single sorted array
//        int a[] = {3, 1, 20, 4};
//        int b[] = {2, 11, 1, 23};
//        int res[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//        System.out.println(Arrays.toString(res));

//        merge to unsorted array into single sorted array without duplicates
//        int a[] = {3, 1, 20, 4};
//        int b[] = {2, 11, 1, 23};
//        int res[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
//        System.out.println(Arrays.toString(res));

//        write a program to check whether two string are anagram or not
//        String a = "listen";
//        String b = "silent";
//        boolean res = a.length() == b.length() && Arrays.equals(a.toLowerCase().chars().sorted().toArray(), b.toLowerCase().chars().sorted().toArray());
//        System.out.println(res ? "Yes" : "No");

//        first 3 max element in the list
//        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

//        first 3 min element in the list
//        list.stream().sorted().distinct().limit(3).forEach(System.out::println);

//        print second-largest number in an array
//        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());

//        print largest number in an array
//        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get());

//        sort list of string in increasing order as per string length
//        List<String> name = Arrays.asList("sbjd", "sajccsa", "ash", "adsbfbisad", "a");
//        name.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

//        sum of all element in array/list
//        System.out.println(list.stream().mapToInt(Integer::intValue).distinct().sum());

//        average of all elements in array
//        System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());

//        common elements between two arrays
//        List<Integer> a = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> b = Arrays.asList(1,2,8,9,0,76);
//        a.stream().filter(b::contains).forEach(System.out::println);

//        sum of first 10 natural numbers
//        System.out.println(IntStream.range(1, 10).peek(System.out::println).sum());

//        last element of an array
//        System.out.println(list.stream().skip(list.size() - 1).findFirst().get());

    }

}