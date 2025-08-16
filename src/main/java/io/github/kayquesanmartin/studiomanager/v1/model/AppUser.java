package io.github.kayquesanmartin.studiomanager.v1.model;

// POJO -> PLAIN OLD JAVA OBJECT
public class AppUser {

    private String id;

    private String fullName;
    private String rg;
    private String postalAddress;
    private String job;
    private String telephone;
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
