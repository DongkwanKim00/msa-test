package gcu.domain;

import gcu.domain.*;
import gcu.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;
}
