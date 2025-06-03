package quizz.library.common.Exception;

import lombok.Data;

@Data
public class AppException extends RuntimeException{
    ErrorCode errorCode;

    public AppException(ErrorCode e){
        super(e.getMessage());
        this.errorCode = e;
    }
}
