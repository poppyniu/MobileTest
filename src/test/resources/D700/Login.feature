Feature:Test login function on global app

  /**
  * Created by poppy zhang on 2018/8/9.
  */

  @Login
  Scenario Outline: Test login function on global app
    Given Set up testing environment on <Platform>
    When Choose <Country> as login country on <Platform>
    And Input <Email> and <Password> and click login button
    Then Check login succeed on <Platform>
    Examples:
      | Platform | Country | Email            | Password       |
      | android  | 美国 | 825794516@qq.com | zxw15259562596 |






