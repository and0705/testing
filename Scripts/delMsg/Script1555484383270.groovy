import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/button_'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'ducanh.danny@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), '5ZA1H3XX8HdQX4Jso8XhsA==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp ca Danny'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Nhn tin trao i'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/textarea_xyz_message_content'), 'Xin')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/button_Gi'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/textarea_Xin_message_content'), 'Chao')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/button_Gi'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_xyz_fa fa-trash-o pr-3'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bạn chắc chắn muốn xóa tin nhắn này?', false)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/button_Xc nhn'))

