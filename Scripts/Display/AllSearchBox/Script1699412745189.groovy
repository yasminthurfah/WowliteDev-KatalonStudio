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

WebUI.click(findTestObject('Display/btn_Display'))

WebUI.setText(findTestObject('Display/tb_SerialDisplay'), 'QQ')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Display/tb_SerialDisplay'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('QQEM1NYY', false)

WebUI.sendKeys(findTestObject('Display/tb_SerialDisplay'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Display/tb_SerialDisplay'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Display/tb_DisplayName'), '43')

WebUI.sendKeys(findTestObject('Display/tb_DisplayName'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.verifyTextPresent('TV 43', false)

WebUI.sendKeys(findTestObject('Display/tb_DisplayName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Display/tb_DisplayName'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.setText(findTestObject('Display/tb_MediaDisplay'), 'Burger')

WebUI.sendKeys(findTestObject('Display/tb_MediaDisplay'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.verifyTextPresent('Nikmati Burger', false)

WebUI.closeBrowser()

