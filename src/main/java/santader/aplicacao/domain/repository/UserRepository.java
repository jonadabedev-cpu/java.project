package santader.aplicacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import santader.aplicacao.domain.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
