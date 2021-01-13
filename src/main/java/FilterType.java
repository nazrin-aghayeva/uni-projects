import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilterType {
    PAN(16,20);

    private final Integer min;
    private final Integer max;
}
