package cl.zenta.stackbio.stack.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.zenta.stackbio.stack.entities.TypeProfileEntity;

public interface TypePerfilRepository extends JpaRepository<TypeProfileEntity, Integer>{

	@Query(nativeQuery=true, value = "Select t from type_profile t where t.softdelete = 0")
	List<TypeProfileEntity> findAllTypesProfiles();
	
}
