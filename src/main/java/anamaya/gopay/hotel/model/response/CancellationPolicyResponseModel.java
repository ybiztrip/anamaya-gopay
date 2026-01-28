package anamaya.gopay.hotel.model.response;

import java.util.List;

public class CancellationPolicyResponseModel {
    private String text;
    private String displayText;
    private String propertyTimezone;
    private List<PolicyResponseModel> policies;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getPropertyTimezone() {
        return propertyTimezone;
    }

    public void setPropertyTimezone(String propertyTimezone) {
        this.propertyTimezone = propertyTimezone;
    }

    public List<PolicyResponseModel> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PolicyResponseModel> policies) {
        this.policies = policies;
    }
}
