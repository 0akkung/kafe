package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
