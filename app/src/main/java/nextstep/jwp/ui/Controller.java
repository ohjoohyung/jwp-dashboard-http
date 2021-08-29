package nextstep.jwp.ui;

import nextstep.jwp.ui.request.HttpRequest;
import nextstep.jwp.ui.response.HttpResponse;

import java.io.IOException;

public interface Controller {
    HttpResponse service(HttpRequest request) throws IOException;
}
