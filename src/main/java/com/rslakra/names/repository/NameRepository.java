/**
 *
 */
package com.rslakra.names.repository;

import com.rslakra.names.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rohtash Lakra
 */
@Repository
public interface NameRepository extends JpaRepository<Name, Long> {

}
