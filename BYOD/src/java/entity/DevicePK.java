/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author madenem
 */
@Embeddable
public class DevicePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "MACAddress")
    private String mACAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UID")
    private String uid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SerialNumber")
    private String serialNumber;

    public DevicePK() {
    }

    public DevicePK(String mACAddress, String uid, String serialNumber) {
        this.mACAddress = mACAddress;
        this.uid = uid;
        this.serialNumber = serialNumber;
    }


    public String getMACAddress() {
        return mACAddress;
    }

    public void setMACAddress(String mACAddress) {
        this.mACAddress = mACAddress;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
        hash += (mACAddress != null ? mACAddress.hashCode() : 0);
        hash += (uid != null ? uid.hashCode() : 0);
        hash += (serialNumber != null ? serialNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevicePK)) {
            return false;
        }
        DevicePK other = (DevicePK) object;
        if ((this.mACAddress == null && other.mACAddress != null) || (this.mACAddress != null && !this.mACAddress.equals(other.mACAddress))) {
            return false;
        }
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        if ((this.serialNumber == null && other.serialNumber != null) || (this.serialNumber != null && !this.serialNumber.equals(other.serialNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DevicePK[mACAddress=" + mACAddress + ", uid=" + uid + ", serialNumber=" + serialNumber + " ]";
    }
    
}
