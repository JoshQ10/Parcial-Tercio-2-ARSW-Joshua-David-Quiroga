package edu.eci.arsw.blueprints.model;

public record ApiResponse<T>(int code, String message, T data) {

    public static <T> ApiResponse<T> of(int code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

    public static ApiResponse<Void> of(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }
}
