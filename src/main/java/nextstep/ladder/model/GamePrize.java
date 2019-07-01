package nextstep.ladder.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GamePrize {
    private List<String> prizes;

    public GamePrize(String continuousResult) {
        this.prizes = splitName(continuousResult);
    }

    private List<String> splitName(String continuousName) {
        String[] names = continuousName.replace(" ", "").split(",");
        return Arrays.stream(names)
                .peek(name -> {
                    if (name.length() > 5) {
                        throw new IllegalArgumentException("각 이름은 다섯 글자 내로 입력해주세요.");
                    }
                })
                .collect(Collectors.toList());
    }

    public String getFormattedResult() {
        return this.prizes.stream()
                .map(name -> String.format("%6s", name))
                .collect(Collectors.joining());
    }

    public String getPrize(int point) {
        return prizes.get(point);
    }

    public List<String> getPrizes() {
        return prizes;
    }
}
