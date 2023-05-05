package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void steams() {
        List<String> names = List.of("Amigoscode", "Alex", "Zara");
        names.stream().limit(2).forEach(System.out::println);
    }

    @Test
    void streamFromArray(){
        String[] name = new String[]{"Amigoscode", "Alex", "Zara"};
        System.out.println(Arrays.stream(name).count());
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person>  people = MockData.getPeople();
        List<Person> youngPeople = people.stream().
                filter(p -> p.getAge()<=18)
                .limit(10).collect(Collectors.toList());
        youngPeople.stream().forEach(System.out::println);
    }

}
