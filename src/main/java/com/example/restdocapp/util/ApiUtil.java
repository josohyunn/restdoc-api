package com.example.restdocapp.util;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ApiUtil {

    public static <T> ApiResult<T> success(T response) {
        return new ApiResult<>(true, response, null);
    }

    public static ApiResult<?> error(String message) {
        return new ApiResult<>(false, null, new ApiError(message));
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ApiResult<T> {
        private final boolean success;
        private final T response;
        private final ApiError error;
    }

    @Getter @Setter @AllArgsConstructor
    public static class ApiError {
        private final String message;
    }
}