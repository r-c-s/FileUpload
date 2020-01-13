package imagerepo.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Set;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ImageTypeNotAllowedException extends RuntimeException {

    public ImageTypeNotAllowedException(String contentType, Set<String> allowedContentTypes) {
        super(String.format(
                "Content-type %s not allowed. Only the following content-types are allowed: %s",
                contentType,
                allowedContentTypes));
    }
}
