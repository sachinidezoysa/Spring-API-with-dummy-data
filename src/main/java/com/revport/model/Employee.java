package com.revport.model;

public class Employee {

    private long id;
    private int age;
    private String name;
    private double salary;

    private String city;
    private String title;
    private String email;
    private String address;
    private String country;
    private String zipcode;
    private String nicNumber;
    private String companyID;
    private String designation;
    private String homeContactNumber;
    private String mobileContactNumber;
    private String officeContactNumber;


    public Employee(){
        id=0;
    }

    public Employee(long id, String name, String city, String title, String email, String address, String country, String zipcode,
                    String nicNumber, String companyID, String designation, String homeContactNumber,
                    String mobileContactNumber, String officeContactNumber) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.title = title;
        this.email = email;
        this.address = address;
        this.country = country;
        this.zipcode = zipcode;
        this.nicNumber = nicNumber;
        this.companyID = companyID;
        this.designation = designation;
        this.homeContactNumber = homeContactNumber;
        this.mobileContactNumber = mobileContactNumber;
        this.officeContactNumber = officeContactNumber;
    }

    /*public Employee(long id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getHomeContactNumber() {
        return homeContactNumber;
    }

    public void setHomeContactNumber(String homeContactNumber) {
        this.homeContactNumber = homeContactNumber;
    }

    public String getMobileContactNumber() {
        return mobileContactNumber;
    }

    public void setMobileContactNumber(String mobileContactNumber) {
        this.mobileContactNumber = mobileContactNumber;
    }

    public String getOfficeContactNumber() {
        return officeContactNumber;
    }

    public void setOfficeContactNumber(String officeContactNumber) {
        this.officeContactNumber = officeContactNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", nicNumber='" + nicNumber + '\'' +
                ", companyID='" + companyID + '\'' +
                ", designation='" + designation + '\'' +
                ", homeContactNumber='" + homeContactNumber + '\'' +
                ", mobileContactNumber='" + mobileContactNumber + '\'' +
                ", officeContactNumber='" + officeContactNumber + '\'' +
                '}';
    }

    /* @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age
                + ", salary=" + salary + "]";
    }*/


}


