/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "technician")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Technician.findAll", query = "SELECT t FROM Technician t"),
    @NamedQuery(name = "Technician.findByTechnicianID", query = "SELECT t FROM Technician t WHERE t.technicianID = :technicianID"),
    @NamedQuery(name = "Technician.findByEmployeeCode", query = "SELECT t FROM Technician t WHERE t.employeeCode = :employeeCode"),
    @NamedQuery(name = "Technician.findByUserName", query = "SELECT t FROM Technician t WHERE t.userName = :userName"),
    @NamedQuery(name = "Technician.findByPassword", query = "SELECT t FROM Technician t WHERE t.password = :password"),
    @NamedQuery(name = "Technician.findByDateRegistered", query = "SELECT t FROM Technician t WHERE t.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Technician.findByAdmin", query = "SELECT t FROM Technician t WHERE t.admin = :admin")})
public class Technician implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "technicianID")
    private Integer technicianID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "employeeCode")
    private String employeeCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin")
    private boolean admin;

    public Technician() {
    }

    public Technician(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public Technician(Integer technicianID, String employeeCode, String userName, String password, Date dateRegistered, boolean admin) {
        this.technicianID = technicianID;
        this.employeeCode = employeeCode;
        this.userName = userName;
        this.password = password;
        this.dateRegistered = dateRegistered;
        this.admin = admin;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (technicianID != null ? technicianID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Technician)) {
            return false;
        }
        Technician other = (Technician) object;
        if ((this.technicianID == null && other.technicianID != null) || (this.technicianID != null && !this.technicianID.equals(other.technicianID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Technician[ technicianID=" + technicianID + " ]";
    }
    
}
