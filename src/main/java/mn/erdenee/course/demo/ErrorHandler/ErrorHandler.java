package mn.erdenee.course.demo.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


// i favorite superclass Exception more than other kind except definition
@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllException(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
