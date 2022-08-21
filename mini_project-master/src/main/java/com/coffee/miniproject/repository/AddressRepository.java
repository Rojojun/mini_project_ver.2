package com.coffee.miniproject.repository;


import com.coffee.miniproject.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
