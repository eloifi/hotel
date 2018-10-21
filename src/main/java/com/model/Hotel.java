package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_HOTEL")
    private Long id; // Identifiant client ou fournisseur (Clé primaire).

    private String ref;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESIGNATION")
    private String designation;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "PHOTO")
    private String photo;

    /**
     * @param ref
     * @param type
     * @param designation
     * @param adresse
     * @param photo
     */
    public Hotel(String ref, String type, String designation, String adresse, String photo)
    {
        super();
        this.ref = ref;
        this.type = type;
        this.designation = designation;
        this.adresse = adresse;
        this.photo = photo;
    }

    /**
     * 
     */
    public Hotel()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * @return the ref
     */
    public String getRef()
    {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref)
    {
        this.ref = ref;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @return the designation
     */
    public String getDesignation()
    {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    /**
     * @return the adresse
     */
    public String getAdresse()
    {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    /**
     * @return the photo
     */
    public String getPhoto()
    {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
        result = prime * result + ((designation == null) ? 0 : designation.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((photo == null) ? 0 : photo.hashCode());
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hotel other = (Hotel) obj;
        if (adresse == null) {
            if (other.adresse != null)
                return false;
        } else if (!adresse.equals(other.adresse))
            return false;
        if (designation == null) {
            if (other.designation != null)
                return false;
        } else if (!designation.equals(other.designation))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (photo == null) {
            if (other.photo != null)
                return false;
        } else if (!photo.equals(other.photo))
            return false;
        if (ref == null) {
            if (other.ref != null)
                return false;
        } else if (!ref.equals(other.ref))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Hospital [id=" + id + ", ref=" + ref + ", type=" + type + ", designation=" + designation + ", adresse="
            + adresse + ", photo=" + photo + "]";
    }

}
