package org.addresses.services;

import org.addresses.models.House;
import org.addresses.models.Street;

import java.util.List;

public interface StreetService {
    List<Street> findAll();
    Street getStreetById(int id);
}
