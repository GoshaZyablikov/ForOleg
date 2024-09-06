package com.rw.orderbuilder.Model.postgres;

import jakarta.persistence.*;

@Entity
@Table(name = "Personnel")
public class PersonnelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personnel")
    private Integer idPersonnel;

    @Column(name = "personnel_id")
    private Integer personnelId;

    @Column(name = "first_name", length = 25)
    private String firstName;

    @Column(name = "last_name", length = 25)
    private String lastName;

    @Column(name = "sex", length = 1)
    private String sex;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "post", length = 100)
    private String post;

    @Column(name = "type_room", length = 4)
    private String typeRoom;

    @Column(name = "type", length = 10)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id_order", nullable = false)
    private OrderModel orderModel;

    public PersonnelModel() {
    }

    public PersonnelModel(Integer idPersonnel, Integer personnelId, String firstName, String lastName, String sex, String phone, String post, String typeRoom, String type, OrderModel orderModel) {
        this.idPersonnel = idPersonnel;
        this.personnelId = personnelId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.phone = phone;
        this.post = post;
        this.typeRoom = typeRoom;
        this.type = type;
        this.orderModel = orderModel;
    }

    public Integer getIdPersonnel() {
        return this.idPersonnel;
    }

    public Integer getPersonnelId() {
        return this.personnelId;
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

    public String getPhone() {
        return this.phone;
    }

    public String getPost() {
        return this.post;
    }

    public String getTypeRoom() {
        return this.typeRoom;
    }

    public String getType() {
        return this.type;
    }

    public OrderModel getOrderModel() {
        return this.orderModel;
    }

    public void setIdPersonnel(Integer idPersonnel) {
        this.idPersonnel = idPersonnel;
    }

    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PersonnelModel)) return false;
        final PersonnelModel other = (PersonnelModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$idPersonnel = this.getIdPersonnel();
        final Object other$idPersonnel = other.getIdPersonnel();
        if (this$idPersonnel == null ? other$idPersonnel != null : !this$idPersonnel.equals(other$idPersonnel))
            return false;
        final Object this$personnelId = this.getPersonnelId();
        final Object other$personnelId = other.getPersonnelId();
        if (this$personnelId == null ? other$personnelId != null : !this$personnelId.equals(other$personnelId))
            return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$sex = this.getSex();
        final Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$post = this.getPost();
        final Object other$post = other.getPost();
        if (this$post == null ? other$post != null : !this$post.equals(other$post)) return false;
        final Object this$typeRoom = this.getTypeRoom();
        final Object other$typeRoom = other.getTypeRoom();
        if (this$typeRoom == null ? other$typeRoom != null : !this$typeRoom.equals(other$typeRoom)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$orderModel = this.getOrderModel();
        final Object other$orderModel = other.getOrderModel();
        if (this$orderModel == null ? other$orderModel != null : !this$orderModel.equals(other$orderModel))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PersonnelModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $idPersonnel = this.getIdPersonnel();
        result = result * PRIME + ($idPersonnel == null ? 43 : $idPersonnel.hashCode());
        final Object $personnelId = this.getPersonnelId();
        result = result * PRIME + ($personnelId == null ? 43 : $personnelId.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $post = this.getPost();
        result = result * PRIME + ($post == null ? 43 : $post.hashCode());
        final Object $typeRoom = this.getTypeRoom();
        result = result * PRIME + ($typeRoom == null ? 43 : $typeRoom.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $orderModel = this.getOrderModel();
        result = result * PRIME + ($orderModel == null ? 43 : $orderModel.hashCode());
        return result;
    }

    public String toString() {
        return "PersonnelModel(idPersonnel=" + this.getIdPersonnel() + ", personnelId=" + this.getPersonnelId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", sex=" + this.getSex() + ", phone=" + this.getPhone() + ", post=" + this.getPost() + ", typeRoom=" + this.getTypeRoom() + ", type=" + this.getType() + ", orderModel=" + this.getOrderModel() + ")";
    }
}