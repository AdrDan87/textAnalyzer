package textAnalyzers;

public class NumberOfWords implements Analyser {

    public Integer analyze(String text) {
        int output = text.split(" ").length ;
        return text.split(" ").length;
    }
}