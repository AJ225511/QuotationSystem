package wiese.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiese.domain.user.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
}
