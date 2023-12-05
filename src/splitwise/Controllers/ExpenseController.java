package splitwise.Controllers;


import splitwise.Exception.UserNotFoundException;
import splitwise.dto.SettleRequest;
import splitwise.dto.SettleResponse;
import splitwise.service.ExpenseService;

public class ExpenseController {

    ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public SettleResponse settleUp(SettleRequest request) throws UserNotFoundException {

        SettleResponse response= expenseService.settleUp(request);
        return response;


    }
}
