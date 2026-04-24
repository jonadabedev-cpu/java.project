package santader.aplicacao.service;

import santader.aplicacao.domain.model.User; // ✅ Único import

public interface UserService {

    User findById(long id);

    User create(User userToCreate); // ✅ Único método create

}
