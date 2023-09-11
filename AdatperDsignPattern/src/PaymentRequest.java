import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PaymentRequest {
    private long id;
    private String name;
    private String email;
    private double amount;
}
