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

WebUI.sendKeys(findTestObject('Login/Page_PixelPop  Log in/button_Log in'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Media/button_Media'))

WebUI.click(findTestObject('Object Repository/Media/icn_EditMedia'))

WebUI.click(findTestObject('Object Repository/Media/button_Edit'))

WebUI.click(findTestObject('Object Repository/Media/btn_SaveConfirmation'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Media/tb_rename'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Media/tb_rename'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Media/tb_rename'), 'Hana is Doing Weekly Test')

WebUI.click(findTestObject('Media/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Media/button_Yes, Sure'))

WebUI.click(findTestObject('Object Repository/Media/button_Done'))

WebUI.comment('Renaming the file....')

WebUI.delay(3)

WebUI.verifyTextPresent('Hana is Doing Weekly Test', false)

WebUI.delay(3)

WebUI.click(findTestObject('Media/btn_PlayMedia'))

WebUI.delay(5)

WebUI.click(findTestObject('Media/btn_PlayMedia'))

WebUI.delay(2)

WebUI.navigateToUrl('https://wowlite.interadsdev.com/content')

WebUI.verifyTextPresent('Hana is Doing Weekly Test', false)

WebUI.closeBrowser()

