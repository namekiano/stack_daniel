package cl.zenta.stackbio.stack.repositories;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.zenta.stackbio.stack.entities.ProfesionalProfileEntity;

public interface ProfesionalProfileRepository extends JpaRepository<ProfesionalProfileEntity, Integer>{

	@Query (nativeQuery=true, value="Select p.*,l.name from stackbio.professional_profile p inner join stackbio.library_profile l on p.id_library_profile = l.id where p.id = ?1")
	ResultSet getProfile(@Param("id") Integer id);
}
