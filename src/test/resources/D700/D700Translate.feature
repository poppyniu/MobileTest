Feature:Test translation on d700

  /**
  * Created by poppy zhang on 2018/8/9.
  */

  @Translation
  Scenario Outline: Test translation function on device d700
    Given Set up testing environment on <Platform>
    When Choose <Country> as login country on <Platform>
    And Input <Email> and <Password> and click login button
    Then Check login succeed on <Platform>
    And Select <language> and check translation result on <Platform> for deebot <deebotType>
    And Tear down
    Examples:
      | Platform | Country | Email            | Password | language  |deebotType|
      | android  | 美国      | 376690275@qq.com | 665259   | zh-CN中文   |dr930     |
#      | android  | 美国      | 376690275@qq.com | 665259   | en英文      |
#      | android  | 美国      | 376690275@qq.com | 665259   | de-DE德文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | fr-FR法文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | he-IL希伯来文 |
#      | android  | 美国      | 376690275@qq.com | 665259   | it-IT意大利文 |
#      | android  | 美国      | 376690275@qq.com | 665259   | ja-JP日文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | ko-KR韩文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | ms-MY马来文  |
#      | android  | 美国      | 376690275@qq.com | 665259   | pt-PT葡萄牙文 |
#      | android  | 美国      | 376690275@qq.com | 665259   | ru-RU俄文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | th-TH泰文   |
#      | android  | 美国      | 376690275@qq.com | 665259   | zh-TW繁体中文 |
#      | android  | 美国      | 376690275@qq.com | 665259   | es-ES西班牙文 |
      #| ios      | 美国      | 825794516@qq.com | zxw15259562596 |zh-CN中文|
      #| ios  | 美国      | 376690275@qq.com | 665259 | en英文      |
      #| ios  | 美国      | 376690275@qq.com | 665259 | de-DE德文   |
      #| ios  | 美国      | 376690275@qq.com| 665259 | fr-FR法文   |
      #| ios  | 美国      | 376690275@qq.com | 665259 | he-IL希伯来文 |
      #| ios  | 美国      | 376690275@qq.com | 665259 | it-IT意大利文 |
      #| ios  | 美国      | 376690275@qq.com | 665259 | ja-JP日文   |
      #| ios  | 美国      | 376690275@qq.com | 665259 | ko-KR韩文   |
      #| ios  | 美国      | 376690275@qq.com | 665259 | ms-MY马来文  |
      #| ios  | 美国      | 376690275@qq.com | 665259 | pt-PT葡萄牙文 |
      #| ios  | 美国      | 376690275@qq.com | 665259 | ru-RU俄文   |
      #| ios  | 美国      | 376690275@qq.com| 665259 | th-TH泰文   |
      #| ios  | 美国      | 376690275@qq.com | 665259 | zh-TW繁体中文 |
      #| ios  | 美国      | 376690275@qq.com | 665259 | es-ES西班牙文 |


  @Translation1
  Scenario Outline: Test translation function on device d700 without reinstall app
    Given Set up testing environment on <Platform>
    When Select language and check translation result on <Platform> for deebot <deebotType>
    And Tear down
    Examples:
      | Platform |
      | ios      |

