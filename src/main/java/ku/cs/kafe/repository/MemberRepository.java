package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Pawat Puttimit 6410406827
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    // SELECT * FROM Member WHERE username = 'username'
    Member findByUsername(String username);
}
