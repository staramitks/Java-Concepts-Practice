package home.amit.designpattern.creational.factory;

public class RatePlanFactory {

    private final RatePlanEnum ratePlan;

    public RatePlanFactory(RatePlanEnum planName) {
        ratePlan = planName;
    }

    public Plan getPlan() {
        Plan finalPlan;
        switch (ratePlan) {
            case DOMESTIC:
                finalPlan = new DomesticPlan();
                break;
            case INSTITUTIONAL:
                finalPlan = new Institutional();
                break;
            case CORPORATE:
                finalPlan = new Corporate();
                break;
            default:
                finalPlan = null;
                break;
        }
        return finalPlan;
    }
}
