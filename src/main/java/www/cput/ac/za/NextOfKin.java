package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public abstract class NextOfKin extends PlayerFactory{

    public String contactName;
    public String surnameName;
    public String contactNumber;

    public NextOfKin(PlayerBuilder builder, String contactName, String contactNumber, String surnameName) {
        super(builder);
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.surnameName = surnameName;
    }

    public String getContactName() {
        return contactName;
    }git st

    public NextOfKin setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public NextOfKin setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public String getSurnameName() {
        return surnameName;
    }

    public NextOfKin setSurnameName(String surnameName) {
        this.surnameName = surnameName;
        return this;
    }

    @Override
    public String toString() {
        return "NextOfKin{" +
                "contactName='" + contactName + '\'' +
                ", surnameName='" + surnameName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                "} " + super.toString();
    }
}
