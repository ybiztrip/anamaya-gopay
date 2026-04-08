package anamaya.gopay.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingListFilter {
    private int page;
    private int size;
    private String sort;
    private Long companyId;
    private Long userId;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String phoneNumber;
}
