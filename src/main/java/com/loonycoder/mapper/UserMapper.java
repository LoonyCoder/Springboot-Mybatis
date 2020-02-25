package com.loonycoder.mapper;

import com.loonycoder.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther loonycoder
 * @date 2019/03/16
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    List<User> findById(Long id);

    void create(User user);

    void delete(Long id);

    void update(User user);

    User findByName(String name);
}
