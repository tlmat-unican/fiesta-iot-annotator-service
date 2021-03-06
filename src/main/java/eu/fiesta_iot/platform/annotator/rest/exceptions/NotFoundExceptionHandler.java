/*******************************************************************************
 * Copyright (c) 2018 Jorge Lanza, 
 *                    David Gomez, 
 *                    Luis Sanchez,
 *                    Juan Ramon Santana
 *
 * For the full copyright and license information, please view the LICENSE
 * file that is distributed with this source code.
 *******************************************************************************/
package eu.fiesta_iot.platform.annotator.rest.exceptions;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionHandler
        implements ExceptionMapper<NotFoundException> {

	@Context
	private HttpHeaders headers;

	public Response toResponse(NotFoundException ex) {
		return ex.getResponse();
//		return Response.status(Status.NOT_FOUND).entity(ex.getMessage())
//		        .type(getAcceptType()).build();
	}

//	private String getAcceptType() {
//		List<MediaType> accepts = headers.getAcceptableMediaTypes();
//		if (accepts != null && accepts.size() > 0) {
//			// choose one
//			return "application/json";
//		} else {
//			// return a default one like application/json
//			return "application/json";
//		}
//	}
}