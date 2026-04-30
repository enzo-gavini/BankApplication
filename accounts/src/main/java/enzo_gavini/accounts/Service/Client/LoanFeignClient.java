package enzo_gavini.accounts.Service.Client;

import enzo_gavini.accounts.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("loans")
public interface LoanFeignClient {

    @GetMapping("/myLoan/{customerId}")
    List<LoanDto> getLoanDetils(@PathVariable Long customerId);
}
