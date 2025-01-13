package solidexamplecode;

public class StaffUserImpl implements User {
    long utr, mobNo;
    String name, email;

    public StaffUserImpl(long utr, long mobNo, String name, String email) {
        this.utr = utr;
        this.mobNo = mobNo;
        this.name = name;
        this.email = email;
    }

    public long getUtr() {
        return utr;
    }

    public void setUtr(long utr) {
        this.utr = utr;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
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

    @Override
    public boolean isEligible() {
        // to be written;
        return true;
    }
}
