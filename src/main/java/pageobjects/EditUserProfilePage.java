package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserProfilePage {
    WebDriver driver;
    public EditUserProfilePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // objects for membership page
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[2]/ul/li[1]/a")
    WebElement editprofile;
    public WebElement getEditprofile()
    {
        return editprofile;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[1]/a")
    WebElement yourMembership;
    public WebElement getYourMembership()
    {
        return yourMembership;
    }

    @FindBy(css = "body > div:nth-child(10) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
    WebElement Company;
    public WebElement getCompany()
    {
        return Company;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[3]/a")
    WebElement Homepage;
    public WebElement getHomepage()
    {
        return Homepage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[4]/a")
    WebElement Products;
    public WebElement getProducts()
    {
        return Products;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[5]/a")
    WebElement BuyRequirements;
    public WebElement getBuyRequirements()
    {
        return BuyRequirements;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[6]/a")
    WebElement Management;
    public WebElement getManagement()
    {
        return Management;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[7]/a")
    WebElement Facilities;
    public WebElement getFacilities()
    {
        return Facilities;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[8]/a")
    WebElement Newsroom;
    public WebElement getNewsroom()
    {
        return Newsroom;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[9]/a")
    WebElement TaxSettings;
    public WebElement getTaxSettings()
    {
        return TaxSettings;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[5]/div/div/input[2]")
    WebElement AS_soon_As_new_buylead_posted;
    public WebElement getAS_soon_As_new_buylead_posted()
    {
        return AS_soon_As_new_buylead_posted;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[5]/div/div/input[3]")
    WebElement OnceEveryDay;
    public WebElement getOnceEveryDay()
    {
        return OnceEveryDay;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[5]/div/div/input[4]")
    WebElement OnceInEveryWeek;
    public WebElement getOnceInEveryWeek()
    {
        return OnceInEveryWeek;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[5]/div/div/input[5]")
    WebElement OnceINEveryMonth;
    public WebElement getOnceINEveryMonth()
    {
        return OnceINEveryMonth;
    }

    @FindBy(xpath = "/html/body/div[9]/div/div/div[2]/button")
    WebElement confirmationPopup;
    public WebElement getConfirmationPopup()
    {
        return confirmationPopup;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[7]/div/a")
    WebElement ProfileUrl;
    public WebElement getProfileUrl()
    {
        return ProfileUrl;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/form/div[1]/div[1]/div[1]/div/select")
    WebElement SelectDocumentsCategory;
    public WebElement getSelectDocumentsCategory()
    {
        return SelectDocumentsCategory;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/form/div[1]/div[1]/div[2]/div/select")
    WebElement SelectDocumentsName;
    public WebElement getSelectDocumentsName()
    {
        return SelectDocumentsName;
    }

    @FindBy(id = "MemberDocuments_attachmentFile_file")
    WebElement ChooseFilesToUpload;
    public WebElement getChooseFilesToUpload()
    {
        return ChooseFilesToUpload;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/form/div[2]/div[1]/div/button")
    WebElement AddUploadedDocument;
    public WebElement getAddUploadedDocument()
    {
        return AddUploadedDocument;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/div[1]/table/tbody/tr[1]/td[4]/a")
    WebElement DownloadDocument1;
    public WebElement getDownloadDocument1()
    {
        return DownloadDocument1;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/div[1]/table/tbody/tr[3]/td[4]/a")
    WebElement DownloadDocument2;
    public WebElement getDownloadDocument2()
    {
        return DownloadDocument2;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[9]/div[1]/table/tbody/tr[1]/td[5]/span/span")
    WebElement DeleteDocument1;
    public WebElement getDeleteDocument1()
    {
        return DeleteDocument1;
    }



    @FindBy(xpath = "/html/body/div[9]/div/div/div[2]/button[1]")
    WebElement ConfirmationToDelete;
    public WebElement getConfirmationToDelete()
    {
        return ConfirmationToDelete;
    }

    //Objects for company page

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/textarea")
    WebElement CompanyDetailsofSupplier;
    public WebElement getCompanyDetailsofSupplier()
    {
       return CompanyDetailsofSupplier;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/textarea")
    WebElement CompanyDetailsofBuyers;
    public WebElement getCompanyDetailsofBuyers()
    {
        return CompanyDetailsofBuyers;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/textarea")
    WebElement TradeServicesTextBox;
    public WebElement getTradeServicesTextBox()
    {
        return TradeServicesTextBox;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/select")
    WebElement PrimaryservicesSelect;
    public WebElement getPrimaryservicesSelect()
    {
        return PrimaryservicesSelect;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/input")
    WebElement EstablishmentYear;
    public WebElement getEstablishmentYear()
    {
        return EstablishmentYear;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div[1]/div/select")
    WebElement AnnualSalesSelect;
    public WebElement getAnnualSalesSelect()
    {
        return AnnualSalesSelect;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div[2]/div/input")
    WebElement CompanyCertificatins;
    public WebElement getCompanyCertificatins()
    {
        return CompanyCertificatins;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[8]/div[1]/div/input")
    WebElement NameField;
    public WebElement getNameField()
    {
        return NameField;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[8]/div[2]/div/input")
    WebElement DesignationField;
    public WebElement getDesignationField()
    {
        return DesignationField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[9]/textarea")
    WebElement AddressField;
    public WebElement getAddressField()
    {
        return AddressField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[10]/div[1]/div/input")
    WebElement CityNameField;
    public WebElement getCityNameField()
    {
        return CityNameField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[10]/div[2]/div/input")
    WebElement PostCodeField;
    public WebElement getPostCodeField()
    {
        return PostCodeField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[11]/div[1]/div/input")
    WebElement StateNameField;
    public WebElement getStateNameField()
    {
        return StateNameField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[12]/input")
    WebElement PhoneNumField;
    public WebElement getPhoneNumField()
    {
        return PhoneNumField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[13]/input")
    WebElement emailField;
    public WebElement getEmailField()
    {
        return emailField;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[14]/input")
    WebElement HomepageField;
    public WebElement getHomepageField()
    {
        return HomepageField;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[15]/div[2]/button")
    WebElement SubmitCompanyPage;
    public WebElement getSubmitCompanyPage()
    {
        return SubmitCompanyPage;
    }



    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfiramtionForCompanyPAGE;
    public WebElement getConfiramtionForCompanyPAGE()
    {
        return ConfiramtionForCompanyPAGE;
    }

    //Homepage objects

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[3]/a")
    WebElement HomepagePage;
    public WebElement getHomepagePage()
    {
        return HomepagePage;
    }

    @FindBy(id = "member_edit_homepage_logoUrl")
    WebElement UploadCompanyLogo;
    public WebElement getUploadCompanyLogo()
    {
        return UploadCompanyLogo;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[3]/div[2]/label[1]")
    WebElement SaveNuploadCompanyLogo;
    public WebElement getSaveNuploadCompanyLogo()
    {
        return SaveNuploadCompanyLogo;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/textarea")
    WebElement FirstParaAboutCompany;
    public WebElement getFirstParaAboutCompany()
    {
        return FirstParaAboutCompany;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[1]/div/textarea")
    WebElement SecondParaAboutCompany;
    public WebElement getSecondParaAboutCompany()
    {
        return SecondParaAboutCompany;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/textarea")
    WebElement ThirdParaAboutCompany;
    public WebElement getThirdParaAboutCompany()
    {
        return ThirdParaAboutCompany;
    }

    @FindBy(id = "member_edit_homepage_image1Url")
    WebElement UploadImage1;
    public WebElement getUploadImage1()
    {
        return UploadImage1;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div[2]/label[1]")
    WebElement SaveNuploadImage1;
    public WebElement getSaveNuploadImage1()
    {
        return SaveNuploadImage1;
    }


    @FindBy(id = "member_edit_homepage_image2Url")
    WebElement UploadImage2;
    public WebElement getUploadImage2()
    {
        return UploadImage2;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div[2]/label[1]")
    WebElement SaveNuploadImage2;
    public WebElement getSaveNuploadImage2()
    {
        return SaveNuploadImage2;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div/button")
    WebElement submitHomepage;
    public WebElement getSubmitHomepage()
    {
        return submitHomepage;
    }


    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfirmationForHomepage;
    public WebElement getConfirmationForHomepage()
    {
        return ConfirmationForHomepage;
    }


    //Products Page
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[4]/a")
    WebElement ProductPage;
    public WebElement getProductPage()
    {
        return ProductPage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/h4/a")
    WebElement AddnewProduct;
    public WebElement getAddnewProduct()
    {
        return AddnewProduct;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/input")
    WebElement NameofProduct;
    public WebElement getNameofProduct()
    {
        return NameofProduct;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/input")
    WebElement priceofProduct;
    public WebElement getpriceofProduct()
    {
        return priceofProduct;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div/textarea")
    WebElement DescriptionOfProduct;
    public WebElement getDescriptionOfProduct()
    {
        return DescriptionOfProduct;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement SaveAndUploadImageOfProduct;
    public WebElement getSaveAndUploadImageOfProduct()
    {
        return SaveAndUploadImageOfProduct;
    }



  /* @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div/div[1]/div[2]")
    WebElement AddProductImage;
    public WebElement getAddProductImage()
    {
        return AddProductImage;
    }*/



    @FindBy(id = "imageUploadedPreview_1")
    WebElement UploadImageOfProduct;
    public WebElement getUploadImageOfProduct()
    {
        return UploadImageOfProduct;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[1]/div/div[1]/div/input")
    WebElement MinimumOrderQuantity;
    public WebElement getMinimumOrderQuantity()
    {
        return MinimumOrderQuantity;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[1]/div/div[2]/div/select")
    WebElement Unit;
    public  WebElement getUnit()
    {
        return Unit;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[2]/div[1]/select")
    WebElement CountryWhereProductmanufactured;
    public WebElement getCountryWhereProductmanufactured()
    {
        return CountryWhereProductmanufactured;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[1]/div/div[4]/div[1]/input")
    WebElement PackagingDetails;
    public WebElement getPackagingDetails()
    {
        return PackagingDetails;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[2]/div[2]/div/div[1]/label")
    WebElement SampleAvailable;
    public WebElement getSampleAvailable()
    {
        return SampleAvailable;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[1]/div/div[4]/div[2]/input")
    WebElement ProductionCapacity;
    public WebElement getProductionCapacity()
    {
        return ProductionCapacity;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[7]/div[2]/div[3]/div/div[1]/label/input")
    WebElement SampleCostBornBy;
    public WebElement getSampleCostBornBy()
    {
        return SampleCostBornBy;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[8]/div[1]/div/input")
    WebElement SellerProductCode;
    public WebElement getSellerProductCode()
    {
        return SellerProductCode;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[8]/div[2]/div/input")
    WebElement ProductsStandards;
    public WebElement getProductsStandards()
    {
        return ProductsStandards;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[9]/div[1]/div/input")
    WebElement Brand;
    public WebElement getBrand()
    {
        return Brand;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[9]/div[2]/div[1]/input")
    WebElement ModelNumber;
    public WebElement getModelNumber()
    {
        return ModelNumber;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[9]/div[2]/div[2]/input")
    WebElement HScode;
    public WebElement getHScode()
    {
        return HScode;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[10]/div[1]/div/input")
    WebElement KeySpecification1;
    public WebElement getKeySpecification1()
    {
        return KeySpecification1;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[11]/div[1]/div/input")
    WebElement KeySpecification2;
    public WebElement getKeySpecification2()
    {
        return KeySpecification2;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[10]/div[2]/div/input")
    WebElement KeySpecification3;
    public WebElement getKeySpecification3()
    {
        return KeySpecification3;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[11]/div[2]/div/input")
    WebElement KeySpecification4;
    public WebElement getKeySpecification4()
    {
        return KeySpecification4;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[12]/div[1]/div/input")
    WebElement KeySpecification5;
    public WebElement getKeySpecification5()
    {
        return KeySpecification5;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[13]/div[1]/div/input")
    WebElement KeySpecification6;
    public WebElement getKeySpecification6()
    {
        return KeySpecification6;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[12]/div[2]/div/input")
    WebElement KeySpecification7;
    public WebElement getKeySpecification7()
    {
        return KeySpecification7;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[13]/div[2]/div/input")
    WebElement KeySpecification8;
    public WebElement getKeySpecification8()
    {
        return KeySpecification8;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[14]/button")
    WebElement SubmitProductPage;
    public WebElement getSubmitProductPage()
    {
        return SubmitProductPage;
    }

    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfirmationOFproductPage;
    public WebElement getConfirmationOFproductPage()
    {
        return ConfirmationOFproductPage;
    }
// management page


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[6]/a")
    WebElement ManagementPage;
    public WebElement getManagementPage()
    {
        return ManagementPage;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/textarea")
    WebElement para1ManagementPage;
    public WebElement getPara1ManagementPage()
    {
        return para1ManagementPage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/textarea")
    WebElement para2ManagementPage;
    public WebElement getPara2ManagementPage()
    {
        return para2ManagementPage;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[1]/div/textarea")
    WebElement para3ManagementPage;
    public WebElement getPara3ManagementPage()
    {
        return para3ManagementPage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/textarea")
    WebElement para4ManagementPage;
    public WebElement getPara4ManagementPage()
    {
        return para4ManagementPage;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div/button")
    WebElement submitManagementPage;
    public WebElement getSubmitManagementPage()
    {
        return submitManagementPage;
    }
    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfirmationManagementPage;
    public WebElement getConfirmationManagementPage()
    {
        return ConfirmationManagementPage;
    }

    //member_edit_management_memo1Img

    @FindBy(id = "member_edit_management_memo1Img")
    WebElement UploadimageinManagementpage;
    public WebElement getUploadimageinManagementpage()
    {
        return UploadimageinManagementpage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadimageinManagementpage;
    public WebElement getSaveNUploadimageinManagementpage()
    {
        return SaveNUploadimageinManagementpage;
    }


    @FindBy(id = "member_edit_management_memo2Img")
    WebElement UploadimageinManagementpage2;
    public WebElement getUploadimageinManagementpage2()
    {
        return UploadimageinManagementpage2;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadimageinManagementpage2;
    public WebElement getSaveNUploadimageinManagementpage2()
    {
        return SaveNUploadimageinManagementpage2;
    }


    @FindBy(id = "member_edit_management_memo3Img")
    WebElement UploadimageinManagementpage3;
    public WebElement getUploadimageinManagementpage3()
    {
        return UploadimageinManagementpage3;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadimageinManagementpage3;
    public WebElement getSaveNUploadimageinManagementpage3()
    {
        return SaveNUploadimageinManagementpage3;
    }

    // objects for facilities


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[7]/a")
    WebElement FacilitiesPage;
    public WebElement getFacilitiesPage()
    {
        return FacilitiesPage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div/div[2]/label/input")
    WebElement QualityControl;
    public WebElement getQualityControl()
    {
        return QualityControl;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div[1]/select")
    WebElement ProductionType;
    public WebElement getProductionType()
    {
        return ProductionType;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[1]/div[2]/div[2]/input")
    WebElement ProductionLines;
    public WebElement getProductionLines()
    {
        return ProductionLines;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/div/div[2]/label/input")
    WebElement OEM;
    public WebElement getOEM()
    {
        return OEM;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div[1]/select")
    WebElement InvestmentOnManufacturing;
    public WebElement getInvestmentOnManufacturing()
    {
        return InvestmentOnManufacturing;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/div[2]/div[2]/select")
    WebElement percentageOfrevenueInvested;
    public WebElement getPercentageOfrevenueInvested()
    {
        return percentageOfrevenueInvested;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div[1]/select")
    WebElement TotalStaff;
    public WebElement getTotalStaff()
    {
        return TotalStaff;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div[1]/select")
    WebElement StaffProduction;
    public WebElement getStaffProduction()
    {
        return StaffProduction;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div[2]/select")
    WebElement StaffQualityControl;
    public WebElement getStaffQualityControl()
    {
        return StaffQualityControl;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div[2]/select")
    WebElement StaffRND;
    public WebElement getStaffRND()
    {
        return StaffRND;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div[3]/select")
    WebElement StaffSalesNmarketing;
    public WebElement getStaffSalesNmarketing()
    {
        return StaffSalesNmarketing;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div[3]/select")
    WebElement Staffengineering;
    public WebElement getStaffengineering()
    {
        return Staffengineering;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[1]/div/textarea")
    WebElement FacilitiesSiteDescription;
    public WebElement getFacilitiesSiteDescription()
    {
        return FacilitiesSiteDescription;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/textarea")
    WebElement MachineryNproducion;
    public WebElement getMachineryNproducion()
    {
        return MachineryNproducion;
    }



    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div/button")
    WebElement SubmitFacilitiesPage;
    public WebElement getSubmitFacilitiesPage()
    {
        return SubmitFacilitiesPage;
    }

    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfirmationFacilitiesPage;
    public WebElement getConfirmationFacilitiesPage()
    {
        return ConfirmationFacilitiesPage;
    }


    @FindBy(id = "member_edit_facilities_imageUrl")
    WebElement UploadImageInFacilitiesPage;
    public WebElement getUploadImageInFacilitiesPage()
    {
        return UploadImageInFacilitiesPage;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadImageInFacilitiesPage;
    public WebElement getSaveNUploadImageInFacilitiesPage()
    {
        return SaveNUploadImageInFacilitiesPage;
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/textarea")
    WebElement MaterialsNcomponents;
    public WebElement getMaterialsNcomponents()
    {
        return MaterialsNcomponents;
    }

// newsroom page objects
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]/div/ul/li[8]/a")
    WebElement NewsRoom;
    public WebElement getNewsRoom()
    {
        return NewsRoom;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[2]/textarea")
    WebElement FirstparaInNewsRoom;
    public WebElement getFirstparaInNewsRoom()
    {
        return FirstparaInNewsRoom;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/textarea")
    WebElement SecondparaInNewsRoom;
    public WebElement getSecondparaInNewsRoom()
    {
        return SecondparaInNewsRoom;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[1]/div/textarea")
    WebElement ThirdparaInNewsRoom;
    public WebElement getThirdparaInNewsRoom()
    {
        return ThirdparaInNewsRoom;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/textarea")
    WebElement FourthparaInNewsRoom;
    public WebElement getFourthparaInNewsRoom()
    {
        return FourthparaInNewsRoom;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[6]/div/button")
    WebElement SubmitInnewRoomPage;
    public WebElement getSubmitInnewRoomPage()
    {
        return SubmitInnewRoomPage;
    }

    @FindBy(xpath = "/html/body/div[9]/div/div/div[3]/button[2]")
    WebElement ConfirmationInnewRoomPage;
    public WebElement getConfirmationInnewRoomPage()
    {
        return ConfirmationInnewRoomPage;
    }


    @FindBy(id = "member_edit_newsroom_memo1Img")
    WebElement UploadImageInnewRoomPage1;
    public WebElement getUploadImageInnewRoomPage1()
    {
        return UploadImageInnewRoomPage1;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadImageInnewRoomPage1;
    public WebElement getSaveNUploadImageInnewRoomPage1()
    {
        return SaveNUploadImageInnewRoomPage1;
    }

    @FindBy(id = "member_edit_newsroom_memo2Img")
    WebElement UploadImageInnewRoomPage2;
    public WebElement getUploadImageInnewRoomPage2()
    {
        return UploadImageInnewRoomPage2;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[4]/div[2]/div/div[2]/label[1]")
    WebElement SaveUploadImageInnewRoomPage2;
    public WebElement getSaveNUploadImageInnewRoomPage2()
    {
        return SaveUploadImageInnewRoomPage2;
    }



    @FindBy(id = "member_edit_newsroom_memo3Img")
    WebElement UploadImageInnewRoomPage3;
    public WebElement getUploadImageInnewRoomPage3()
    {
        return UploadImageInnewRoomPage3;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/div[2]/label[1]")
    WebElement SaveNUploadImageInnewRoomPage3;
    public WebElement getSaveNUploadImageInnewRoomPage3()
    {
        return SaveNUploadImageInnewRoomPage3;
    }























































































































}
