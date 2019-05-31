package cl.zenta.stackbio.stack.helper;

public final class ConstantHelper {
	
	/** The Constant EMPTY. */
	public static final String EMPTY 							= "";

	/** The Constant BEARER. */
	public static final String BEARER 							= "Bearer ";

	/** The Constant SPACE. */
	public static final String SPACE 							= " ";

	/** The Constant URI_SPACE. */
	public static final String URI_SPACE 						= "%20";

	/** The Constant AUTHORIZATION. */
	public static final String AUTHORIZATION 					= "Authorization";

	public static final String DATE_FORMAT 						= "yyyy-MM-dd HH:mm:ss";

	public static final String PROVIDER_ID						= "providerId";

	public static final String ID								= "id";

	public static final String USERNAME							= "user";

	public static final String STACK_VERSION				    = "stackVersion";

	public static final String USER_STACK_VERSION				= "userStackVersion";

	public static final String STACK_TYPE						= "stackType";

	public static final String STACK_ACTIVE				        = "true";

	public static final String LAST_VERSION				        = "lastVersion";

	public static final String ROW				        		= "row";

	public static final String COLUMN				        	= "col";

	public static final String DISCIPLINE				        = "discipline";

	public static final String COMPONENT				        = "component";

	public static final String FIRST_VERSION				    = "v-1.0";

	public static final String FIRST_VERSION_DESCRIPTION		= "First version by user";

	public static final String TAG_TYPE		                    = "tagType";

	public static final String KIT_NUMBER				        = "kitNumber";

	public static final String KIT_TYPE				            = "kitType";


	/** Database Exception values. */
	public static final Integer KEY_INTERNAL_SERVER_EXCEPTION 	= -1;
	public static final String VAL_INTERNAL_SERVER_EXCEPTION 	= "InternalServerError";
	public static final String DSC_INTERNAL_SERVER_EXCEPTION 	= "An unwarranted error has occurred";

	/** Database Exception values. */
	public static final Integer KEY_DATABASE_EXCEPTION 			= -2;
	public static final String VAL_DATABASE_EXCEPTION 			= "DataBaseAccessException";
	public static final String DSC_DATABASE_EXCEPTION 			= "It is not possible to access the database at this time";

	/** Unauthorized values. */
	public static final Integer KEY_UNAUTHORIZED 				= -3;
	public static final String VAL_UNAUTHORIZED 				= "UNAUTHORIZED";
	public static final String DSC_UNAUTHORIZED_ONE 			= "Authorized header cant be empty or null";
	public static final String DSC_UNAUTHORIZED_TWO 			= "Bearer not found";
	public static final String DSC_UNAUTHORIZED_THREE 			= "Credential No Authorized bad Credential";
	public static final String DSC_UNAUTHORIZED_FOUR 			= "Token is expired";

	/** Entity already exist in database values. */
	public static final Integer KEY_ENTITY_ALREADY_EXIST 		= -6;
	public static final String VAL_ENTITY_ALREADY_EXIST 		= "EntityAlreadyExist";
	public static final String DSC_ENTITY_ALREADY_EXIST 		= "Entity alredy exist in database";
	public static final String DET_ENTITY_ALREADY_EXIST 		= "%s alredy exist in database, error to insert";

	/** Entity doesn't exist in database values. */
	public static final Integer KEY_ENTITY_DOESNT_EXIST 		= -7;
	public static final String VAL_ENTITY_DOESNT_EXIST 			= "Entity Dont Exist";
	public static final String DSC_ENTITY_DOESNT_EXIST 			= "Entity dont exist in database";
	public static final String DET_ENTITY_DOESNT_EXIST 			= "%s doesnt exist in database, error to delete";

	/** Paged Exception . */
	public static final Integer KEY_PAGED_EXCEPTION 			= -9;
	public static final String VAL_PAGED_EXCEPTION 				= "PagedException";
	public static final String DSC_PAGED_EXCEPTION 				= "Parameter of pages contains error";
	public static final String DET_PAGED_EXCEPTION 				= "Page must be greater than or equal to 0 and size must be greater than 0";

	/** Key's Constants. */
	public static final String KEY_MAP_INDEX             		= "id";
	public static final String KEY_MAP_VALUE             		= "value";
	public static final String KEY_MAP_DESCRIPTION         		= "description";
	public static final String KEY_MAP_DETAIL            		= "detail";

	/** Entity null pointer */
	public static final Integer KEY_ENTITY_NULL_POINTER			= -12;
	public static final String VAL_NULL_POINTER 			    = "NullPointerException";
	public static final String DSC_NULL_POINTER 			    = "Invalid Data";
	public static final String DET_NULL_POINTER			        = "Data in request is null";

	/** Entity data not valid */
	public static final Integer KEY_DATA_NOT_VALID			    = -16;
	public static final String VAL_DATA_NOT_VALID			    = "DataNotValidException";
	public static final String DSC_DATA_NOT_VALID			    = "Invalid Data";
	public static final String DET_DATA_NOT_VALID		        = "components do not have predominant knowledge or " +
												                  "have more than one ";
	public static final String DET_TAGS_NO_MANDATORY            = "The kit does not have the obligatory labels";

	/** Entity data not valid */
	public static final Integer KEY_INTERNAL_ERROR		        = -17;
	public static final String VAL_INTERNAL_ERROR			    = "InternalExceptionError";
	public static final String DSC_INTERNAL_ERROR		        = "Internal error";

	/**Invalid data request**/
	public static final Integer KEY_DATA_INVALID		    = -19;
	public static final String  VAL_DATA_INVALID			= "DataNotValidException";
	public static final String  DSC_DATA_INVALID			= "Invalid data";
	public static final String  DET_DATA_INVALID 		    = "invalid request data";


	/**Invalid data request**/
	public static final Integer KEY_DATA_NOT_PERMITTED		    = -20;
	public static final String  VAL_DATA_NOT_PERMITTED			= "DataNotPermittedException";
	public static final String  DSC_DATA_NOT_PERMITTED			= "some operations can not be carried out";
	public static final String  DET_DATA_NOT_PERMITTED 		    = "Not permitted ";




	/** The Constant EMPTY RESPONSE. */
	public static final String EMPTY_RESPONSE                   = "[]";

	/**
	 * Instantiates a new constants.
	 */
	private ConstantHelper() {
		super();
	}


}
