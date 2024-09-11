package nl.oudhoff.boekenbackend.repositories;

import nl.oudhoff.boekenbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameIgnoreCase(String username);
    void deleteByUsernameIgnoreCase(String username);
}
