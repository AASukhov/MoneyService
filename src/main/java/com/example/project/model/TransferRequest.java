package com.example.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferRequest {
    private String cardFromNumber;
    private String cardFromValidTill;
    private int cardFromCVV;
    private String cardToNumber;
    private Amount amount;
}
