package org.addresses.repositories;

import org.addresses.models.Street;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends CrudRepository<Street, Integer> {
}