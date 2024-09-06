package com.rw.orderbuilder.Model.postgres;

import jakarta.persistence.*;

@Entity
@Table(name = "Status")
public class StatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status")
    private Integer idStatus;

    @Column(name = "Name", length = 10, nullable = false)
    private String name;

    public StatusModel(Integer idStatus, String name) {
        this.idStatus = idStatus;
        this.name = name;
    }

    public StatusModel() {
    }

    public Integer getIdStatus() {
        return this.idStatus;
    }

    public String getName() {
        return this.name;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StatusModel)) return false;
        final StatusModel other = (StatusModel) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getIdStatus() != other.getIdStatus()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StatusModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getIdStatus();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "StatusModel(idStatus=" + this.getIdStatus() + ", name=" + this.getName() + ")";
    }
}

