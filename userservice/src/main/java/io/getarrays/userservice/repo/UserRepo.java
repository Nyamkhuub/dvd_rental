package io.getarrays.userservice.repo;

import io.getarrays.userservice.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User1, Long> {
    User1 findByUsername(String username);

}
