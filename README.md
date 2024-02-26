# Java 8 features

1. Functional Programming
2. Lambda expression
3. Stream API
4. Date & Time API
5. Method Reference
6. Optional

**2 types of programming**
1. Imperative programming
2. Declarative programming

## Interfaces in Java 8
**We can define methods in interface in Java 8.**<br>
We can use default and static methods in an interface to define a method

## forEach method in Java 8
Does it by internal looping. Faster than regular and advanced for loop

## Stream API in Java 8
* Stream does not store elements and can't be reused.
* We can use it to filter, collect, print and convert from one data structure to another

## Date & Time API in Java 8
* Until Java 7 `Date` class was used from `java.util.time` package which was confusing with `java.util.sql` package
* In Java 8 it is changed to `java.time` package

## Method Reference in Java 8
* Pass a method as a parameter to another method
* We can create custom method reference similar to `System.out::println`

## Optional in Java 8
* It is intended to be used as a return type (where if the optional is not mentioned the method has possibility of returning null)
* It is not designed to use where ever there are possibilities of null variable