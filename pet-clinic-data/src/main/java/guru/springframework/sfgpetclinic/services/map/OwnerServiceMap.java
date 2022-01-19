package guru.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.OwnerService;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(),object);
	}


 
}
