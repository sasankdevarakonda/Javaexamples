package interfacedemo;

public interface fundValidation {
    void addValidation();
    default addValidation getValidation(){
        return  new addValidation("SasankDevarakonda",34526);
    }
}
