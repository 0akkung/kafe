package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
