package JUnit;

class BankAccountTest {

    @Test
    void depositShouldIncreaseBalance() {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        BankAccount account = new BankAccount(1000);

        account.withdraw(400);

        assertEquals(600, account.getBalance());
    }

    @Test
    void withdrawShouldFailIfInsufficientFunds() {
        BankAccount account = new BankAccount(300);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(500));
    }
}
