package enzo_gavini.accounts.dto;

import enzo_gavini.accounts.model.Accounts;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDetails {
    private Accounts accounts;
    private List<LoanDto> loanDto;
    private List<CardDto> cardDto;
}
