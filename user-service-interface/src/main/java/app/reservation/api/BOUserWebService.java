package app.reservation.api;

import app.reservation.api.user.BOSearchUserRequest;
import app.reservation.api.user.BOSearchUserResponse;
import app.reservation.api.user.BOUpdateUserRequest;
import app.reservation.api.user.BOUpdateUserResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author kimi
 */
public interface BOUserWebService {
    @Path("/user/:id")
    @PUT
    BOUpdateUserResponse update(@PathParam("id") Integer id, BOUpdateUserRequest request);

    @Path("/user")
    @GET
    BOSearchUserResponse search(BOSearchUserRequest request);
}
