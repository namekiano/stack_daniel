package cl.zenta.stackbio.stack.services.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cl.zenta.stackbio.stack.dto.SkillCreateDto;
import cl.zenta.stackbio.stack.entities.Skill;
import cl.zenta.stackbio.stack.repositories.SkillRepository;
import cl.zenta.stackbio.stack.services.service.SkillService;
import cl.zenta.stackbio.stack.exception.BusinessLogicException;

@Service
public class SkillImpl implements SkillService {
	
	@Autowired
    private  SkillRepository skillRepo;

	@Override
	public Iterable<Skill> findPagination() {
		
		Pageable firstPageWithTwoElements = PageRequest.of(6, 10);
		Page<Skill> lista = skillRepo.findAll(firstPageWithTwoElements);
		return lista;
	}

	@Override
	public Skill createSkill(SkillCreateDto skillDto) {
		
		if (skillDto.getName() == null 
			|| skillDto.getImage() == null) {
			throw new BusinessLogicException("Parametro phone es requerido");
		}
		
		LocalDateTime time = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(time);
		
		Skill skill = new Skill();
		skill.setName("skill 1");
		skill.setImage("image 1");
		skill.setDescription("descripcion 1");
		skill.setSoftdelete(0);
		skill.setCreated_at(timestamp);
		Skill skill_create = skillRepo.save(skill);
		return skill_create;
	}
	
	
}
