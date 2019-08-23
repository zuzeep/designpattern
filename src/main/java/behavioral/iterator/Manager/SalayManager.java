package behavioral.iterator.Manager;

import behavioral.iterator.model.PayModel;

public class SalayManager {

    private PayModel[] salaries = new PayModel[2];

    public SalayManager(){
        salaries[0] = new PayModel("salary_1",1300.0);
        salaries[1] = new PayModel("salary_2",1250.0);
    }

    public void addSalary(PayModel model){
        PayModel[] newSalaries = new PayModel[salaries.length+1];
        System.arraycopy(salaries,0, newSalaries, 0,salaries.length);
        salaries = newSalaries;
    }

    public PayModel[] getSalaries(){
        return salaries;
    }
}
