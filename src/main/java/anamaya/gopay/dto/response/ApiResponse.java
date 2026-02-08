package anamaya.gopay.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;

    private Long totalElements;
    private Integer totalPages;
    private Boolean last;
    private Integer size;
    private Integer number;

    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
            .success(true)
            .message("Success")
            .data(data)
            .build();
    }

    public static <T> ApiResponse<T> paginatedSuccess(
        T data,
        long totalElements,
        int totalPages,
        boolean last,
        int size,
        int number
    ) {
        return ApiResponse.<T>builder()
            .success(true)
            .message("Success")
            .data(data)
            .totalElements(totalElements)
            .totalPages(totalPages)
            .last(last)
            .size(size)
            .number(number)
            .build();
    }

    public static <T> ApiResponse<T> error(String message) {
        return ApiResponse.<T>builder()
            .success(false)
            .message(message)
            .build();
    }
}
