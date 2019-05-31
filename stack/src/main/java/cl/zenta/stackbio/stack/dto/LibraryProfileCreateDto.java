package cl.zenta.stackbio.stack.dto;

public class LibraryProfileCreateDto {
	
	private String name_library_profile;
	private Integer id_type_profile;
	
	public String getName_library_profile() {
		return name_library_profile;
	}
	public void setName_library_profile(String name_library_profile) {
		this.name_library_profile = name_library_profile;
	}
	public Integer getId_type_profile() {
		return id_type_profile;
	}
	public void setId_type_profile(Integer id_type_profile) {
		this.id_type_profile = id_type_profile;
	}
	
}
