package com.loonycoder.service;


import com.loonycoder.entity.User;

/**
 * @auther loonycoder
 * @date 2019/03/16
 */
public interface UserService extends BaseService<User> {

    User findByName(String name);
}
