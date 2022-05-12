package br.com.exemplo.feing.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class LimiteRegistrosExedido extends RuntimeException {

    public LimiteRegistrosExedido(String message) {
        super(message);
        log.error(message);
    }

}
