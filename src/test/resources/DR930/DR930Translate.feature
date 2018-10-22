Feature:Test translation on dr930

  /**
  * Created by poppy zhang on 2018/10/10.
  */

  @930
  Scenario Outline: Test translation function on device dr930
    Given Set up testing environment on <Platform> for deebot <deebotType>
    When Choose <Country> as login country on <Platform>
    And Input <Email> and <Password> and click login button
    Then Check login succeed on <Platform>
    And Select <language> for translation on <Platform>
    And Translate guide page for <language> on <Platform> for deebot <deebotType>
    And Translate clean page for <language> on <Platform> for deebot <deebotType>
    And Translate error page for <language> on <Platform> for deebot <deebotType>
    And Translate more page for <language> on <Platform> for deebot <deebotType>
    And Tear down
    Examples:
      | Platform | Country | Email       | Password | language | deebotType |
#      | android  | 中国      | 13402516615 | 12345678 | zh-CN中文  | dr930      |
#      | android  | 中国      | 13402516615 | 12345678 | en英文     | dr930      |
#      | android  | 中国      | 13402516615 | 12345678     | de-DE德文   |dr930      |
#      | android  | 中国      | 13402516615 | 12345678     | fr-FR法文   |dr930      |
#      | android  | 中国      | 13402516615 | 12345678     | he-IL希伯来文 |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | it-IT意大利文 |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | ja-JP日文   |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | ko-KR韩文   |dr930      |
#      | android  | 中国      | 13402516615 | 12345678 | ms-MY马来文 | dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | pt-PT葡萄牙文 |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | ru-RU俄文   |dr930      |
      | android  | 中国      | 13402516615 | 12345678    | th-TH泰文   |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | zh-TW繁体中文 |dr930      |
#      | android  | 中国      | 13402516615 | 12345678    | es-ES西班牙文 |dr930      |
      #| ios      | 中国      | 13402516615 | 12345678  |zh-CN中文|dr930      |
      #| ios  | 中国      | 13402516615 | 12345678 | en英文      |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | de-DE德文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678 | fr-FR法文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | he-IL希伯来文 |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | it-IT意大利文 |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | ja-JP日文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | ko-KR韩文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | ms-MY马来文  |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | pt-PT葡萄牙文 |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | ru-RU俄文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | th-TH泰文   |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | zh-TW繁体中文 |dr930      |
      #| ios  | 中国      | 13402516615 | 12345678  | es-ES西班牙文 |dr930      |


