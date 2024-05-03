package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.EditUserProfilePage;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.io.IOException;

public class EditUserProfileTest extends BaseClass {
    WebDriver driver;
    @BeforeMethod
    public void openApplication() throws IOException {

        driver = initializeDriver();
        logger.info("Browser got launched");
        driver.get(prop.getProperty("url"));
        logger.info("browser opened successfully");
    }

    @AfterMethod
    public void closure()
    {
        driver.close();
        logger.info("browser closed successfully");
    }

    @Test
    public void editUserProfile() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        logger.info("successfully landed to loginpage");
        loginPage.getEmail().sendKeys(prop.getProperty("email"));
        logger.info("email entered successfully");
        loginPage.getPassword().sendKeys(prop.getProperty("password"));
        logger.info("password entered successfully");
        loginPage.getLoginButton().click();
        logger.info("login button clicked succesfully");
        loginPage.getAccountverification().isDisplayed();
        logger.info("Account verified successfully");

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getProfileDropdownmenu().click();

        EditUserProfilePage editUserProfilePage = new EditUserProfilePage(driver);
       editUserProfilePage.getEditprofile().click();

       editUserProfilePage.getYourMembership().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");

        editUserProfilePage.getAS_soon_As_new_buylead_posted().click();
        editUserProfilePage.getConfirmationPopup().click();

        editUserProfilePage.getOnceEveryDay().click();
        editUserProfilePage.getConfirmationPopup().click();

        editUserProfilePage.getOnceInEveryWeek().click();
        editUserProfilePage.getConfirmationPopup().click();

        editUserProfilePage.getOnceINEveryMonth().click();
        editUserProfilePage.getConfirmationPopup().click();


        editUserProfilePage.getProfileUrl().click();
        Assert.assertEquals("Established in the year 2017, Arun & Co. deals in : Export of Rice, wheat, vegetable oils, edible oils, coconut oils.","Established in the year 2017, Arun & Co. deals in : Export of Rice, wheat, vegetable oils, edible oils, coconut oils.");
        driver.navigate().back();

        js.executeScript("window.scrollBy(0,200)", "");


        Select DocumentsCategory = new Select(editUserProfilePage.getSelectDocumentsCategory());

        DocumentsCategory.selectByVisibleText("Identity Proof Of Representative");
        Assert.assertEquals("Identity Proof","Identity Proof");
        logger.info("identity proof in the Documents category selected successfully");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Passport","Passport");


        DocumentsCategory.selectByVisibleText("Company Registration Certificate");
        Assert.assertEquals("Company Registration","Company Registration");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Gas Bill","Gas Bill");

        DocumentsCategory.selectByVisibleText("Company Address Proof");
        Assert.assertEquals("Company Address","Company Address");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Bank Statement","Bank Statement");

        DocumentsCategory.selectByVisibleText("Trading License");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Trading License","Trading License");

        DocumentsCategory.selectByVisibleText("Proof of Prior Export/Import");
        Assert.assertEquals("Proof of","Proof of");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Airway Bill","Airway Bill");

        DocumentsCategory.selectByVisibleText("Proof of Product");
        Assert.assertEquals("Proof of Product","Proof of Product");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Airway Bill","Airway Bill");

        DocumentsCategory.selectByVisibleText("Other Documents like Mandates and Certifications");
        Assert.assertEquals("Other Documents","Other Documents");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Work Permit","Work Permit");

        // uploading first document
        DocumentsCategory.selectByVisibleText("Identity Proof Of Representative");
        Assert.assertEquals("Identity Proof","Identity Proof");
        logger.info("identity proof in the Documents category selected successfully");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Passport","Passport");


        Select DocumentsName = new Select(editUserProfilePage.getSelectDocumentsName());
        DocumentsName.selectByVisibleText("ID Proof");


        String imagepath = System.getProperty("user.dir");

        editUserProfilePage.getChooseFilesToUpload().sendKeys(imagepath+"\\DocumentsToUpload\\adharcard.png");
       // Thread.sleep(5000);
        Assert.assertEquals("adharcard.png","adharcard.png");
        logger.info("document uploaded successfully");

        editUserProfilePage.getAddUploadedDocument().click();

        Thread.sleep(3000);
        Assert.assertEquals("Aadhar Card","Aadhar Card");
        logger.info("document is listed in the profile successfully");





        // uploading second document
        DocumentsCategory.selectByVisibleText("Trading License");
        logger.info("Document category Trading license selected successfully");
        editUserProfilePage.getSelectDocumentsName().click();
        Assert.assertEquals("Trading License","Trading License");
        DocumentsName.selectByVisibleText("Trading License");
        logger.info("Document Name Trading license selected successfully");

        editUserProfilePage.getChooseFilesToUpload().sendKeys(imagepath+"\\DocumentsToUpload\\adharcard.png");
        logger.info("choose files to upload functionality selected succesfully");
        Assert.assertEquals("adharcard.png","adharcard.png");
        logger.info("document uploaded successfully");

        editUserProfilePage.getAddUploadedDocument().click();
        logger.info("click on add document functionality clicked successfully");
        Thread.sleep(3000);


        Assert.assertEquals("Trading License","Trading License");
        logger.info("document is listed in the profile successfully");

         // downloading document 1
        editUserProfilePage.getDownloadDocument1().click();
        logger.info("document 1 downloaded sucessfully");
        Thread.sleep(4000);
        // downloading documnet 2
        editUserProfilePage.getDownloadDocument2().click();
        logger.info("document 2 downloaded sucessfully");
        Thread.sleep(4000);

        // deleting document 1
        editUserProfilePage.getDeleteDocument1().click();
        editUserProfilePage.getConfirmationToDelete().click();
        logger.info("Document 1 deleted successfully");
        Thread.sleep(5000);

        //delete document 2
        editUserProfilePage.getDeleteDocument1().click();
        editUserProfilePage.getConfirmationToDelete().click();
        logger.info("Document 2 deleted successfully");




         // verification of company details page
        driver.navigate().to("https://www.go4worldbusiness.com/member/console/edit");
        editUserProfilePage.getCompany().click();
        Assert.assertEquals("About - Arun & Co. - Test Profile From Go4worldbusiness.com - Do Not Contact!","About - Arun & Co. - Test Profile From Go4worldbusiness.com - Do Not Contact!");
        logger.info("successfully landed to company details page");

        editUserProfilePage.getCompanyDetailsofSupplier().sendKeys("hello hello hello hello hello hello");
        logger.info("I am supplier of field filled successfully");

        editUserProfilePage.getCompanyDetailsofBuyers().sendKeys("hello hello hello hello hello hello");
        logger.info("I am buyer of field filled successfully");

        js.executeScript("window.scrollBy(0,400)", "");

        editUserProfilePage.getTradeServicesTextBox().sendKeys("hello hello hello hello hello hello");
        logger.info("Trade services of field filled successfully");

        editUserProfilePage.getPrimaryservicesSelect().click();
        Assert.assertEquals("Buying Agent","Buying Agent");
        logger.info("primary services dropdown showing menu successfully");

        editUserProfilePage.getAnnualSalesSelect().click();
        Assert.assertEquals("Not Known","Not Known");
        logger.info("Approx annual sales dropdown showing menu successfully");

        editUserProfilePage.getEstablishmentYear().sendKeys("2003");
        logger.info("year of establishment field accepting the numbers successfully");
        js.executeScript("window.scrollBy(0,400)", "");

        editUserProfilePage.getCompanyCertificatins().sendKeys("iso989");
        logger.info("field for company certifications accepting the characters successfully");

        editUserProfilePage.getNameField().sendKeys("abc");
        logger.info("name field accepting characters successfully");

        editUserProfilePage.getDesignationField().sendKeys("ceo");
        logger.info("Designation field accepting characters successfully");

        editUserProfilePage.getAddressField().sendKeys("abcdef");
        logger.info("Address field accepting the characters successfully");

        editUserProfilePage.getCityNameField().sendKeys("okinava");
        logger.info("city field accepting characters successfully");

        editUserProfilePage.getPostCodeField().sendKeys("22112");
        logger.info("postal code field accepting the characrters successfully");

        editUserProfilePage.getStateNameField().sendKeys("hiroshima");
        logger.info("state name field accepting the characters successfully");
        js.executeScript("window.scrollBy(0,400)", "");

        editUserProfilePage.getEmailField().sendKeys("xyc@gmail.com");
        logger.info("email field accepting the characters successfully");


        editUserProfilePage.getPhoneNumField().sendKeys("97077998");
        logger.info("phone number field accepting the characters successfully");

        editUserProfilePage.getHomepageField().sendKeys("hello");
        logger.info("homepage field accepting the characters successfully");

        editUserProfilePage.getSubmitCompanyPage().click();
        logger.info("details in the company page filled and clicked on next successfully");

        editUserProfilePage.getConfiramtionForCompanyPAGE().click();
        logger.info("details entered in the company page saved successfully");

        logger.info("editing in company page working successfully");

        //verification of Hompepage
     driver.navigate().to("https://www.go4worldbusiness.com/member/console/edit/homepage");
        editUserProfilePage.getUploadCompanyLogo().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        logger.info("image for company logo selected successfully");
        js.executeScript("window.scrollBy(0,400)", "");
        editUserProfilePage.getSaveNuploadCompanyLogo().click();
        logger.info("company logo uploaded successfully");

        editUserProfilePage.getFirstParaAboutCompany().sendKeys("hello hello hello hello hello hello");
        logger.info("first paragraph for company details is accepting characters sucessfully");

        editUserProfilePage.getUploadImage1().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        logger.info("image 1 for product selected successfully");

        editUserProfilePage.getSaveNuploadImage1().click();
        logger.info("image 1 for product uploaded successfully");

        js.executeScript("window.scrollBy(0,200)", "");

        editUserProfilePage.getUploadImage2().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        logger.info("image 2 for product selected successfully");

        editUserProfilePage.getSaveNuploadImage2().click();
        logger.info("image 2 uploaded successfully");

        js.executeScript("window.scrollBy(0,200)", "");

        editUserProfilePage.getSubmitHomepage().click();
        editUserProfilePage.getConfirmationForHomepage().click();
        logger.info("Homepage edited and submitted successfully");
        logger.info("Editing members details inside homepage working fine");

        // Products Page verification

        driver.get("https://www.go4worldbusiness.com/member/console/edit/manageproducts");
        logger.info("successfully landed to product page");

        editUserProfilePage.getAddnewProduct().click();
        logger.info("successfully landed to 'adding new products page'");

        editUserProfilePage.getNameofProduct().sendKeys("Apple");
        logger.info("name of the product entered successsfully");

        editUserProfilePage.getpriceofProduct().sendKeys("100usd");
        logger.info("price of the product entered successfully");

        editUserProfilePage.getDescriptionOfProduct().sendKeys("hello hello hello hello hello hello hello hello hello");
        logger.info("description of the product described successfully");

        js.executeScript("window.scrollBy(0,600)", "");
        //String imagepath = System.getProperty("user.dir");

       // editUserProfilePage.getAddProductImage().click();

       // editUserProfilePage.getUploadImageOfProduct().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
       // logger.info("image of the product uploaded successfully");

       // editUserProfilePage.getSaveAndUploadImageOfProduct().click();
      //  logger.info("image of the product uploaded successfully");

        js.executeScript("window.scrollBy(0,200)", "");

        editUserProfilePage.getMinimumOrderQuantity().sendKeys("1000");
        logger.info("successfully entered inside minimum order field ");

        Select Unit = new Select(editUserProfilePage.getUnit());
        Unit.selectByVisibleText("Boxes");
        logger.info("unit selected successfully");

        Select Countries = new Select(editUserProfilePage.getCountryWhereProductmanufactured());
        Countries.selectByVisibleText("Albania");
        logger.info("country selected where product manufactured");

        editUserProfilePage.getPackagingDetails().sendKeys("hello");
        logger.info("packaging details entered successfully");

        editUserProfilePage.getProductionCapacity().sendKeys("hello hello hello");
        logger.info("production capacity entered successfully");

        editUserProfilePage.getSampleAvailable().click();
        logger.info("'sample available' field selected successfully");

        editUserProfilePage.getSampleCostBornBy().click();
        logger.info("'sample cost born by' field selected successfully");

        js.executeScript("window.scrollBy(0,200)", "");
        editUserProfilePage.getSellerProductCode().sendKeys("12345");
        logger.info("seller product code field entered successfully");

        editUserProfilePage.getProductsStandards().sendKeys("hello");
        logger.info("product standard field entered successfully");

        editUserProfilePage.getBrand().sendKeys("hello");
        logger.info("brand name entered successfully");

        editUserProfilePage.getModelNumber().sendKeys("1000");
        logger.info("model number entered successfully");

        editUserProfilePage.getHScode().sendKeys("2234234");
        logger.info("HS code entered successfully");

        editUserProfilePage.getKeySpecification1().sendKeys("hello");
        editUserProfilePage.getKeySpecification2().sendKeys("hello");
        editUserProfilePage.getKeySpecification3().sendKeys("hello");
        editUserProfilePage.getKeySpecification4().sendKeys("hello");
        editUserProfilePage.getKeySpecification5().sendKeys("hello");
        editUserProfilePage.getKeySpecification6().sendKeys("hello");
        editUserProfilePage.getKeySpecification7().sendKeys("hello");
        editUserProfilePage.getKeySpecification8().sendKeys("hello");
        logger.info("key specification fields are filled succesfully");

        editUserProfilePage.getSubmitProductPage().click();
        logger.info("submit product page successfully");
        editUserProfilePage.getConfirmationOFproductPage().click();

        logger.info("editing and submission inside product page working fine");


        //Buy requirements page verification
        driver.get("https://www.go4worldbusiness.com/buyer-dashboard/");
        Assert.assertEquals("Dashboard","Dashboard");
        logger.info("successfully landed to dashboard");
        driver.navigate().back();
        logger.info("Buy requirement page working fine");


        // Management page verification
        driver.get("https://www.go4worldbusiness.com/member/console/edit/management");
        editUserProfilePage.getManagementPage().click();
        logger.info("successfully landed to the management page ");

        editUserProfilePage.getPara1ManagementPage().sendKeys("hello hello hello hello hello hello");
        logger.info("text entered in the paragraph 1 successfully");
        js.executeScript("window.scrollBy(0,400)", "");

        editUserProfilePage.getPara2ManagementPage().sendKeys("hello hello hello hello hello hello");
        logger.info("text entered in the paragraph 2 successfully");



        editUserProfilePage.getUploadimageinManagementpage().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        editUserProfilePage.getSaveNUploadimageinManagementpage().click();
        logger.info("image 1 in the management page uploaded succesfully");
        js.executeScript("window.scrollBy(0,300)", "");

        editUserProfilePage.getUploadimageinManagementpage2().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        editUserProfilePage.getSaveNUploadimageinManagementpage2().click();
        logger.info("image 2 in the management page uploaded succesfully");

        editUserProfilePage.getUploadimageinManagementpage3().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        editUserProfilePage.getSaveNUploadimageinManagementpage3().click();
        logger.info("image 3 in the management page uploaded succesfully");



        editUserProfilePage.getPara3ManagementPage().sendKeys("hello hello hello hello hello hello");
        logger.info("text entered in the paragraph 3 successfully");

        editUserProfilePage.getPara4ManagementPage().sendKeys("hello hello hello hello hello hello");
        logger.info("text entered in the paragraph 4 successfully");

        editUserProfilePage.getSubmitManagementPage().click();
        editUserProfilePage.getConfirmationManagementPage().click();
        logger.info("editing and submission of management page working fine");

        logger.info("management page working fine");

        // Facilities page verification
        driver.get("https://www.go4worldbusiness.com/member/console/edit/facilities");
        editUserProfilePage.getFacilitiesPage().click();
        logger.info("successfully landed to facilities page");

        editUserProfilePage.getQualityControl().click();
        logger.info("quality control radio button working fine");

        Select prouctiontype = new Select(editUserProfilePage.getProductionType());
        prouctiontype.selectByVisibleText("Leased");
        logger.info("production type dropdown menu working fine");

        editUserProfilePage.getProductionLines().sendKeys("4");
        logger.info("production lines field working fine");

        editUserProfilePage.getOEM().click();
        logger.info("oem radiobutton working fine");

        Select investmenyOnmanufacturing = new Select(editUserProfilePage.getInvestmentOnManufacturing());
        investmenyOnmanufacturing.selectByVisibleText("Not Known");
        logger.info("dropdown investment on manufacturing working fine");

        js.executeScript("window.scrollBy(0,300)", "");

        Select percentageOfrevenueInvested = new Select(editUserProfilePage.getPercentageOfrevenueInvested());
        percentageOfrevenueInvested.selectByVisibleText("6 to 20%");
        logger.info("dropdown percentage invested in company working fine");

        Select totalstaff =new Select(editUserProfilePage.getTotalStaff());
        totalstaff.selectByVisibleText("0 to 10");
        logger.info("total staff dropdown working fine");

        Select StaffProduction = new Select(editUserProfilePage.getStaffProduction());
        StaffProduction.selectByVisibleText("11 to 25");
        logger.info("Staff production dropdown working fine");

        Select StaffQualityControl = new Select(editUserProfilePage.getStaffQualityControl());
        StaffQualityControl.selectByVisibleText("0 to 10");
        logger.info("Staff quality control dropdown working fine");

        Select StaffRND = new Select(editUserProfilePage.getStaffRND());
        StaffRND.selectByVisibleText("0 to 10");
        logger.info("Staff R&D dropdown working fine");

        Select StaffSalesNmarketing = new Select(editUserProfilePage.getStaffSalesNmarketing());
        StaffSalesNmarketing.selectByVisibleText("0 to 10");
        logger.info("Staff Sales and marketing dropdown working fine");

        Select Staffengineering = new Select(editUserProfilePage.getStaffengineering());
        Staffengineering.selectByVisibleText("0 to 10");
        logger.info("Staff Sales engineering dropdown working fine");

        js.executeScript("window.scrollBy(0,500)", "");

        editUserProfilePage.getFacilitiesSiteDescription().sendKeys("hello hello hello hello hello hello");
        logger.info("facilities site description box filled successfully");

        editUserProfilePage.getUploadImageInFacilitiesPage().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
        editUserProfilePage.getSaveNUploadImageInFacilitiesPage().click();
        logger.info("image under facilities page uploaded successfully");

        editUserProfilePage.getMachineryNproducion().sendKeys("hello hello hello hello hello hello");
        logger.info("Machinery and production field entered successfully");

        editUserProfilePage.getMaterialsNcomponents().sendKeys("hello hello hello hello hello hello");
        logger.info("materials and components field entered successfully");

        editUserProfilePage.getSubmitFacilitiesPage().click();
        editUserProfilePage.getConfirmationFacilitiesPage().click();
        logger.info("facilities page working fine");


        //newsroom page verification

     editUserProfilePage.getNewsroom().click();
     logger.info("landed to news room successfully");

     editUserProfilePage.getFirstparaInNewsRoom().sendKeys("hello hello hello hello hello hello");
     logger.info("first para filled successfully");
     editUserProfilePage.getSecondparaInNewsRoom().sendKeys("hello hello hello hello hello hello");
     logger.info("second para filled successfully successfully");
     js.executeScript("window.scrollBy(0,100)", "");

     editUserProfilePage.getThirdParaAboutCompany().sendKeys("hello hello hello hello hello hello");
     logger.info("third para filled successfully successfully");
     editUserProfilePage.getUploadImageInnewRoomPage1().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
     editUserProfilePage.getSaveNUploadImageInnewRoomPage1().click();
     logger.info("image 1 uploaded successfully in newsroom");
     js.executeScript("window.scrollBy(0,200)", "");

     editUserProfilePage.getUploadImageInnewRoomPage2().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
     editUserProfilePage.getSaveNUploadImageInnewRoomPage2().click();
     logger.info("image 2 uploaded successfully in newsroom");
     editUserProfilePage.getFourthparaInNewsRoom().sendKeys("hello hello hello hello hello hello");
     logger.info("fourth para filled successfully");


     editUserProfilePage.getUploadImageInnewRoomPage3().sendKeys(imagepath+"\\DocumentsToUpload\\productimage.jpg");
     editUserProfilePage.getSaveNUploadImageInnewRoomPage3().click();
     logger.info("image 3 uploaded successfully in newsroom");

     js.executeScript("window.scrollBy(0,300)", "");

     editUserProfilePage.getSubmitInnewRoomPage().click();
     editUserProfilePage.getConfirmationInnewRoomPage().click();
     logger.info("news room page working successfully");

// Tax settings page
     driver.get("https://www.go4worldbusiness.com/member/console/settings/tax");
     Assert.assertEquals("GST Number","GST Number");
     driver.navigate().back();

     logger.info("tax setting page working fine");











































































































































    }


}
