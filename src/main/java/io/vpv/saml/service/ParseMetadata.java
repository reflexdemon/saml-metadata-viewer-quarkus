package io.vpv.saml.service;

import io.vpv.saml.metadata.model.IDPMetaData;

import java.io.IOException;
import java.net.URL;


public interface ParseMetadata {
    IDPMetaData getIDPMetaData(URL url) throws IOException;
}
