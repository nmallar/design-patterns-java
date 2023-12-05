package splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Expense {
private Double amount;
private UserGroup userGroup;
private ExpenseType expenseType;
private List<User> users;

}
