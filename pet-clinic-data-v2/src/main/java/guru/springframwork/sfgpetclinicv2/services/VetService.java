package guru.springframwork.sfgpetclinicv2.services;

import guru.springframwork.sfgpetclinicv2.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
