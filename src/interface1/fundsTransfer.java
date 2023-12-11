package interface1;

public interface fundsTransfer {

    void addBeneficiary(int toAccNo, String beneficiaryName);
    void transfer(int accNo, int amount);
}