package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
      return   addressRepository.save(address);
    }

    @Override
    public List<Address> saveAll(List<Address> addresses) {

        return addressRepository.saveAll(addresses);
    }

    @Override
    public Address update(Address address, Long id) {
        Address address1 =addressRepository.getById(id);
        address1.setCity(address.getCity());
        return addressRepository.save(address1);
    }

    @Override
    public List<Address> findAll() {

        return addressRepository.findAll();
    }

    @Override
    public Address findById(Long id) {
        Optional<Address> optional=addressRepository.findById(id);
        Address address=null;
        if(optional.isPresent()){
            address=optional.get();
        }
        else {
            throw new RuntimeException("Addess not found for idNo:"+id);

        }
        return address;
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);


    }
}
