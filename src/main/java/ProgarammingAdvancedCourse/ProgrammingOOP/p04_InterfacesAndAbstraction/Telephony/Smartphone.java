package p04_InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : urls) {
            boolean valid = true;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                stringBuilder.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : numbers) {
            boolean valid = true;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            } else {
                stringBuilder.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }
}
