package gcu.domain;

import gcu.domain.*;
import gcu.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;

    public Worlded(World aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
//>>> DDD / Domain Event
