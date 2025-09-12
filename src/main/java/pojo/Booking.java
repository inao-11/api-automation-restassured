package pojo;

public class Booking {
    private String firstName;
    private String lastName;
    private double totalprice;
    private boolean depositepaid;
    private String checkin;
    private String checkout;
    private String additionalneeds;

    public Booking(String firstName, String lastName, double totalprice, boolean depositepaid, String checkin, String checkout, String additionalneeds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalprice = totalprice;
        this.depositepaid = depositepaid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.additionalneeds = additionalneeds;
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

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositepaid() {
        return depositepaid;
    }

    public void setDepositepaid(boolean depositepaid) {
        this.depositepaid = depositepaid;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}
