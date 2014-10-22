package com.baldurtech.contact;

import org.junit.Test;
import com.baldurtech.config.WebAppConfigurationAware;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class ContactControllerTest extends WebAppConfigurationAware {
    
    @Test
    public void 当URL为contact_list时应该访问list页面() throws Exception{
        mockMvc.perform(get("/contact/list"))
               .andExpect(view().name("contact/list"));
    }
}