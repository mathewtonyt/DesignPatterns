package com.matt.singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by mtony on 3/28/17.
 */
public class Test {
    static class People {
        private int age;
        private String name;

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static int returnInteger(Integer key, Object value) {
        System.out.println("reached inside the returnInteger");
        return 44;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.parallelStream()
                .map(e -> e * 3)
                .reduce(0, Integer::sum);



        // public static int returnInteger(Integer key, Object value)
        Map<Integer, Object> testMap = new HashMap<>();
        testMap.put(4, "four");
        testMap.computeIfPresent(4, Test::returnInteger);

        // streams shows lazy loading
//        Stream<Integer> number = numbers.stream()
//                .filter(e -> e > 2)
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2);
        // this is the ending function - without findFirst() - no work is done by streams
        // it just pipes and keeps the wiring

//        Predicate<Integer> greaterThan2 = e -> e > 2;
//        Predicate<Integer> greaterThan3 = e -> e > 3;
//        Predicate<Integer> greaterThan4 = e -> e > 4;
//        Predicate<Integer> greaterThan5 = e -> e > 5;
//        System.out.println(greaterThan2
//                                .and(greaterThan3)
//                                .and(greaterThan4)
//                                .and(greaterThan5)
//                                .test(5));


//        int start = 10;
//        int stop = 20;
//        Stream.iterate(start, e -> e + 1)
//                .filter(e -> e % 3 == 0)
//                .limit(stop)
//                .mapToInt(e -> e *2)
//                .sum();


//        People people1 = new People(21, "test1");
//        People people2 = new People(24, "test2");
//
//        List<People> peoples = Arrays.asList(people1, people2);
//        peoples.stream()
//                .sorted(comparing(People::getAge).thenComparing(People::getName).reversed())
//                .forEach(System.out::println);
//
//        peoples.stream()
//                .collect(groupingBy(People::getAge, mapping(People::getName, toList())));
//
//        List<String> names = Arrays.asList("123");
//        names.stream()
//                .map(String::toUpperCase)
//                .collect(joining(", "));
//
//        // lazy loading using the lamda
//        int x = 3;
//
//        Supplier<Integer> findValue = () -> returnInteger();
//        if (x > 2 && findValue.equals(1)) {
//            System.out.println("-- reached here --");
//        }


    }


}
