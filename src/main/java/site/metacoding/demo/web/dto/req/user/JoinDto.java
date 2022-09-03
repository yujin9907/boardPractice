package site.metacoding.demo.web.dto.req.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDto {
    private String username;
    private String password;
    private String email;
}
