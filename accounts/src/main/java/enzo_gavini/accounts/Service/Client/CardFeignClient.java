package enzo_gavini.accounts.Service.Client;

import enzo_gavini.accounts.dto.CardDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("card")
public interface CardFeignClient {
    @GetMapping("/myCard/{customerId}")
    List<CardDto> getCardDetails(@PathVariable Long customerId);
}
