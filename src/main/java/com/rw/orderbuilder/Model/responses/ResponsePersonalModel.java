package com.rw.orderbuilder.Model.responses;

import com.rw.orderbuilder.Model.postgres.PersonnelModel;

public class ResponsePersonalModel {
    private String firstName;
    private String lastName;
    private String sex;
    private String phoneNumber;
    private String TypeRoom;
    private String type;

    public ResponsePersonalModel(String firstName, String lastName, String sex, String phoneNumber, String TypeRoom, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.TypeRoom = TypeRoom;
        this.type = type;
    }

    public ResponsePersonalModel() {
    }

    public ResponsePersonalModel(PersonnelModel personnelModel) {
        this    .    firstName       =      personnelModel  .   getFirstName    ()    ;
        this    .    lastName        =      personnelModel  .   getLastName     ()    ;
        this    .    sex             =      personnelModel  .   getSex          ()    ;
        this    .    phoneNumber     =      personnelModel  .   getPhone        ()    ;
        this    .    TypeRoom        =      personnelModel  .   getTypeRoom     ()    ;
        this    .    type            =      personnelModel  .   getType         ()    ;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSex() {
        return this.sex;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getTypeRoom() {
        return this.TypeRoom;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTypeRoom(String TypeRoom) {
        this.TypeRoom = TypeRoom;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponsePersonalModel)) return false;
        final ResponsePersonalModel other = (ResponsePersonalModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$sex = this.getSex();
        final Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final Object this$phoneNumber = this.getPhoneNumber();
        final Object other$phoneNumber = other.getPhoneNumber();
        if (this$phoneNumber == null ? other$phoneNumber != null : !this$phoneNumber.equals(other$phoneNumber))
            return false;
        final Object this$TypeRoom = this.getTypeRoom();
        final Object other$TypeRoom = other.getTypeRoom();
        if (this$TypeRoom == null ? other$TypeRoom != null : !this$TypeRoom.equals(other$TypeRoom)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponsePersonalModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $phoneNumber = this.getPhoneNumber();
        result = result * PRIME + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
        final Object $TypeRoom = this.getTypeRoom();
        result = result * PRIME + ($TypeRoom == null ? 43 : $TypeRoom.hashCode());
        return result;
    }

    public String toString() {
        return "PersonalModel(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", sex=" + this.getSex() + ", phoneNumber=" + this.getPhoneNumber() + ", TypeRoom=" + this.getTypeRoom() + ")";
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
