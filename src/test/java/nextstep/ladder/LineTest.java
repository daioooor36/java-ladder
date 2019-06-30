package nextstep.ladder;

import nextstep.ladder.model.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @DisplayName("(사람 수 - 1) 만큼의 사다리 Line 생성")
    @Test
    void Line_만들기 () {
        Line line = new Line(3);
        assertThat(line.getPoints().size()).isEqualTo(2);
    }
}
