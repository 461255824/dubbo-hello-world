package dao;


import dto.UserModel;

public interface UserMapper {
    //@Select("SELECT user FROM test WHERE id = #{userId}")
    UserModel getUser(int userId);
}
