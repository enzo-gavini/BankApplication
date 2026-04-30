package enzo_gavini.accounts.controller;

import enzo_gavini.accounts.Service.Client.CardFeignClient;
import enzo_gavini.accounts.Service.Client.LoanFeignClient;
import enzo_gavini.accounts.dto.CardDto;
import enzo_gavini.accounts.dto.CustomerDetails;
import enzo_gavini.accounts.dto.LoanDto;
import enzo_gavini.accounts.model.Accounts;
import enzo_gavini.accounts.model.Customer;
import enzo_gavini.accounts.repository.AccountsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountsController {

//    @Autowired
//    private AccountsRepository accountsRepository;


    private final AccountsRepository accountsRepository;
    private final LoanFeignClient loanFeignClient;
    private final CardFeignClient cardFeignClient;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }

    @GetMapping("/myAccount/{customerId}")
    public Accounts getAccountDetails(@PathVariable int customerId) {
        return accountsRepository.findByCustomerId(customerId);
    }

    @GetMapping("/myCustomerDetails/{id}")
    public CustomerDetails myCustomerDetails(@PathVariable Long customerId) {
        Accounts accounts = accountsRepository.findByCustomerId(Math.toIntExact(customerId));
        List<LoanDto> loans = loanFeignClient.getLoanDetils(customerId);
        List<CardDto> cards = cardFeignClient.getCardDetails(customerId);

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setAccounts(accounts);
        customerDetails.setLoanDto(loans);
        customerDetails.setCardDto(cards);
        return customerDetails;
    }
}
