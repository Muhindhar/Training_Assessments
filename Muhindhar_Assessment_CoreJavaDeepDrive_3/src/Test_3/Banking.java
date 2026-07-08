package Test_3;

abstract class BankTransactionException extends Exception {
     int code;

    public BankTransactionException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getcode() {
        return code;
    }
}
class InsufficientFundsException extends BankTransactionException {
     double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Shortfall: "+shortfall, 1002);
        this.shortfall = shortfall;
    }
}
class InvalidAccountException extends BankTransactionException {
    private String accountId;

    public InvalidAccountException(String accountId) {
        super("Account ID cannot be empty", 1001);
        this.accountId = accountId;
    }
}
class TransactionLimitException extends BankTransactionException {
     double limit;

    public TransactionLimitException(double limit) {
        super("Limit: " + limit, 1003);
        this.limit = limit;
    }
}
class TransactionValidator {
    public static void validateTransaction(String accountId, double balance,
    		double amount, double Limit)
            throws BankTransactionException {
        if (accountId == null || accountId.isEmpty()) {
            throw new InvalidAccountException(accountId);
        }
        if (amount>Limit) {
            throw new TransactionLimitException(Limit);
        }
        if (amount>balance) {
            double shortfall= amount-balance;
            throw new InsufficientFundsException(shortfall);
        }
    }
}
public class Banking {
    public static void main(String[] args) throws BankTransactionException {
        try {
            TransactionValidator.validateTransaction("", 1000, 5003, 2000);
        } catch (InvalidAccountException e) {
            System.out.println("InvalidAccountException: " + e.getMessage() +
                    " Code: " + e.getcode());
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage() +
                    " Code: " + e.getcode());
        } catch (TransactionLimitException e) {
            System.out.println("TransactionLimitException: " + e.getMessage() +
                    " Code: " + e.getcode());
        } finally {
            System.out.println("Validation complete");
        }
    }
}