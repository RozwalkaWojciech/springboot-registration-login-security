package javer.springbootregistrationloginsecurity.repository;

import javer.springbootregistrationloginsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
