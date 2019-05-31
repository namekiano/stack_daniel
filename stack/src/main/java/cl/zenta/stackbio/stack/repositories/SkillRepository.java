package cl.zenta.stackbio.stack.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import cl.zenta.stackbio.stack.entities.Skill;

public interface SkillRepository extends JpaRepository< Skill, Integer> {
	
	@Query(value="select * from skill \\n#pageable\\n", nativeQuery = true)
	Page<Skill> findAllSkillsPagination(Pageable pageable);
}
