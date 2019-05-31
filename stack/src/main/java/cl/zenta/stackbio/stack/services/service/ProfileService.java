package cl.zenta.stackbio.stack.services.service;

import java.sql.SQLException;

import cl.zenta.stackbio.stack.dto.LibraryProfileCreateDto;
import cl.zenta.stackbio.stack.dto.ProfileReturnDto;
import cl.zenta.stackbio.stack.dto.ProfileSearchIdDto;
import cl.zenta.stackbio.stack.entities.LibraryProfileEntity;

public interface ProfileService {

	LibraryProfileEntity createProfile (LibraryProfileCreateDto profileDto) throws Exception;
	
	ProfileReturnDto getProfileById (ProfileSearchIdDto profileID);
	
}
