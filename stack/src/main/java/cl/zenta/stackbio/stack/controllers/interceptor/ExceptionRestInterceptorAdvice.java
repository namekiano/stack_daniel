package cl.zenta.stackbio.stack.controllers.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.Gson;

import cl.zenta.stackbio.stack.controllers.interceptor.ExceptionRestInterceptorAdvice;
import cl.zenta.stackbio.stack.exception.BusinessLogicException;
import cl.zenta.stackbio.stack.helper.MessageErrorHelper;

public class ExceptionRestInterceptorAdvice {
	
	private static Logger log = LoggerFactory.getLogger(ExceptionRestInterceptorAdvice.class);

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> HttpMessageHandler() {

        String msg = "ERROR EN LOS PARÁMETROS ENVIADOS A LA API.";
        log.warn(msg);

        return new ResponseEntity<>( MessageErrorHelper.dataRequestInvalid(msg), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> paramValidationHandler(MethodArgumentNotValidException exarg){

        String msg = "ERROR DE VALIDACIÓN EN LOS PARÁMETROS ENVIADOS A LA API";
        log.warn(msg);
        if(exarg.getBindingResult().getFieldErrors() != null) {
            log.info((new Gson().toJson(exarg.getBindingResult().getFieldErrors())));
        }

        return new ResponseEntity<>( MessageErrorHelper.dataValidationInvalid(exarg.getBindingResult().getFieldErrors()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception ex) {
        log.error("ERROR INTERNO: ", ex);
        return new ResponseEntity<>(MessageErrorHelper.internalError(ex), HttpStatus.OK);
    }


    @ExceptionHandler(BusinessLogicException.class)
    public ResponseEntity<String> logicaNegocioHandler(BusinessLogicException ex) {
        log.info("BUSINESS LOGIC EXCEPTION: ", ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.OK);
    }

}
