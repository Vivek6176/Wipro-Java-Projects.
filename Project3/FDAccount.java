
package Project3;

class FDAccount extends Accounts{
    int noofdays;
    int age;
    public FDAccount(double amount, int noOfDays, int age) {
        this.amount = amount;
        this.noofdays = noOfDays;
        this.age= age;}
    @Override
        double calculateInterest() {
        if(this.amount>=10000000){
            if(this.noofdays>=7 && this.noofdays<=14){
                return (this.amount*0.065);}
            else if(this.noofdays>=15 && this.noofdays<=29){
                return (this.amount*0.0675);}
            else if(this.noofdays>=30 && this.noofdays<=45){
                return (this.amount*0.0675);}
            else if(this.noofdays>=46 && this.noofdays<=60){
                return (this.amount*0.08);}
            else if(this.noofdays>=61 && this.noofdays<=184){
                return (this.amount*0.085);}
            else if(this.noofdays>=185 && this.noofdays<=365){
                return (this.amount*0.10);}
            else{
                System.out.println("Not a valid input");}
        }
        else{
            if(this.noofdays>=7 && this.noofdays<=14){
                if(this.age>=60){
                    return (this.amount * 0.05);} 
                else{
                    return (this.amount * 0.045);}
            }
            else if(this.noofdays>=15 && this.noofdays<=29){
                if(this.age>=60){
                    return (this.amount * 0.0525);}
                else{
                    return (this.amount * 0.0475);}
            }
            else if(this.noofdays>=30 && this.noofdays<=45){
                if(this.age>=60){
                    return (this.amount * 0.06);} 
                else{
                    return (this.amount * 0.055);}
            }
            else if(this.noofdays>=45 && this.noofdays<=60){
                if(this.age>=60){
                    return (this.amount * 0.075);} 
                else{
                    return (this.amount * 0.07);}
            }
            else if(this.noofdays>=61 && this.noofdays<=184){
                if(this.age>=60){
                    return (this.amount * 0.08);}
                else{
                    return (this.amount * 0.075);}
            }
            else if(this.noofdays>=185 && this.noofdays<=365){
                if(this.age>=60){
                    return (this.amount * 0.085);}
                else{
                    return (this.amount * 0.08);}
            }
            else{
                System.out.println("Not a valid input");}
        }
        return 0;
    }
}
