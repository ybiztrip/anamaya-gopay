package anamaya.gopay.entity;

import anamaya.gopay.enums.BookingLogStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "booking_log")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingLogEntity extends BaseEntity {
    @Column(name = "oms_journey_code", length = 100)
    private String omsJourneyCode;

    @Column(name = "oms_booking_code", length = 100)
    private String omsBookingCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private BookingLogStatus status;

    @Column(name = "error_message", columnDefinition = "TEXT")
    private String errorMessage;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_phone_number", length = 50)
    private String contactPhoneNumber;

    @Column(name = "request_payload", columnDefinition = "JSON", nullable = false)
    private String requestPayload;

    @Column(name = "response_payload", columnDefinition = "JSON")
    private String responsePayload;
}
