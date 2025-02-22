package org.example.Tic_Tac_Toe.factory;

// Plan creation logic here
// we can use same code at multiple places
public class PlanFactory {
    public static Plan createPlan(String planType) {
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommericalPlan();
        }
        return null;
    }
}
