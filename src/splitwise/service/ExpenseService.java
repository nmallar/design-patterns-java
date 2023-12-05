package splitwise.service;

import splitwise.Exception.UserNotFoundException;
import splitwise.dto.SettleRequest;
import splitwise.dto.SettleResponse;
import splitwise.models.Expense;
import splitwise.models.ExpenseType;
import splitwise.models.User;
import splitwise.repository.ExpenseRepository;
import splitwise.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExpenseService {

    ExpenseRepository expenseRepository;
    UserRepository userRepository;

    public ExpenseService(ExpenseRepository expenseRepository, UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    public SettleResponse settleUp(SettleRequest request) throws UserNotFoundException {
        User user= userRepository.findUserByName(request.getName());

        if (user==null){
            throw new UserNotFoundException("No user found"  );

        }

        List<Expense> expenses = null;
        expenses= expenseRepository.getAllExpenses();

        List<Expense> userOwedTransactions=null;

        List<Expense> userPaidTransactions=null;

        for (Expense expense: expenses) {
            for (User expenseUser : expense.getUsers()) {
                if( expenseUser == request.getUser() && expense.getExpenseType()== ExpenseType.OwedBy){
                    userOwedTransactions.add(expense);
                } else if (expenseUser== request.getUser() && expense.getExpenseType()==ExpenseType.PaidBy) {
                    userPaidTransactions.add(expense);
                }

                }

        }

        return new SettleResponse(userOwedTransactions);


    }

}
