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
    And Select language and check translation result on <Platform>
    And Tear down
    Examples:
      | Platform | Country | Email            | Password       |
#      | android  | 美国      | 825794516@qq.com | zxw15259562596 |
      | ios      | 美国      | 825794516@qq.com | zxw15259562596 |


  @Translation1
  Scenario Outline: Test translation function on device d700 without reinstall app
    Given Set up testing environment on <Platform>
    When Select language and check translation result on <Platform>
    And Tear down
    Examples:
      | Platform |
      | ios      |

