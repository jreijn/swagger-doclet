package fixtures.responsemessages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * The ResponseModelResource represents a jaxrs resource for testing response messages
 * @version $Id$
 * @author conor.roche
 * @see fixtures.responsemessages.Response1
 * @see fixtures.responsemessages.Response2
 * @see fixtures.responsemessages.Response3
 * @defaultErrorType fixtures.responsemessages.Response2
 */
@Path("/responsemessages")
public class ResponseMessagesResource {

	/**
	 * @errorResponse 404 not found
	 */
	@GET
	public void swagger11() {
		// noop
	}

	/**
	 * @responseMessage 200 ok
	 * @responseMessage 404 not found `fixtures.responsemessages.Response1
	 */
	@GET
	public void swagger12() {
		// noop
	}

	/**
	 * @defaultErrorType fixtures.responsemessages.Response3
	 * @successCode 200|ok
	 * @errorCode 401|not authA
	 * @errorCode 401|-|not authB
	 * @errorCode 401|not_authC|If user not authenticated `fixtures.responsemessages.Response1
	 */
	@GET
	public void carma() {
		// noop
	}

}
