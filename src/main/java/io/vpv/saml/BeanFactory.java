package io.vpv.saml;

import io.vpv.saml.metadata.service.MetaDataParser;
import io.vpv.saml.metadata.service.MetaDataParserImpl;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class BeanFactory {
    @Produces
    public MetaDataParser getMetaDataParser() {
        return new MetaDataParserImpl();
    }
}
