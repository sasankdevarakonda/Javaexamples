package module;

import interface1.fundsTransfer;

public class icici implements fundsTransfer {
    @Override
    public void addBeneficiary(int toAccNo, String beneficiaryName) {
        System.out.println("Beneficiary added in CityBank. Beneficiary Account No: " + toAccNo + ", Beneficiary Name: " + beneficiaryName);
    }

    @Override
    public void transfer(int accNo, int amount) {
        System.out.println("Money is transferred to: "+accNo+ " Amount transferred: "+amount);

    }
}
