package io.github.kayquesanmartin.studiomanager.v1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> PLAIN OLD JAVA OBJECT
@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "rg", unique = true)
    private String rg;

    @Column(name = "postal_address")
    private String postalAddress;

    @Column(name = "job")
    private String job;

    @Column(name = "telephone", unique = true)
    private String telephone;
    
    @Column(name = "email", unique = true)
    private String email;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getPostalAddress() {
        return postalAddress;
    }
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AppUser [id=" + id + ", fullName=" + fullName + ", rg=" + rg + ", postalAddress=" + postalAddress + ", job=" + job
                + ", telephone=" + telephone + ", email=" + email + "]";
    }

}
