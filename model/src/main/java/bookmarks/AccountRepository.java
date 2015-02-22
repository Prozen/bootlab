package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Pavel on 09/02/15.
 */
public interface AccountRepository extends JpaRepository<Account,Long>{
    Optional<Account> findByUsername(String username);

}
