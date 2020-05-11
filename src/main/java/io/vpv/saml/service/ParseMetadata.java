package io.vpv.saml.service;

import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.metadata.xml.modal.EntityDescriptorType;

import java.io.IOException;
import java.net.URL;


public interface ParseMetadata {
    IDPMetaData getIDPMetaData(URL url) throws IOException;
    EntityDescriptorType parse(URL url) throws IOException;
}
