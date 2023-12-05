package splitwise.dto;

import lombok.Getter;
import lombok.Setter;
import splitwise.models.Expense;
import java.util.List;

@Getter
@Setter

public class SettleResponse {

    List<Expense> expenseList;

    public SettleResponse(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }
}
