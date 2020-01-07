package app.reservation.api;

import app.reservation.api.user.CreateUserRequest;
import app.reservation.api.user.CreateUserResponse;
import app.reservation.api.user.UserView;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author kimi
 */
public interface UserWebService {
    @Path("/user")
    @POST
    @ResponseStatus(HTTPStatus.CREATED)
    CreateUserResponse create(CreateUserRequest request);

    @Path("/user/:id")
    @GET
    UserView get(@PathParam("id") Integer id);
}
