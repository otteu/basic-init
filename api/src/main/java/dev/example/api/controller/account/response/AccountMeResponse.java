package dev.example.api.controller.account.response;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class AccountMeResponse {

    private String email;

    private String name;

    private LocalDateTime registeredAt;
}
