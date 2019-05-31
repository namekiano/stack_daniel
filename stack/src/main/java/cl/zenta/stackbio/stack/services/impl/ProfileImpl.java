package cl.zenta.stackbio.stack.services.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.zenta.stackbio.stack.dto.LibraryProfileCreateDto;
import cl.zenta.stackbio.stack.dto.ProfileReturnDto;
import cl.zenta.stackbio.stack.dto.ProfileSearchIdDto;
import cl.zenta.stackbio.stack.entities.LevelExperienceEntity;
import cl.zenta.stackbio.stack.entities.LibraryProfileEntity;
import cl.zenta.stackbio.stack.entities.ProfesionalProfileEntity;
import cl.zenta.stackbio.stack.entities.TypeProfileEntity;
import cl.zenta.stackbio.stack.exception.BusinessLogicException;
import cl.zenta.stackbio.stack.exception.DataNotValidException;
import cl.zenta.stackbio.stack.exception.DontExistException;
import cl.zenta.stackbio.stack.helper.MessageErrorHelper;
import cl.zenta.stackbio.stack.repositories.LevelExperienceRepository;
import cl.zenta.stackbio.stack.repositories.LibraryProfileRepository;
import cl.zenta.stackbio.stack.repositories.ProfesionalProfileRepository;
import cl.zenta.stackbio.stack.repositories.TypePerfilRepository;
import cl.zenta.stackbio.stack.services.service.ProfileService;

@Service
public class ProfileImpl implements ProfileService {
	
	@Autowired
    private  LibraryProfileRepository libraryRepo;
	
	@Autowired
	private LevelExperienceRepository levelExpRepo;
	
	@Autowired
	private TypePerfilRepository typeRepo;
	
	@Autowired
	private ProfesionalProfileRepository profesionalRepo;

	@Override
	@Transactional(rollbackFor = {BusinessLogicException.class, DontExistException.class})
	public LibraryProfileEntity createProfile(LibraryProfileCreateDto profileDto) throws Exception {
		
		if (profileDto.getId_type_profile() == null
			|| profileDto.getName_library_profile() == null ) {
			throw new DataNotValidException(MessageErrorHelper.dataValidationInvalid(null));
		}
		
		LocalDateTime time = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(time);
		
		LibraryProfileEntity profile = new LibraryProfileEntity();
		profile.setName(profileDto.getName_library_profile());
		profile.setId_type_profile(profileDto.getId_type_profile());
		profile.setCreated_at(timestamp);
		profile.setSoftdelete(0);
		
		LibraryProfileEntity libraryProfile = libraryRepo.save(profile);
		
		if (libraryProfile == null) {
			throw new BusinessLogicException(MessageErrorHelper.dataBaseException("No se pudo guardar el perfil en la Libreria de Perfiles"));
		}
		
		List<LevelExperienceEntity> listExp = levelExpRepo.findAllLevelExp();
		List<ProfesionalProfileEntity> listProProfile = new ArrayList<>();
		
		if (!listExp.isEmpty()) {
			listExp.forEach(
				(exp)-> {
					ProfesionalProfileEntity profesional = new ProfesionalProfileEntity();
					profesional.setId_library_profile(libraryProfile.getId());
					profesional.setId_level_experience(exp.getId());
					profesional.setSoftdelete(0);
					profesional.setCreated_at(timestamp);
					listProProfile.add(profesional);
				} 
			);
			
			profesionalRepo.saveAll(listProProfile);
		
		}else {
			throw new DontExistException(MessageErrorHelper.dontExistException());
		}
			
		return libraryProfile;	
	}

	@Override
	public ProfileReturnDto getProfileById(ProfileSearchIdDto profileID){
		
		ResultSet pro = profesionalRepo.getProfile(profileID.getId());
		/*LibraryProfileEntity library = libraryRepo.getOne(pro.getId_library_profile());
		LevelExperienceEntity experience = levelExpRepo.getOne(pro.getId_level_experience());
		TypeProfileEntity type = typeRepo.getOne(library.getId_type_profile());*/
		try {
			System.out.print(pro.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return null;
	}
	
	

}
