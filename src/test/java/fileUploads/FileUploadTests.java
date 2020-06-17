package fileUploads;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
    var uploadPage = homePage.clickFileUpload();
    uploadPage.uploadFile("C:\\Users\\wilson\\IdeaProjects\\SeleniumWebDriver_Java\\resources\\uploadTest.txt");
    assertEquals(uploadPage.getUploadedFile(), "uploadTest.txt", "upload error, files don't match");
    }

}
