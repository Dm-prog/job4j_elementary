package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        JSONReport json = new JSONReport();
        String text = json.generate("name : name", "body : body");
        return text;
    }
}
