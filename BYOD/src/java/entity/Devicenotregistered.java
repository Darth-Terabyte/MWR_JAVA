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
@Table(name = "devicenotregistered")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devicenotregistered.findAll", query = "SELECT d FROM Devicenotregistered d"),
    @NamedQuery(name = "Devicenotregistered.findByMake", query = "SELECT d FROM Devicenotregistered d WHERE d.make = :make"),
    @NamedQuery(name = "Devicenotregistered.findByModel", query = "SELECT d FROM Devicenotregistered d WHERE d.model = :model"),
    @NamedQuery(name = "Devicenotregistered.findByDateRegistered", query = "SELECT d FROM Devicenotregistered d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Devicenotregistered.findByMACAdress", query = "SELECT d FROM Devicenotregistered d WHERE d.devicenotregisteredPK.mACAdress = :mACAdress"),
    @NamedQuery(name = "Devicenotregistered.findByAndroidID", query = "SELECT d FROM Devicenotregistered d WHERE d.devicenotregisteredPK.androidID = :androidID"),
    @NamedQuery(name = "Devicenotregistered.findBySerialNumber", query = "SELECT d FROM Devicenotregistered d WHERE d.devicenotregisteredPK.serialNumber = :serialNumber"),
    @NamedQuery(name = "Devicenotregistered.findByToken", query = "SELECT d FROM Devicenotregistered d WHERE d.token = :token"),
    @NamedQuery(name = "Devicenotregistered.findByUsername", query = "SELECT d FROM Devicenotregistered d WHERE d.username = :username"),
    @NamedQuery(name = "Devicenotregistered.findByPassword", query = "SELECT d FROM Devicenotregistered d WHERE d.password = :password"),
    @NamedQuery(name = "Devicenotregistered.findByIDNumber", query = "SELECT d FROM Devicenotregistered d WHERE d.iDNumber = :iDNumber"),
    @NamedQuery(name = "Devicenotregistered.findByName", query = "SELECT d FROM Devicenotregistered d WHERE d.name = :name"),
    @NamedQuery(name = "Devicenotregistered.findBySurname", query = "SELECT d FROM Devicenotregistered d WHERE d.surname = :surname")})
public class Devicenotregistered implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DevicenotregisteredPK devicenotregisteredPK;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "IDNumber")
    private String iDNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Surname")
    private String surname;

    public Devicenotregistered() {
    }

    public Devicenotregistered(DevicenotregisteredPK devicenotregisteredPK) {
        this.devicenotregisteredPK = devicenotregisteredPK;
    }

    public Devicenotregistered(DevicenotregisteredPK devicenotregisteredPK, String make, String model, Date dateRegistered, String token, String username, String password, String iDNumber, String name, String surname) {
        this.devicenotregisteredPK = devicenotregisteredPK;
        this.make = make;
        this.model = model;
        this.dateRegistered = dateRegistered;
        this.token = token;
        this.username = username;
        this.password = password;
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
    }

    public Devicenotregistered(String mACAdress, String androidID, String serialNumber) {
        this.devicenotregisteredPK = new DevicenotregisteredPK(mACAdress, androidID, serialNumber);
    }

    public DevicenotregisteredPK getDevicenotregisteredPK() {
        return devicenotregisteredPK;
    }

    public void setDevicenotregisteredPK(DevicenotregisteredPK devicenotregisteredPK) {
        this.devicenotregisteredPK = devicenotregisteredPK;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devicenotregisteredPK != null ? devicenotregisteredPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devicenotregistered)) {
            return false;
        }
        Devicenotregistered other = (Devicenotregistered) object;
        if ((this.devicenotregisteredPK == null && other.devicenotregisteredPK != null) || (this.devicenotregisteredPK != null && !this.devicenotregisteredPK.equals(other.devicenotregisteredPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Devicenotregistered[ devicenotregisteredPK=" + devicenotregisteredPK + " ]";
    }
    
}
