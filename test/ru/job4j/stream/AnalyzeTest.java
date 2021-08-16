package ru.job4j.stream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AnalyzeTest {

    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100)))
                ).stream()
        );
        assertThat(average, is(100D));
    }

    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100))),
                        new Pupil("Petrov", Arrays.asList(new Subject("Math", 60)))
                ).stream()
        );
        assertThat(average, is(80D));
    }

    @Test
    public void whenListOfPupilAverage() {
        List<Tuple> average = Analyze.averageScoreBySubject(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", Arrays.asList(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(average, is(Arrays.asList(
                new Tuple("Ivanov", 100D),
                new Tuple("Petrov", 60D)
        )));
    }

    @Test
    public void whenListOfSubjectAverage() {
        List<Tuple> average = Analyze.averageScoreByPupil(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", Arrays.asList(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(average, is(Arrays.asList(
                new Tuple("Math", 80D),
                new Tuple("Lang", 80D)
        )));
    }

    @Test
    public void whenBestPupil() {
        Tuple best = Analyze.bestStudent(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", Arrays.asList(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(best, is(new Tuple("Ivanov", 200D)));
    }

    @Test
    public void whenBestSubject() {
        Tuple best = Analyze.bestSubject(
                Arrays.asList(
                        new Pupil("Ivanov", Arrays.asList(new Subject("Math", 100), new Subject("Lang", 40))),
                        new Pupil("Petrov", Arrays.asList(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(best, is(new Tuple("Math", 160D)));
    }
}