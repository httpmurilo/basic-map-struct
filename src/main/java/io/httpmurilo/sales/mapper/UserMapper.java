package io.httpmurilo.sales.mapper;

import io.httpmurilo.sales.dto.UserDTO;
import io.httpmurilo.sales.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") //define que é um Spring bean e pode ser injetado via @Autowired
public abstract class UserMapper { //impedimos de instanciar diretamente
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class); //singleton
    public abstract User toUser(UserDTO dto);
}
