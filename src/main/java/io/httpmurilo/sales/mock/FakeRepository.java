package io.httpmurilo.sales.mock;

import io.httpmurilo.sales.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FakeRepository extends JpaRepository<User, Integer> {
}
