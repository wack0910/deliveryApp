package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private Integer totalPrice;

    public Paid(Payment aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
}
