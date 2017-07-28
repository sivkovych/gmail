package com.tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobErrorsTest extends AbstractTest {
    @Test
    public void mobErrorTest() {
        MailCreatorPage mailCreatorPage = new MailCreatorPage();
        mailCreatorPage.mobError();
        Assert.assertEquals(mailCreatorPage.REC_PHONE_ERROR.getText(), mailCreatorPage.MOB_ERROR_EXP);
    }
}