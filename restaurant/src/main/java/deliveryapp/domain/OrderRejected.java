package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;

    public OrderRejected(Restaurant aggregate) {
        super(aggregate);
    }

    public OrderRejected() {
        super();
    }
}
