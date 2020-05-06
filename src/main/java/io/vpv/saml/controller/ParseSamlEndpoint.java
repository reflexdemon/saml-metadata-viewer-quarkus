package io.vpv.saml.controller;


import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.service.ParseMetadata;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URL;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParseSamlEndpoint {

    @Inject
    ParseMetadata parseMetadata;

    @GET
    public IDPMetaData getIDPMetaData(@QueryParam("endpoint") String endpoint) throws IOException {
        URL url = new URL(endpoint);
        return parseMetadata.getIDPMetaData(url);
    }
}
