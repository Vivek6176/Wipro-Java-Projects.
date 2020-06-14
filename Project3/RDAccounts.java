
package Project3;
class RDAccounts extends Accounts{
    int noOfMonths;
    double monthlyAmount;
    int age;
    public RDAccounts(double amount, int noOfMonths, int age) {  
        this.amount = amount;
        this.noOfMonths = noOfMonths;
        this.age=age;
    }
    @Override
    double calculateInterest() {
        if(this.noOfMonths==6){
            if(this.age>60){
                return(this.amount*0.08);}
            else{
                return(this.amount*0.075);}
        }
        else if(this.noOfMonths==9){
            if(this.age>60){
                return(this.amount*0.0825);}
            else{
                return(this.amount*0.0775);}
        }
        else if(this.noOfMonths==12){
            if(this.age>60){
                return(this.amount*0.085);}
            else{
            return(this.amount*0.08);}
        }
        else if(this.noOfMonths==15){
            if(this.age>60){
                return(this.amount*0.0875);}
            else{
                return(this.amount*0.0825);}
        }
        else if(this.noOfMonths==18){
            if(this.age>60){
                return(this.amount*0.085);}
            else{
                return(this.amount*0.09);}
        }
        else if(this.noOfMonths==21){
            if(this.age>60){
                return(this.amount*0.0925);}
            else{
                return(this.amount*0.0875);}
        }
        return 0;
    }
}
