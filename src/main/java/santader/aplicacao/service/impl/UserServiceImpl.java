package santader.aplicacao.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import santader.aplicacao.domain.model.User; // ✅ Import correto
import santader.aplicacao.domain.repository.UserRepository;
import santader.aplicacao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) { // ✅
            throw new IllegalArgumentException("this User ID already exists.");
        }
        return userRepository.save(userToCreate); // ✅
    }
}