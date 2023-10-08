package ku.cs.kafe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class OrderItemKey implements Serializable {

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "menu_id")
    private UUID menuId;
}

