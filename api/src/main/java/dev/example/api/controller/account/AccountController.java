package dev.example.api.controller.account;

import dev.example.api.common.api.Api;
import dev.example.api.common.error.ErrorCode;
import dev.example.api.common.exception.ApiException;
import dev.example.api.controller.account.response.AccountMeResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Controller
@RequestMapping("/api/account")
public class AccountController {

    @GetMapping("/me")
    public Api<AccountMeResponse> test() {

        AccountMeResponse re = AccountMeResponse.builder()
                .name("lll")
                .email("222")
                .registeredAt(LocalDateTime.now())
                .build();

        try {
            Integer.parseInt("sdsd");
        } catch (Exception e) {
            throw new ApiException(ErrorCode.SERVER_ERROR, e,"User Error");
        }


        return Api.OK(re);
    }

}
