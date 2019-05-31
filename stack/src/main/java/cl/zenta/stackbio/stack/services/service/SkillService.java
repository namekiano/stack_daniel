package cl.zenta.stackbio.stack.services.service;


import cl.zenta.stackbio.stack.dto.SkillCreateDto;
import cl.zenta.stackbio.stack.entities.Skill;

public interface SkillService {
	
	Iterable<Skill> findPagination ();
	
	Skill createSkill( SkillCreateDto skillDto );

}
