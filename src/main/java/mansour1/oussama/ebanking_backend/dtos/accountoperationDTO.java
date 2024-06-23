package mansour1.oussama.ebankingbackend.dtos;

import lombok.Data;
import mansour1.oussama.ebankingbackend.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

