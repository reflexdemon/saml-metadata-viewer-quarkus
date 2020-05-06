package io.vpv.saml.service;

import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.metadata.service.MetaDataParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

@ApplicationScoped
public class ParseMetadataImpl implements ParseMetadata {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    private MetaDataParser metaDataParser;

    @Override
    public IDPMetaData getIDPMetaData(URL url) throws IOException {
        logger.info("Parsing {}", url);

        IDPMetaData metaData = metaDataParser.parseIDPMetaData(url);
        logger.info("metaData {}", metaData);
        return metaData;
    }
}
