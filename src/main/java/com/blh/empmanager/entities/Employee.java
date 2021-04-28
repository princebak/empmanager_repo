package com.blh.empmanager.entities;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long empid;
    String fnamemp;
    String lnamemp;
    String adrsemp;
    String phonemp;

    public Employee() {
    }

    public Employee(long empid, String fnamemp, String lnamemp, String adrsemp, String phonemp) {
        this.empid = empid;
        this.fnamemp = fnamemp;
        this.lnamemp = lnamemp;
        this.adrsemp = adrsemp;
        this.phonemp = phonemp;
    }

    public Employee(String fnamemp, String lnamemp, String adrsemp, String phonemp) {
        this.fnamemp = fnamemp;
        this.lnamemp = lnamemp;
        this.adrsemp = adrsemp;
        this.phonemp = phonemp;
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getFnamemp() {
        return fnamemp;
    }

    public void setFnamemp(String fnamemp) {
        this.fnamemp = fnamemp;
    }

    public String getLnamemp() {
        return lnamemp;
    }

    public void setLnamemp(String lnamemp) {
        this.lnamemp = lnamemp;
    }

    public String getAdrsemp() {
        return adrsemp;
    }

    public void setAdrsemp(String adrsemp) {
        this.adrsemp = adrsemp;
    }

    public String getPhonemp() {
        return phonemp;
    }

    public void setPhonemp(String phonemp) {
        this.phonemp = phonemp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", fnamemp='" + fnamemp + '\'' +
                ", lnamemp='" + lnamemp + '\'' +
                ", adrsemp='" + adrsemp + '\'' +
                ", phonemp='" + phonemp + '\'' +
                '}';
    }
}
