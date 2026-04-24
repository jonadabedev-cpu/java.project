package santader.aplicacao.controller.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class) // ✅ Exceção especificada
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException businessException) { // ✅ Recebe a exceção
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY); // ✅ Retorno correto
    }

     @ExceptionHandler(NoSuchElementException.class) // ✅ Para quando não achar o usuário
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("Resourcer ID not foud.", HttpStatus.NOT_FOUND);
    }

}
