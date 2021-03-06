package com.sgcc.user.service;

import com.sgcc.user.pojo.User;
import org.springframework.stereotype.Service;

@Service("userService")
public interface UserService {

    //根据id查找
    public User getUserById(Integer userid);

    //添加一条数据
    public int insert(User user);
}
