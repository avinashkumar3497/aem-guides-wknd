package com.adobe.aem.guides.wknd.core.models;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.models.DemoModell;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class DemoModell{
    //private static final Logger LOG = LoggerFactory.getLogger(DemoModel.class);

    @ValueMapValue
    private String title ;
    
    public String getTitle() {
        return title;
    }

}
