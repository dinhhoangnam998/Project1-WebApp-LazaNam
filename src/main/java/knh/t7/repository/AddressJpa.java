package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.Address;

public interface AddressJpa  extends JpaRepository<Address, Integer> {

}
