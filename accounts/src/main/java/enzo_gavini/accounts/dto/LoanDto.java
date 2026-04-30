package enzo_gavini.accounts.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LoanDto {
    private int loanNumber;
    private int customerId;
    private Date startDt;
    private String loanType;
    private int totalLoan;
    private int amountPaid;
    private int outstandingAmount;
    private String createDt;
}
