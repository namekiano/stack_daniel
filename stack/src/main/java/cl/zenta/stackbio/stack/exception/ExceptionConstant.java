package cl.zenta.stackbio.stack.exception;

public final class ExceptionConstant {

	/** Static messages custom. */
	public static final String IATA_NOT_FOUND = "[iata code cant be empty or null]";
	
	/** Database Exception values. */
	public static final Integer KEY_INTERNAL_SERVER_EXCEPTION = -1;
	public static final String VAL_INTERNAL_SERVER_EXCEPTION = "InternalServerError";
	public static final String DSC_INTERNAL_SERVER_EXCEPTION = "An unwarranted error has occurred";
	
	/** Database Exception values. */
	public static final Integer KEY_DATABASE_EXCEPTION = -2;
	public static final String VAL_DATABASE_EXCEPTION = "DataBaseAccessException";
	public static final String DSC_DATABASE_EXCEPTION = "It is not possible to access the database at this time";
	
	/** Unauthorized values. */
	public static final Integer KEY_UNAUTHORIZED = -3;
	public static final String VAL_UNAUTHORIZED = "UNAUTHORIZED";
	public static final String DSC_UNAUTHORIZED_ONE = "Authorized header cant be empty or null";
	public static final String DSC_UNAUTHORIZED_TWO = "Bearer not found";
	public static final String DSC_UNAUTHORIZED_THREE = "User No Authorized bad Credentials";
	public static final String DSC_UNAUTHORIZED_FOUR = "Token is expired";
	
	/** Illegal Parameters Exception values. */
	public static final Integer KEY_ILLEGAL_ARGUMENTS_EXCEPTION = -4;
	public static final String VAL_ILLEGAL_ARGUMENTS_EXCEPTION = "IllegalParamsException";
	public static final String DSC_ILLEGAL_ARGUMENTS_EXCEPTION_ONE = "Some parameters do not have the correct format, [id must be numeric]";
	
	/** Methods arguments not valid values. */
	public static final Integer KEY_METHOD_ARGS_NOT_VALID = -5;
	public static final String VAL_METHOD_ARGS_NOT_VALID = "MethodArgumentNotValid";
	public static final String DSC_METHOD_ARGS_NOT_VALID = "Request is invalid";
	
	/** Entity already exist in database values. */
	public static final Integer KEY_ENTITY_ALREADY_EXIST = -6;
	public static final String VAL_ENTITY_ALREADY_EXIST = "EntityAlreadyExist";
	public static final String DSC_ENTITY_ALREADY_EXIST = "Entity alredy exist in database";
	public static final String DET_ENTITY_ALREADY_EXIST = "%s alredy exist in database, error to save";
	
	/** Entity doesnt exist in database values. */
	public static final Integer KEY_ENTITY_DOESNT_EXIST = -7;
	public static final String VAL_ENTITY_DOESNT_EXIST = "EntityDoesn'tExist";
	public static final String DSC_ENTITY_DOESNT_EXIST 	= "Entity doesn't exist in database";

	/** Parameter Empty Exception . */
	public static final Integer KEY_PARAMETER_EMPTY_EXCEPTION = -8;
	public static final String VAL_PARAMETER_EMPTY_EXCEPTION = "ParameterEmptyException";
	public static final String DSC_PARAMETER_EMPTY_EXCEPTION = "Parameter cant be empty";
	public static final String DET_PARAMETER_EMPTY_EXCEPTION = "Entity %s filters parameter cant be empty";
	
	/**
	 * Instantiates a new constants.
	 */
	private ExceptionConstant() {
		super();
	}
	
}
