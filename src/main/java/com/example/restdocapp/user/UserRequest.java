package com.example.restdocapp.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequest {

    @Data
    public static class JoinDTO {

        @Size(min = 3, max = 20)
        @NotEmpty // null, 공백 둘다 안됨
        private String username;

        @Size(min = 4, max = 20)
        @NotEmpty // null, 공백 둘다 안됨
        private String password;

        @Size(min = 10, max = 100)
        @NotEmpty // null, 공백 둘다 안됨
        private String email;

        public User toEntity() { // db에 insert해야 되는 DTO면 toEntity를 만들어주는게 좋다.
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class LoginDTO {

        @Size(min = 3, max = 20)
        @NotEmpty // null, 공백 둘다 안됨
        private String username;

        @Size(min = 4, max = 20)
        @NotEmpty // null, 공백 둘다 안됨
        private String password;

    }
}
