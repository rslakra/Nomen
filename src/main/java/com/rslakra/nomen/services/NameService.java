/**
 *
 */
package com.rslakra.nomen.services;

import com.rslakra.nomen.model.Name;
import com.rslakra.nomen.repository.NameRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rohtash Lakra
 */
@Service
public class NameService {

    @Autowired
    private NameRepository repository;

    /**
     * Adds the record of the new name.
     *
     * @param name
     * @return
     */
    public Name create(Name name) {
        return repository.saveAndFlush(name);
    }

    /**
     * Returns the list of names.
     *
     * @return
     */
    public List<Name> getNames() {
        return repository.findAll();
    }

    /**
     * Returns the name for the specified <code>id</code>.
     *
     * @param id
     * @return
     */
    public Name getName(long id) {
        return repository.findById(id).get();
    }

    /**
     * Updates the name for the specified <code>id</code>.
     *
     * @param id
     * @param name
     * @return
     */
    public Name update(long id, Name name) {
        Name oldName = repository.findById(id).get();
        if (oldName == null) {
            throw new IllegalArgumentException("Invalid Id:" + id);
        }

        BeanUtils.copyProperties(name, oldName);
        name = repository.saveAndFlush(oldName);

        return name;
    }

    /**
     * Deletes the name for the specified <code>id</code>.
     *
     * @param id
     * @return
     */
    public Name delete(long id) {
        Name name = repository.findById(id).get();
        if (name == null) {
            throw new IllegalArgumentException("Invalid Id:" + id);
        }

        repository.delete(name);

        return name;
    }

    /**
     * Returns the list of names by first name.
     *
     * @param firstName
     * @return
     */
    public List<Name> findByFirstName(String firstName) {
        return null;
    }

    /**
     * Returns the list of names by middle name.
     *
     * @param middleName
     * @return
     */
    public List<Name> findByMiddleName(String middleName) {
        return null;
    }

    /**
     * Returns the list of names by last name.
     *
     * @param lastName
     * @return
     */
    public List<Name> findByLastName(String lastName) {
        return null;
    }

}
