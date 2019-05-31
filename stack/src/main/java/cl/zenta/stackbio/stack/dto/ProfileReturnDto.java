package cl.zenta.stackbio.stack.dto;

import java.sql.Timestamp;

public class ProfileReturnDto {

	private String name;
	private String image;
	private String type_name;
	private Integer type_id;
	private String level_exp_name;
	private Integer level_id;
	private Timestamp created_at;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	
	public String getLevel_exp_name() {
		return level_exp_name;
	}
	public void setLevel_exp_name(String level_exp_name) {
		this.level_exp_name = level_exp_name;
	}
	
	public Integer getLevel_id() {
		return level_id;
	}
	public void setLevel_id(Integer level_id) {
		this.level_id = level_id;
	}
	
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
}
