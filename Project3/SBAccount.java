package Project3;

class SBAccount extends Accounts{
    String type;
    public SBAccount(double amount,String type) {
        this.type=type;
        this.amount = amount;
    }
    @Override
    double calculateInterest() {
        if(type.equals("Normal"))
            return (this.amount*0.04);
        else if(type.equals("NRI")){
            return(this.amount*0.06);}
        else{
            System.out.println("Wrong input");
            return -1;
        }
    }
}
