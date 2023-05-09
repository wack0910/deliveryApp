package deliveryapp.domain;

import deliveryapp.domain.*;
import deliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;

    public CookStarted(Restaurant aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
