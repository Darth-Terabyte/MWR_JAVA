/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author madenem
 */
@Embeddable
public class DevicenotregisteredPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "MACAdress")
    private String mACAdress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "AndroidID")
    private String androidID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SerialNumber")
    private String serialNumber;

    public DevicenotregisteredPK() {
    }

    public DevicenotregisteredPK(String mACAdress, String androidID, String serialNumber) {
        this.mACAdress = mACAdress;
        this.androidID = androidID;
        this.serialNumber = serialNumber;
    }

    public String getMACAdress() {
        return mACAdress;
    }

    public void setMACAdress(String mACAdress) {
        this.mACAdress = mACAdress;
    }

    public String getAndroidID() {
        return androidID;
    }

    public void setAndroidID(String androidID) {
        this.androidID = androidID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mACAdress != null ? mACAdress.hashCode() : 0);
        hash += (androidID != null ? androidID.hashCode() : 0);
        hash += (serialNumber != null ? serialNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevicenotregisteredPK)) {
            return false;
        }
        DevicenotregisteredPK other = (DevicenotregisteredPK) object;
        if ((this.mACAdress == null && other.mACAdress != null) || (this.mACAdress != null && !this.mACAdress.equals(other.mACAdress))) {
            return false;
        }
        if ((this.androidID == null && other.androidID != null) || (this.androidID != null && !this.androidID.equals(other.androidID))) {
            return false;
        }
        if ((this.serialNumber == null && other.serialNumber != null) || (this.serialNumber != null && !this.serialNumber.equals(other.serialNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DevicenotregisteredPK[ mACAdress=" + mACAdress + ", androidID=" + androidID + ", serialNumber=" + serialNumber + " ]";
    }
    
}
