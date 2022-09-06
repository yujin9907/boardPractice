package site.metacoding.demo.domain.user;

import site.metacoding.demo.web.dto.req.user.JoinDto;
import site.metacoding.demo.web.dto.req.user.LoginDto;

import java.util.List;

public interface UserDao {
    public User login(LoginDto loginDto); // DTO 생각해보기
    public User findById(Integer id);
    public void insert(JoinDto joinDto);
}
