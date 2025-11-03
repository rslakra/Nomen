/**
 *
 */
package com.rslakra.nomen.model;

import com.rslakra.nomen.utils.Utility;

import javax.persistence.*;

/**
 * @author Rohtash Lakra
 */
@Entity
@Table(name = "names")
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {

    }

    /**
     *
     * @param firstName
     * @param lastName
     */
    public Name(String firstName, String lastName) {
        this(firstName, null, lastName);
    }

    /**
     *
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the string representation of this object.
     */
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getId()).append(", ");
        if (!Utility.isNullOrEmpty(getFirstName())) {
            sBuilder.append(getFirstName());
        }

        if (!Utility.isNullOrEmpty(getMiddleName())) {
            if (!Utility.isNullOrEmpty(getFirstName())) {
                sBuilder.append(" ");
            }
            sBuilder.append(getMiddleName());
        }

        if (!Utility.isNullOrEmpty(getLastName())) {
            if (!Utility.isNullOrEmpty(getFirstName()) || !Utility.isNullOrEmpty(getMiddleName())) {
                sBuilder.append(" ");
            }
            sBuilder.append(getLastName());
        }

        return sBuilder.toString();
    }

}
