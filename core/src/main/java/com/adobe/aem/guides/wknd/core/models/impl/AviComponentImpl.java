package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.AviComponent;

@Model(
    adaptables = SlingHttpServletRequest.class,
    adapters = AviComponent.class,
    resourceType = AviComponentImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AviComponentImpl implements AviComponent{

    protected static final String RESOURCE_TYPE = "wknd/components/avicomponent";

    @ValueMapValue
    private String title;

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
