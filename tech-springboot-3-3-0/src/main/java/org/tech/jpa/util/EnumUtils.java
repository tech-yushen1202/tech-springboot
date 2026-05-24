package org.tech.jpa.util;

import org.tech.jpa.enums.DeptEnum;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class EnumUtils {

    public static <T extends Enum<T>, R> List<T> find(Class<T> rClass, Function<T, R> classifier, R c) {
        return EnumSet.allOf(rClass).stream().collect(Collectors.groupingBy(classifier, Collectors.toList())).getOrDefault(c, List.of());
    }

    public static <T extends Enum<T>, R> List<T> findAll(Class<T> rClass, Function<T, R> classifier, List<R> c) {
        return EnumSet.allOf(rClass).stream().filter(t -> Optional.ofNullable(c).orElse(List.of()).contains(classifier.apply(t))).toList();
    }

    public static <T extends Enum<T>, R> T of(Class<T> rClass, Function<T, R> classifier, R c) {
        return EnumSet.allOf(rClass).stream().collect(Collectors.toMap(classifier, Function.identity())).get(c);
    }

    public static <T extends Enum<T>, R> List<T> ofList(Class<T> rClass, Function<T, R> classifier, List<R> c) {
        return EnumSet.allOf(rClass).stream().filter(e -> Optional.ofNullable(c).orElse(List.of()).contains(classifier.apply(e))).toList();
    }

    public static <T extends Enum<T>, R, S> S of(Class<T> rClass, Function<T, R> classifier, Function<T, S> downstream, List<R> c) {
        return EnumSet.allOf(rClass).stream().collect(Collectors.toMap(classifier, downstream)).get(c);
    }

    public static <T extends Enum<T>, R, S> List<S> ofList(Class<T> rClass, Function<T, R> classifier, Function<T, S> downstream, List<R> c) {
        return EnumSet.allOf(rClass).stream().filter(e -> Optional.ofNullable(c).orElse(List.of()).contains(classifier.apply(e))).map(downstream).toList();
    }

    public static <T extends Enum<T>, R> Optional<T> ofNullable(Class<T> rClass, Function<T, R> classifier, List<R> c) {
        return Optional.of(EnumSet.allOf(rClass).stream().collect(Collectors.toMap(classifier, Function.identity())).get(c));
    }

    public static <T extends Enum<T>, R, S> Optional<S> ofNullable(Class<T> rClass, Function<T, R> classifier, Function<T, S> downstream, List<R> c) {
        return Optional.of(EnumSet.allOf(rClass).stream().collect(Collectors.toMap(classifier, downstream)).get(c));
    }

}
