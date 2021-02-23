package guru.springframwork.sfgpetclinicv2.services;

import guru.springframwork.sfgpetclinicv2.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
