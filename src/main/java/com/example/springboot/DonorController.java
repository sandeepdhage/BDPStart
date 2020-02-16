package com.example.springboot;


import com.example.springboot.vos.Donor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/donors")
public class DonorController {

    @Autowired
    private DonorService service;

    @GetMapping("/{id}")
    public ResponseEntity<Donor> read(@PathVariable String id) {
        Donor donor = service.find(id);
        if (donor == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(donor);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Donor> create(@RequestBody Donor donor) throws URISyntaxException {
        Donor createDonor = service.create(donor);
        if (createDonor == null) {
            return ResponseEntity.notFound().build();
        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(createDonor.getId())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(createDonor);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Donor> update(@RequestBody Donor donor, @PathVariable Long id) {
        Donor updatedDonor = service.update(id, donor);
        if (updatedDonor == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(updatedDonor);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDonor(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
