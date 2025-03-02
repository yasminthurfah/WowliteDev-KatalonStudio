import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wowlite.interadsdev.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login/Page_PixelPop  Log in/tb_email'), 'support@interads.co.id')

WebUI.setEncryptedText(findTestObject('Login/Page_PixelPop  Log in/tb_password'), 'WW3Ab+tQiGeiQoi8glKYAQ==')

WebUI.click(findTestObject('Login/Page_PixelPop  Log in/button_Log in'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Dashboard/img_pixelpopheader'), 0)

WebUI.click(findTestObject('Media/btn_Media'))

WebUI.click(findTestObject('Media/btn_uploadmedia'))

WebUI.uploadFile(findTestObject('Media/btn_uploadmedia_inside'), 'C:\\Users\\lapto\\OneDrive\\Documents\\Pediasure - Nutrisi Tepat Dukung Pertumbuhan Nyata si Kecil!.mp4')

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Media/alt_Uploadsuccess'), 0)

