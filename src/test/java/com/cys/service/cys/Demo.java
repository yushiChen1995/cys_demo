package com.cys.service.cys;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author cys
 * @date 2019/6/12
 */
public class Demo {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        boolean foo = predicate.test("foo");// true
        System.out.println("foo = " + foo);
        boolean foo1 = predicate.negate().test("foo");// false
        System.out.println("foo1 = " + foo1);

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Supplier<Person> runnable = Person::new;
        Person person = runnable.get();
        person.firstName = "test";
        System.out.println("person = " + person.firstName);

    }
}
