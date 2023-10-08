package ku.cs.kafe.model;

import lombok.Data;

import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}
