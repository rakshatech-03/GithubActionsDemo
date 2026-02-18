package com.aem.geeks.core.models;


import com.adobe.cq.wcm.core.components.models.Title;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import lombok.experimental.Delegate;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.via.ResourceSuperType;

@Model(adaptables = SlingHttpServletRequest.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TitleExtend implements Title {


    @Delegate
    @Self
    @Via(type = ResourceSuperType.class)
    private Title title;

    @ValueMapValue
    private String subtitle;

    public String getSubtitle(){
        return  "Title Extend" + subtitle;
    }
}
