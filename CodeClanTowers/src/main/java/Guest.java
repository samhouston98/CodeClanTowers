public class Guest {

    private String name;
    private String email;
    private boolean businessTraveller;


    public Guest(String name, String email, boolean businessTraveller) {
        this.name = name;
        this.email = email;
        this.businessTraveller = businessTraveller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBusinessTraveller() {
        return businessTraveller;
    }

    public void setBusinessTraveller(boolean businessTraveller) {
        this.businessTraveller = businessTraveller;
    }
}
