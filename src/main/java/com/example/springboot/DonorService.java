package com.example.springboot;

import com.example.springboot.vos.Donor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class DonorService {

    public Donor find(String id) {
        Donor donor = new Donor();
        donor.setAddress("Test Address");
        donor.setEmail("Test@email.com");
        donor.setId(id);
        donor.setName("Sandeep");
        return donor;
    }

    public Donor create(Donor donor) {
        return donor;
    }

    public Donor update(Long id, Donor donor) {
        return donor;
    }


    public void delete(Long id) {

        return ;
    }
}
