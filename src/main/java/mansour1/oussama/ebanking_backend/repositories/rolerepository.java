package mansour1.oussama.ebankingbackend.repositories;

import mansour1.oussama.ebankingbackend.entities.ERole;
import mansour1.oussama.ebankingbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
