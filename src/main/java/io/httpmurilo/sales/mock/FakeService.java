package io.httpmurilo.sales.mock;

import io.httpmurilo.sales.dto.UserDTO;
import io.httpmurilo.sales.entity.User;
import io.httpmurilo.sales.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class FakeService {

    @Autowired
    private FakeRepository repository;

    public User save(UserDTO dto) {
        return repository.save(UserMapper.INSTANCE.toUser(dto));
    }
}
