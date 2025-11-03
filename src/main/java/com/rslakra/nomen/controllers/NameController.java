/**
 *
 */
package com.rslakra.nomen.controllers;

import com.rslakra.nomen.model.Name;
import com.rslakra.nomen.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rohtash Lakra
 */
@RestController
@RequestMapping(value = "${api.version}")
public class NameController {

    @Autowired
    private NameService service;

    /**
     * Adds the record of the new name.
     *
     * @param name
     * @return
     */
    @PostMapping(value = "/names")
    public @ResponseBody Name create(@RequestBody Name name) {
        return service.create(name);
    }

    /**
     * Returns the list of names.
     *
     * @return
     */
    @GetMapping(value = "/names")
    public @ResponseBody List<Name> getNames() {
        return service.getNames();
    }

    /**
     * Returns the name for the specified <code>id</code>.
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/names/{id}")
    public @ResponseBody Name getName(@PathVariable Long id) {
        return service.getName(id);
    }

    /**
     * Updates the name for the specified <code>id</code>.
     *
     * @param id
     * @param name
     * @return
     */
    @PostMapping(value = "/names/{id}")
    public @ResponseBody Name update(@PathVariable Long id, @RequestBody Name name) {
        return service.update(id, name);
    }

    /**
     * Deletes the name for the specified <code>id</code>.
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/names/{id}")
    public @ResponseBody Name delete(@PathVariable Long id) {
        return service.delete(id);
    }

}
