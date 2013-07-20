/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author madenem
 */
@Entity
@Table(name = "device")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Device.findAll", query = "SELECT d FROM Device d"),
    @NamedQuery(name = "Device.findByMake", query = "SELECT d FROM Device d WHERE d.make = :make"),
    @NamedQuery(name = "Device.findByModel", query = "SELECT d FROM Device d WHERE d.model = :model"),
    @NamedQuery(name = "Device.findByDateRegistered", query = "SELECT d FROM Device d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Device.findByMACAddress", query = "SELECT d FROM Device d WHERE d.devicePK.mACAddress = :mACAddress"),
    @NamedQuery(name = "Device.findByUid", query = "SELECT d FROM Device d WHERE d.devicePK.uid = :uid"),
    @NamedQuery(name = "Device.findBySerialNumber", query = "SELECT d FROM Device d WHERE d.devicePK.serialNumber = :serialNumber")})
public class Device implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DevicePK devicePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Make")
    private String make;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @JoinColumn(name = "employee_empID", referencedColumnName = "empID")
    @ManyToOne(optional = false)
    private Employee employeeempID;

    public Device() {
    }

    public Device(DevicePK devicePK) {
        this.devicePK = devicePK;
    }

    public Device(DevicePK devicePK, String make, String model, Date dateRegistered,Employee emp) {
        this.devicePK = devicePK;
        this.make = make;
        this.model = model;
        this.dateRegistered = dateRegistered;
        employeeempID = emp;
    }

    public Device(String mACAddress, String uid, String serialNumber) {
        this.devicePK = new DevicePK(mACAddress, uid, serialNumber);
    }

    public DevicePK getDevicePK() {
        return devicePK;
    }

    public void setDevicePK(DevicePK devicePK) {
        this.devicePK = devicePK;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Employee getEmployeeempID() {
        return employeeempID;
    }

    public void setEmployeeempID(Employee employeeempID) {
        this.employeeempID = employeeempID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devicePK != null ? devicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Device)) {
            return false;
        }
        Device other = (Device) object;
        if ((this.devicePK == null && other.devicePK != null) || (this.devicePK != null && !this.devicePK.equals(other.devicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Device[ devicePK=" + devicePK + " ]";
    }
    
}
