package mansour1.oussama.ebankingbackend.repositories;

import mansour1.oussama.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
