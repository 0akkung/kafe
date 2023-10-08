package ku.cs.kafe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "category")
    List<Menu> menus;
}
