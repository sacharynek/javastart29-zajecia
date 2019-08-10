package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream().filter(a -> {return a.getAge()<18;}).map(Person::getName).collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream().map(a -> {return new User(a.getName(),a.getAge(),a.getName()+"_"+a.getAge());}).collect(Collectors.toList());
    }
}
