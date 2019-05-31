package cl.zenta.stackbio.stack.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.zenta.stackbio.stack.dto.LibraryProfileCreateDto;
import cl.zenta.stackbio.stack.dto.ProfileSearchIdDto;
import cl.zenta.stackbio.stack.entities.LibraryProfileEntity;
import cl.zenta.stackbio.stack.exception.BusinessLogicException;
import cl.zenta.stackbio.stack.exception.DataNotValidException;
import cl.zenta.stackbio.stack.exception.DontExistException;
import cl.zenta.stackbio.stack.services.service.ProfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RequestMapping(path="/libraryProfile")
@RestController
@Api(value = "/libraryProfile", description = "Maneja CRUD de Libreria de Perfiles")
public class ProfilesController {
	
	@Autowired
	private ProfileService profileService;
	
	@PutMapping(path="/create")
	public ResponseEntity<String> createLibraryProfile(
			@ApiParam("JSON con los campos necesarios para crear una Pefil de Biblioteca.")
            @Valid @RequestBody LibraryProfileCreateDto profileDto
		) {
		
		ResponseEntity<String> response = null;
		
		try {
			LibraryProfileEntity profile =  profileService.createProfile(profileDto);
			response = ResponseEntity.ok(profile.toString());
		}catch(BusinessLogicException ex) {
			response = ResponseEntity.ok(ex.getMessage());
			ex.printStackTrace();
		}catch(DontExistException ex) {
			response = ResponseEntity.ok(ex.getMessage());
			ex.printStackTrace();
		} catch(DataNotValidException ex) {
			response = ResponseEntity.ok(ex.getMessage());
			ex.printStackTrace();
		}catch (Exception e) {
			response = ResponseEntity.ok(e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@PutMapping(path="/getbyid")
	public ResponseEntity<String> getProfileById(
		@ApiParam("JSON con los campos necesarios para crear una Pefil de Biblioteca.")
        @Valid @RequestBody ProfileSearchIdDto profileSearchDto
	){
		
		ResponseEntity<String> response = null;
		
		profileService.getProfileById(profileSearchDto);
		
		return null;
	}

}
