package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.management.loading.PrivateClassLoader;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import com.adobe.aem.guides.wknd.core.models.AuthorBooks;
import com.adobe.aem.guides.wknd.core.services.DemoService;


@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = AuthorBooks.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorBooksImpl implements AuthorBooks{

    @Inject
    Resource componentResource;

    @ValueMapValue
    @Default(values = "AEM")
    private String authorname;

    @ValueMapValue
    private List<String> books;

@OSGiService
    DemoService demoService;

    @Override
    public String getAuthorName() {
        // TODO Auto-generated method stub
        return demoService.getPages();
    }

    @Override
    public List<String> getAuthorBooks() {
        // TODO Auto-generated method stub
        return books;
    }

    @Override
    public List<Map<String, String>> getBookDetailsWithMap() {
        List<Map<String,String>> bookDetailsMap = new ArrayList<>();
        try {
            Resource bookDetail=componentResource.getChild("bookdetailswithmap");
            if(bookDetail!=null){
                for (Resource book : bookDetail.getChildren()) {
                    Map<String,String> bookMap=new HashMap<>();
                    bookMap.put("bookname",book.getValueMap().get("bookname",String.class));
                    bookMap.put("booksubject",book.getValueMap().get("booksubject",String.class));
                    bookMap.put("publishyear",book.getValueMap().get("publishyear",String.class));
                    bookDetailsMap.add(bookMap);
                }
            }
        }catch (Exception e){
        }
        return bookDetailsMap;
    }

}
