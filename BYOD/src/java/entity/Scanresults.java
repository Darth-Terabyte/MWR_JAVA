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
@Table(name = "scanresults")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scanresults.findAll", query = "SELECT s FROM Scanresults s"),
    @NamedQuery(name = "Scanresults.findByScanID", query = "SELECT s FROM Scanresults s WHERE s.scanID = :scanID"),
    @NamedQuery(name = "Scanresults.findByDate", query = "SELECT s FROM Scanresults s WHERE s.date = :date"),
    @NamedQuery(name = "Scanresults.findByRooted", query = "SELECT s FROM Scanresults s WHERE s.rooted = :rooted"),
    @NamedQuery(name = "Scanresults.findByDebuggingEnabled", query = "SELECT s FROM Scanresults s WHERE s.debuggingEnabled = :debuggingEnabled"),
    @NamedQuery(name = "Scanresults.findByUnknownSourcesAllowed", query = "SELECT s FROM Scanresults s WHERE s.unknownSourcesAllowed = :unknownSourcesAllowed"),
    @NamedQuery(name = "Scanresults.findByApps", query = "SELECT s FROM Scanresults s WHERE s.apps = :apps")})
public class Scanresults implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "scanID")
    private Integer scanID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rooted")
    private boolean rooted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "debuggingEnabled")
    private boolean debuggingEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unknownSourcesAllowed")
    private boolean unknownSourcesAllowed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "apps")
    private String apps;

    public Scanresults() {
    }

    public Scanresults(Integer scanID) {
        this.scanID = scanID;
    }

    public Scanresults(Integer scanID, Date date, boolean rooted, boolean debuggingEnabled, boolean unknownSourcesAllowed, String apps) {
        this.scanID = scanID;
        this.date = date;
        this.rooted = rooted;
        this.debuggingEnabled = debuggingEnabled;
        this.unknownSourcesAllowed = unknownSourcesAllowed;
        this.apps = apps;
    }
    
    public Scanresults(Date date, boolean rooted, boolean debuggingEnabled, boolean unknownSourcesAllowed, String apps) {
        this.scanID = scanID;
        this.date = date;
        this.rooted = rooted;
        this.debuggingEnabled = debuggingEnabled;
        this.unknownSourcesAllowed = unknownSourcesAllowed;
        this.apps = apps;
    }

    public Integer getScanID() {
        return scanID;
    }

    public void setScanID(Integer scanID) {
        this.scanID = scanID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getRooted() {
        return rooted;
    }

    public void setRooted(boolean rooted) {
        this.rooted = rooted;
    }

    public boolean getDebuggingEnabled() {
        return debuggingEnabled;
    }

    public void setDebuggingEnabled(boolean debuggingEnabled) {
        this.debuggingEnabled = debuggingEnabled;
    }

    public boolean getUnknownSourcesAllowed() {
        return unknownSourcesAllowed;
    }

    public void setUnknownSourcesAllowed(boolean unknownSourcesAllowed) {
        this.unknownSourcesAllowed = unknownSourcesAllowed;
    }

    public String getApps() {
        return apps;
    }

    public void setApps(String apps) {
        this.apps = apps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scanID != null ? scanID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scanresults)) {
            return false;
        }
        Scanresults other = (Scanresults) object;
        if ((this.scanID == null && other.scanID != null) || (this.scanID != null && !this.scanID.equals(other.scanID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Scanresults[ scanID=" + scanID + " ]";
    }
    
}
