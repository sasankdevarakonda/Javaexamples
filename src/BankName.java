public class BankName {
    public static void main(String[] args) {

            String userChoice = "RBI";
            String selectedBank = getSelectedBank(userChoice);
            System.out.println("Selected bank: " + selectedBank);
        }
        private static String getSelectedBank(String choice) {
            if ("SBI".equals(choice)) {
                return "SBI";
            } else if ("HDFC".equals(choice)) {
                return "HDFC";
            } else if ("ICICI".equals(choice)) {
                return "ICICI";
            } else if ("RBI".equals(choice)) {
                return "RBI";
            } else {
                return "Invalid choice";
            }
        }

}
