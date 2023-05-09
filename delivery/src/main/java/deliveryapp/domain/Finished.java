package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Finished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long retaurantId;
    private Long customerId;
    private String status;

    public Finished(Delivery aggregate) {
        super(aggregate);
    }

    public Finished() {
        super();
    }
}
