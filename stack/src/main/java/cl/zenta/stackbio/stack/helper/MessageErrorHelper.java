package cl.zenta.stackbio.stack.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.google.gson.GsonBuilder;

import cl.zenta.stackbio.stack.helper.*;

public final class MessageErrorHelper {
	
	/**
     * Instantiates a new message error helper.
     */
    private MessageErrorHelper(){
        super();
    }

    /**
     * Token id validation exception.
     *
     * @param detail      the detail
     * @param description the description
     * @return the response entity
     */
    public static final String tokenIdValidationException(String detail, String description) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_UNAUTHORIZED);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_UNAUTHORIZED);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, description);
        error.put(ConstantHelper.KEY_MAP_DETAIL, (null != detail ? detail : description) );
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    /**
     * Paged exception.
     *
     * @return the response entity
     */
    public static final String pagedException() {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_PAGED_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_PAGED_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_PAGED_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_DETAIL, ConstantHelper.DET_PAGED_EXCEPTION);
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    /**
     * Already exist exception.
     *
     * @param name the name
     * @return the string
     */
    public static final String alreadyExistException(String name) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_ENTITY_ALREADY_EXIST);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_ENTITY_ALREADY_EXIST);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_ENTITY_ALREADY_EXIST);
        error.put(ConstantHelper.KEY_MAP_DETAIL, String.format(ConstantHelper.DET_ENTITY_ALREADY_EXIST, name));
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    /**
     * Dont exist exception.
     *
     * @param name the name
     * @return the string
     */
    public static final String dontExistException(String name) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_ENTITY_DOESNT_EXIST);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_ENTITY_DOESNT_EXIST);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_ENTITY_DOESNT_EXIST);
        error.put(ConstantHelper.KEY_MAP_DETAIL, String.format(ConstantHelper.DET_ENTITY_DOESNT_EXIST, name));
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String dontExistException() {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_ENTITY_DOESNT_EXIST);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_ENTITY_DOESNT_EXIST);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_ENTITY_DOESNT_EXIST);
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String nullPointerException() {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_ENTITY_NULL_POINTER);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_NULL_POINTER);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_NULL_POINTER);
        error.put(ConstantHelper.KEY_MAP_DETAIL, ConstantHelper.DET_NULL_POINTER);
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String notComponentCover() {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_DETAIL, ConstantHelper.DET_DATA_NOT_VALID);
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String notTagsMandatory() {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATA_NOT_VALID);
        error.put(ConstantHelper.KEY_MAP_DETAIL, ConstantHelper.DET_TAGS_NO_MANDATORY);
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String internalError(Exception exception) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_INTERNAL_ERROR);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_INTERNAL_ERROR);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, exception.getMessage());
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String dataRequestInvalid(String message) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATA_INVALID);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATA_INVALID);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATA_INVALID);
        error.put(ConstantHelper.KEY_MAP_DETAIL, (null != message ? message : ConstantHelper.EMPTY) );
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String dataValidationInvalid(List<?> fieldErrors ) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATA_INVALID);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATA_INVALID);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATA_INVALID);
        error.put("ValidationsFailed", (null != fieldErrors ? fieldErrors : new ArrayList<>()) );
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }


    public static final String dataBaseException(String message) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATABASE_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATABASE_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATABASE_EXCEPTION);
        error.put(ConstantHelper.KEY_MAP_DETAIL, (null != message ? message : ConstantHelper.EMPTY) );
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

    public static final String dataNotPermittedException(String message) {
        HashMap<String, Object> error = new LinkedHashMap<>();
        error.put(ConstantHelper.KEY_MAP_INDEX, ConstantHelper.KEY_DATA_NOT_PERMITTED);
        error.put(ConstantHelper.KEY_MAP_VALUE, ConstantHelper.VAL_DATA_NOT_PERMITTED);
        error.put(ConstantHelper.KEY_MAP_DESCRIPTION, ConstantHelper.DSC_DATA_NOT_PERMITTED);
        error.put(ConstantHelper.KEY_MAP_DETAIL, (null != message ? message : ConstantHelper.EMPTY) );
        return new GsonBuilder().setPrettyPrinting().create().toJson(error);
    }

}
