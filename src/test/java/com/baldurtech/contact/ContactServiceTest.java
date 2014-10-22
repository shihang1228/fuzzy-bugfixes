package com.baldurtech.contact;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.Test;
import org.junit.Before;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;


public class ContactServiceTest {
    @Mock
    ContactRepository contactRepository;
    
    @InjectMocks
    ContactService contactService;
    
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void 在ContactService中应该调用ContactRepository的findAll方法() {
        contactService.findAll();
        verify(contactRepository).findAll();
    }
}