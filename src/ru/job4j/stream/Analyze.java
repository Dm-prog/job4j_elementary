package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(num -> Stream.of(num))
                .mapToInt(num -> Integer.parseInt(String.valueOf(num)))
                .average().orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(s -> new Tuple(s.getName(), averageScore(stream)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(num -> Stream.of(num))
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(num -> Double.parseDouble(String.valueOf(num)))));
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.collect(averageScoreBySubject(stream));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.collect(averageScoreByPupil(stream));
    }
}
