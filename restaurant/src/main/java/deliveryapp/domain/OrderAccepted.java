package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;

    public OrderAccepted(Restaurant aggregate) {
        super(aggregate);
    }

    public OrderAccepted() {
        super();
    }
}
