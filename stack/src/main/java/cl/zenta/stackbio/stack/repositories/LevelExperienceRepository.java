package cl.zenta.stackbio.stack.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.zenta.stackbio.stack.entities.LevelExperienceEntity;

public interface LevelExperienceRepository extends JpaRepository<LevelExperienceEntity, Integer>{

	@Query(value="Select n.* from stackbio.level_experience n where n.softdelete = 0", nativeQuery=true)
	List<LevelExperienceEntity> findAllLevelExp();
}
