package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        TextReport report = new TextReport();
        String text = report.generate("name : name", "body : body");
        return text;
    }
}
