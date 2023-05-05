package com.amigoscode.examples;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.CarDTO;
import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        List<PersonDTO> personDTOList = people.stream().map(person -> {
            PersonDTO personDTO = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
            return personDTO;
        }).collect(Collectors.toList());
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
        List<CarDTO> carDTOListCheap = cars.stream()
                .filter(c -> c.getPrice() <= 20000)
                .map(car -> new CarDTO(car.getId(), car.getMake(), car.getModel(), car.getPrice())
        ).collect(Collectors.toList());
        carDTOListCheap.stream().forEach(System.out::println);

        List<CarDTO> expensiveCars = cars.stream().filter(c-> c.getPrice()>50000).map(CarDTO::mapper).collect(Collectors.toList());
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

