package cl.zenta.stackbio.stack.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.zenta.stackbio.stack.dto.SkillCreateDto;
import cl.zenta.stackbio.stack.entities.Skill;
import cl.zenta.stackbio.stack.services.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;


@RequestMapping(path="/skill")
@RestController
@Api(value = "/skill", description = "Maneja CRUD de skill")
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@GetMapping(path="/get")
	public Iterable<Skill> getSkill() {
		
		Iterable<Skill> lista = skillService.findPagination();
		return lista;
	}
	
	@PutMapping(path="/create")
	public Skill createSkill(
			@ApiParam("JSON con los campos necesarios para crear una Skill.")
            @Valid @RequestBody SkillCreateDto skillDto
	){
		
		Skill skill = skillService.createSkill(skillDto);
		return skill;
	}

}
