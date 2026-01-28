package anamaya.gopay.hotel.model.request;

public class GuestInfoRequestModel {
    private String title;
    private String firstName;
    private String lastName;
    private String IDType;
    private String IDNumber;
    private String email;
    private String gender;

    public GuestInfoRequestModel() {
        this.title = "";
        this.firstName = "";
        this.lastName = "";
        this.IDType = "";
        this.IDNumber = "";
        this.email = "";
        this.gender = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return title+"|"+firstName+"|"+lastName+"|"+IDType+"|"+IDNumber+"|"+email+"|"+gender;
    }
}
